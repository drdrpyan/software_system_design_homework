package fs.type;

import fs.type.Point;

/**
 * 이동하는 좌표값.
 * 오목 게임판을 탐색하는 반복자로 이용.
 */
public class PointIterator extends Point {
	
	public PointIterator(Point startPoint) {
		super(startPoint);
	}
	
	public PointIterator(int startX, int startY) {
		super(startX, startY);
	}

	public PointIterator move(int distanceX, int distanceY) {
		setX(getX() + distanceX);
		setY(getY() + distanceY);
		return this;
	}
	
	public PointIterator moveX(int distance) {
		move(distance, 0);
		return this;
	}
	
	public PointIterator moveY(int distance) {
		move(0, distance);
		return this;
	}

//	public PointIterator verticalNext() {
//		currentLocation.setY(currentLocation.getY()+1);
//		return this;
//	}
//	
//	public PointIterator verticalPrevious() {
//		currentLocation.setY(currentLocation.getY()-1);
//		return this;
//	}
//	
//	public PointIterator horizontalNext() {
//		currentLocation.setX(currentLocation.getX()+1);
//		return this;
//	}
//	
//	public PointIterator horizontalPrevious() {
//		currentLocation.setX(currentLocation.getX()-1);
//		return this;
//	}
//	
//	public PointIterator positiveGradientNext() {
//		verticalNext();
//		horizontalNext();
//		return this;
//	}
//	
//	public PointIterator positiveGradientPrevious() {
//		verticalPrevious();
//		horizontalPrevious();
//		return this;
//	}
//	
//	public PointIterator negativeGradientNext() {
//		verticalNext();
//		horizontalPrevious();
//		return this;
//	}
//	
//	public PointIterator negativeGradientPrevious() {
//		verticalPrevious();
//		horizontalPrevious();
//		return this;
//	}
//	
//	public PointIterator next(Orientation orientation) {
//		switch(orientation) {
//		case VERTICAL:
//			return verticalNext();
//		case HORIZONTAL:
//			return horizontalNext();
//		case POSITIVE_GRADIENT:
//			return positiveGradientNext();
//		case NEGATIVE_GRADIENT:
//			return negativeGradientNext();
//		}
//		return null;
//	}
//	
//	public PointIterator previous(Orientation orientation) {
//		switch(orientation) {
//		case VERTICAL:
//			return verticalPrevious();
//		case HORIZONTAL:
//			return horizontalPrevious();
//		case POSITIVE_GRADIENT:
//			return positiveGradientPrevious();
//		case NEGATIVE_GRADIENT:
//			return negativeGradientPrevious();
//		}
//		return null;
//	}
}
