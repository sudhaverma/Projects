/**
 * Closest pair problem - The closest pair of points problem or closest pair problem is a problem of computational geometry: given n points in metric space, find a pair of points with
 *  the smallest distance between them.
 * @author sudha
 */

package com.projects.ClassicAlgorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * sample inputs {2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}
 */
class Points
{
	public static final Comparator<Points> X_ORDER = new XOrder();
	public static final Comparator<Points> Y_ORDER = new YOrder();
	double x;
	double y;
	public Points(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double compareX(Points p, Points q)
	{	
	return p.x - q.x;	
	}
	public double compareY(Points p, Points q)
	{
		return p.y - q.y;	
	}
	public static float distance(Points p, Points q)
	{
		return (float) Math.sqrt((p.x - q.x) * (p.x - q.x) - (p.y -q.y) * (p.y - q.y)); 
	}
	// compare points according to their x-coordinate
     static class XOrder implements Comparator<Points> {
        public int compare(Points p, Points q) {
            if (p.x < q.x) return -1;
            if (p.x > q.x) return +1;
            return 0;
        }
    }
     static class YOrder implements Comparator<Points> {
        public int compare(Points p, Points q) {
            if (p.y < q.y) return -1;
            if (p.y > q.y) return +1;
            return 0;
        }
    }
}


public class ClosestPairProblem {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total points :");
		int N = sc.nextInt();
		Points point[] = new Points[N];
		System.out.println("Enter x,y points :");
		for(int i = 0 ;i < N ; i++)
		{
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			point[i] = new Points(x,y);
		}
		
		System.out.println("Smallest distance between the points are "+ closest(point , N));
	}

	private static float closest(Points[] point, int n) {
		// Computes the points with minimum distance between them in the given plane
		Points px[] = new Points[n];
		Points py[] = new Points[n];
		
		for(int i = 0; i < n; i++)
		{
			px[i] = point[i];
			py[i] = point[i];
		}
		Arrays.sort(px, Points.X_ORDER);
		Arrays.sort(py, Points.Y_ORDER);
		
		return closeUtil(px, py, n);	
	}
	
	// A utility function to find minimum of two float values
	static float min(float x, float y)
	{
	    return (x < y)? x : y;
	}
	
	// A Brute Force method to return the smallest distance between two points
	// in P[] of size n
	static float bruteForce(Points P[], int n)
	{
	    float min = Float.MAX_VALUE;
	    for (int i = 0; i < n; ++i)
	        for (int j = i+1; j < n; ++j)
	            if (Points.distance(P[i], P[j]) < min)
	                min = Points.distance(P[i], P[j]);
	    return min;
	}
	static float stripClosest(Points strip[], int size, float d)
	{
	    float min = d;  // Initialize the minimum distance as d
	 
	    // Pick all points one by one and try the next points till the difference
	    // between y coordinates is smaller than d.
	    // This is a proven fact that this loop runs at most 6 times
	    for (int i = 0; i < size; ++i)
	        for (int j = i+1; j < size && (strip[j].y - strip[i].y) < min; ++j)
	            if (Points.distance(strip[i],strip[j]) < min)
	                min = Points.distance(strip[i], strip[j]);
	 
	    return min;
	}

	private static float closeUtil(Points[] px, Points[] py, int n) {
		// Recursive function to find minimum dist between points using array px which contains all the points sorted by x coordinate and py array containing all the points sorted by y coordiante
		
		if(n < 3)
			return bruteForce(px,n);
		
		int mid = n/2;
		Points midPoint = px[mid];
		
		 Points Pyl[] = new Points[mid];   // y sorted points on left of vertical line
		    Points Pyr[] = new Points[n-mid];  // y sorted points on right of vertical line
		    int li = 0, ri = 0;  // indexes of left and right subarrays
		    for (int i = 0; i < n; i++)
		    {
		      if (py[i].x <= midPoint.x)
		         Pyl[li++] = py[i];
		      else
		         Pyr[ri++] = py[i];
		    }
		    // Consider the vertical line passing through the middle point
		    // calculate the smallest distance dl on left of middle point and
		    // dr on right side
		    float dl = closeUtil(px, Pyl,mid );
		    float dr = closeUtil(px, Pyr, n-mid);
		 // Find the smaller of two distances
		    float d = min(dl, dr);
		 
		    // Build an array strip[] that contains points close (closer than d)
		    // to the line passing through the middle point
		    Points strip[] = new Points[n];
		    int j = 0;
		    for (int i = 0; i < n; i++)
		        if (Math.abs(py[i].x - midPoint.x) < d)
		            strip[j] = py[i];
		            j++;
		 
		    // Find the closest points in strip.  Return the minimum of d and closest
		    // distance is strip[]
		    return min(d, stripClosest(strip, j, d) );
	}
}
