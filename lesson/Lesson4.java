package lesson;

public class Lesson4 {
	
	public static void mainTask(){
		
		System.out.println( "#### Task 1.3 ####" );
		boolean found2 = false, found3 = false, found4 = false;
		boolean qwe;
		// opt 1
		int[] danil = new int[]{ -1, -1, -1};
		
		// opt 2
		int[] danil2 = new int[3];
		for( int i = 0; i < danil2.length ; i++ ){
			danil2[i] = -1;
		}

		System.out.println( danil[1] );
		
		for( int i = 0; i < 100 ; i++) {
			double d = Math.random();
			d = d * 3 + 2;
			int j = (int) d;
			if(!found2 && j == 2) {
				danil[0] = i + 1;
				found2 = true;
			}
			else if( j == 3) danil[1] = i + 1;
			else danil[2] = i + 1;
		}
		System.out.println( "2 первый раз выпала на " + danil[0] + " итерации." );
		System.out.println( "3 последний раз выпала на " + danil[1] + " итерации." );
		System.out.println( "4 последний раз выпала на " + danil[2] + " итерации." );
		qwe = true;
		System.out.println( qwe );
	}
}
