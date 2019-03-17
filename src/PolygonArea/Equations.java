package PolygonArea;

import java.util.List;

public class Equations {
	static double areaOfTriangle(double[] firstPoint,double[] secondPoint,double[] thirdPoint ){
		double area = Math.abs((firstPoint[0]*(secondPoint[1]-thirdPoint[1])+secondPoint[0]*(thirdPoint[1]-firstPoint[1])+thirdPoint[0]*(firstPoint[1]-secondPoint[1]))/2);
		return area;
	
	}
	static double distanceBetweenTwoPoints(Point firstPoint, Point secondPoint){
		double distance = 0;
		//sqrt((x1-x2)^2 - (y1-y2)^2))
		distance = Math.sqrt(Math.pow((firstPoint.getX()-secondPoint.getX()),2)-Math.pow((firstPoint.getY()-secondPoint.getY()),2));
		return distance;
	}
	
	public double pointSideFromLine(int[] firstPoint, int[] secondPoint, int thirdPoint[]){
		
		double position = Math.abs((secondPoint[0] - firstPoint[0]) * (thirdPoint[1] - firstPoint[1]) - (secondPoint[1] - firstPoint[1]) * (thirdPoint[0] - firstPoint[0]));
		return position;
		
		
	}
	static double areaOfTriangle(Point firstPoint,Point secondPoint,Point thirdPoint ){
		double area = Math.abs((firstPoint.getX()*(secondPoint.getY()-thirdPoint.getY())+secondPoint.getX()*(thirdPoint.getY()-firstPoint.getY())+thirdPoint.getX()*(firstPoint.getY()-secondPoint.getY()))/2);
		return area;
	}
	
	
	
	
	public static double calculateAreaOfConvexPolygon(List<Point> points) {
		double areaOfPolygon = 0;
		Point firstPoint = points.get(0);
		for (int i = 2; i < points.size()-2; i++) {
			Point secondPoint = points.get(i-1);
			Point thirdPoint = points.get(i);
			areaOfPolygon += areaOfTriangle(firstPoint, secondPoint, thirdPoint);
			
		}
		
		
		
		return areaOfPolygon;
	}
}
