package lesson;

public class Lesson16_1 {
	
	public void run(){
		int d = 0;
		
		for (int k=0; k < 100; k=k+1) {
			int s = 0;
			for (int i = 0; i < 1000; i = i + 1) {
				int hit = 0;

				for (int j = 0; j < 3; j = j + 1) {
					float rand = ((float) Math.random());
					if (rand < 0.7) {
						hit = hit + 1;
					}
				}
				if (hit >= 2) {
					s = s + 1;
				}
			}
			d = d + s;
		}
		float sredn = (float) d / 100;
		System.out.println("По некоторым сведениям, мы сбили " + d +" самолетов!!!");
		System.out.println(sredn);
	}
	public static void run2(){
		double h;
		int countRed = 0;
		int countBlack = 0;
		int countPoints = 0;
		for (int i=1; i<=72; i++){
			h = Math.random();
			boolean red;
			if (h<0.5){
				red = true;
				countRed += 1;
			}
			else {
				red = false;
				countBlack += 1;
			}
			if (countRed == 4){
				countPoints += 1;
				countRed = 0;
			}
			else if (countBlack == 4){
				countPoints +=1;
				countBlack = 0;
			}
			if ((countRed + countBlack)== 6){
				countPoints -= 5;
				countRed = 0;
				countBlack = 0;
			}
		}
		System.out.println("Студент набрал " + countPoints);
	}
	
	public static void run3() {
		//range -10 10
		//count 20
		//output those which are greater than avg
		
		int[] p = new int[20];
		int sum = 0;
		double avg;
		
		for( int i = 0 ; i < 20 ; i++ ) {
			int j = (int) (Math.random() * 21 - 10);
			p[i] = j;
			sum += p[i];
		}
		avg = sum / 20d;
		System.out.println(avg);
		for( int i = 0 ; i < 20 ; i++ ) {
			int j = p[i];
			if( j > avg){
				System.out.print(j + " ");
			}
		}
	}
}