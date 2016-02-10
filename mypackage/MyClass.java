package mypackage;

import lesson.oop.lesson2.AnimalRun;

import java.util.Arrays;

public class MyClass {
	
	public static void main( String ... args ) {
		AnimalRun.run();
		
	}
	
	static double func( double x ) {
		double y = 0;
		if( x <= -10 ) {
			y = Math.pow( Math.sin( 3 * x ) , 2 );
		}
		if( -10 < x && x <= 5 ) {
			y = Math.pow( x, 3 ) + Math.pow( x , 1/(double)2 );
		}
		if( 5 < x ) {
			y = x;
		}
		return y;
	}
	
	static void homework0() {
		double r=4;
		double z=func(r);
		System.out.println( "x = " + r + ", y = " + z);
		r=-11;
		z=func(r);
		System.out.println( "x = " + r + ", y = " + z);
	}
	static void homework1() {
		// Вывести сумму чётных чисел от 20 до 35
		int sum = 0;
		for( int i = 1 ; i <= 10 ; i++ ) {
			sum = sum + ( i * i );
		}
		//System.out.println( sum );
		
		String s="hello";
		System.out.println(s.indexOf('e'));
		
	}
	
}