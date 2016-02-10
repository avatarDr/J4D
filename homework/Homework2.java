package homework;

public class Homework2 {

	public static void task1() {
		double cube = 0;
		for (int i = 1; i <= 8; i++) {
			int k = i * 2;
			cube = Math.pow(k, 3);
			System.out.println(k + "^3 =" + (int) cube + ";");
		}
		cube = Math.pow(18, 3);
		System.out.println("18^3 =" + (int) cube + ".");
	}

	public static void task2() {
		int i = 0, j = 1;
		System.out.println(0);
		System.out.println(1);
		for (int l = 0; l < 10; l = l + 1) {
			//System.out.println();
			int next = i + j;
			System.out.println(next);
			i = j;
			j = next;
		}


	}

	public static void task4() {
		String a = "Gotta program 'em all!";
		for (int b = 3; b < a.length(); b += 3) {
			System.out.println(a.substring(0, b));

		}
		System.out.println(a);
	}

	public static void task5() {
		String a = "Съешь ещё этих мягких французских булок, да выпей же чаю! ";
		System.out.println(a.indexOf(' '));
		int temp=0;
		int i= 5/0;
		for (int b=0; b < 5; b += 1){
			int found=a.indexOf(' ',temp);
			temp=found + 1;
			found=a.indexOf(' ',temp);
			temp=found + 1;
			System.out.println(a.substring(0,found));
			
		}

		a.indexOf(' ');
	}
}