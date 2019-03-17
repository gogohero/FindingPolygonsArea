package PolygonArea;

import java.util.ArrayList;
import java.util.List;

public class StartPoint {
	public static void main(String[] args){
		double[][] coordinates = { 
		{31, 22},
		{23, 30}, 
		{50, 25}, 
		{60, 30},
		{55, 35}
         };
//		double[] firstPoint = getPoint(0,coordinates);
//		double[] secondPoint = getPoint(1,coordinates);
//		double[] thirdPoint =getPoint(2,coordinates);
//		double[] fourthPoint =getPoint(3,coordinates);
		
		
		
		 
		double area = Equations.calculateAreaOfConvexPolygon(createPolygonFromMatrix(coordinates));
		System.out.println(area);
	}

	
	
	
	
	static List<Point> createPolygonFromMatrix(double[][] coordinates){
		 List<Point> polygon = new ArrayList<Point>();
		 for (int i = 0; i < coordinates.length; i++) {
			 polygon.add(new Point(coordinates[i][0],coordinates[i][1]));
		}
		 
		return polygon;
	}
	
	static double areaOfTriangle(double[] firstPoint,double[] secondPoint,double[] thirdPoint ){
		double area = Math.abs((firstPoint[0]*(secondPoint[1]-thirdPoint[1])+secondPoint[0]*(thirdPoint[1]-firstPoint[1])+thirdPoint[0]*(firstPoint[1]-secondPoint[1]))/2);
		return area;
	}
	static double[] getPoint(int pointIndex, double[][] matrix){
		double[] pointArray = new double[2];
		pointArray[0]= matrix[pointIndex][0];
		pointArray[1]= matrix[pointIndex][1];
		 
		return pointArray;
		
	}
	static double distanceBetweenTwoPoints(int[] firstPoint, int[] secondPoint){
		double distance = 0;
		//sqrt((x1-x2)^2 - (y1-y2)^2))
		distance = Math.sqrt(Math.pow((firstPoint[0]-secondPoint[0]),2)-Math.pow((firstPoint[1]-secondPoint[1]),2));
		return distance;
	}
	
	public double PointSideFromLine(int[] firstPoint, int[] secondPoint, int thirdPoint[]){
		
		double position = Math.abs((secondPoint[0] - firstPoint[0]) * (thirdPoint[1] - firstPoint[1]) - (secondPoint[1] - firstPoint[1]) * (thirdPoint[0] - firstPoint[0]));
		return position;
		
		
	}
	
	 
}
	
