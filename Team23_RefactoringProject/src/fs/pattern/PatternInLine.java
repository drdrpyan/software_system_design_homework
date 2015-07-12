package fs.pattern;

import java.util.ArrayList;
import java.util.List;

import fs.type.CellState;
import fs.type.StoneType;

/**
 * 일렬로 나열된 패턴
 */
public class PatternInLine {
	StoneType basisColor;
	CellState[] patternInLine;
	
	/**
	 * @param color 기준이 되는 돌의 색
	 * @param pattern 패턴
	 */
	public PatternInLine(StoneType basisColor, CellState... pattern) {
		this.basisColor = basisColor;
		
		patternInLine = new CellState[pattern.length];
		for(int i=0; i<pattern.length; i++)
			patternInLine[i] = pattern[i];
	}

	/**
	 * @return 패턴의 길이
	 */
	public int getLength() {
		return patternInLine.length;
	}
	
	/**
	 * @param index 패턴 내의 인덱스. 0부터 시작
	 * @return 패턴 내부의 index위치에 존재하는  값을 반환
	 */
	public CellState at(int index) {
		return patternInLine[index];
	}
	
	/**
	 * 기준 색을 기준으로 한 패턴을 얻는데 쓰인다.
	 * @param basisColor 패턴의 기준이 될 돌의 색상
	 * @return 기존 패턴의 기준 색이 받은 인자와 같다면 그대로 리턴, 아니면 색상을 뒤집은 새로운 패턴을 리턴
	 */
	public PatternInLine getPattern(StoneType basisColor) {
		if(basisColor == this.basisColor)
			return this;
		else
			return getReverseColorPattern();
	}
	
	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(int i=0; i<patternInLine.length; i++)
			string.append(patternInLine[i].toString());
		return string.toString();
	}
	
	/**
	 * @return 색상이 뒤집힌 새로운 패턴
	 */
	private PatternInLine getReverseColorPattern() {
		CellState[] reverseColor = new CellState[getLength()];
		
		for(int i=0; i<getLength(); i++) {
			switch(patternInLine[i]) {
			case BLACK:
				reverseColor[i] = CellState.WHITE;
				break;
			case WHITE:
				reverseColor[i] = CellState.BLACK;
				break;
			default:
				reverseColor[i] = CellState.EMPTY;
			}
		}
		return new PatternInLine(basisColor.getOppositeColorStone(), reverseColor);
	}
}
