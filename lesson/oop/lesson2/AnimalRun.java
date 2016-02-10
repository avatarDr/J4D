package lesson.oop.lesson2;

import javafx.geometry.Point3D;

public class AnimalRun {
	
	public static void run() {
		Point3D loc = new Point3D( 1, 2, 3 );
		
		Animal horse = new Animal( "horse", false, loc );
		Animal coon = new Animal( "raccoon" );
		
		outln( "Horse started its way at " + horse.location );
		
		horse.moveTo( 5, 7, -8 );
		outln( "Then horse moved to " + horse.location );
		
		Animal.moveTo( horse, new Point3D( 1, 3, 7 ) );
		outln( "Finally, horse found itself staying at " +horse.location );
		out( "But we don't like this format, so we use our own: " );
		outln( "Horse is at " + getFineLocString( horse.location ) + " now." );
		
		outln( "\n# Animal info: " );
		outln( "Horse: " + horse.kind + ", predator = " + horse.predator );
		outln( "Horse location: " + horse.location );
		outln( "Look at our horse: " + horse );
		outln( "Here is the coon of kind: " + coon.kind );
	}
	
	public static String getFineLocString( Point3D location ) {
		return "[x=" + location.getX() + ",y=" + location.getY() + ",z=" + location.getZ() + "]";
	}
	
	public static void out(String s){ System.out.print(s); }
	public static void outln(String s){ System.out.println(s); }
}
