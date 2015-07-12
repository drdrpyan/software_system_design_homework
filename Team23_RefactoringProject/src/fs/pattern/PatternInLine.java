package fs.pattern;

import java.util.ArrayList;
import java.util.List;

import fs.type.CellState;
import fs.type.StoneType;

/**
 * �Ϸķ� ������ ����
 */
public class PatternInLine {
	StoneType basisColor;
	CellState[] patternInLine;
	
	/**
	 * @param color ������ �Ǵ� ���� ��
	 * @param pattern ����
	 */
	public PatternInLine(StoneType basisColor, CellState... pattern) {
		this.basisColor = basisColor;
		
		patternInLine = new CellState[pattern.length];
		for(int i=0; i<pattern.length; i++)
			patternInLine[i] = pattern[i];
	}

	/**
	 * @return ������ ����
	 */
	public int getLength() {
		return patternInLine.length;
	}
	
	/**
	 * @param index ���� ���� �ε���. 0���� ����
	 * @return ���� ������ index��ġ�� �����ϴ�  ���� ��ȯ
	 */
	public CellState at(int index) {
		return patternInLine[index];
	}
	
	/**
	 * ���� ���� �������� �� ������ ��µ� ���δ�.
	 * @param basisColor ������ ������ �� ���� ����
	 * @return ���� ������ ���� ���� ���� ���ڿ� ���ٸ� �״�� ����, �ƴϸ� ������ ������ ���ο� ������ ����
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
	 * @return ������ ������ ���ο� ����
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
