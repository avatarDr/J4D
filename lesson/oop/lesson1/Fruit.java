package lesson.oop.lesson1;

public class Fruit {
	String name = "не указано";
	float weight = 0;
	int price = 0;
	// Математические рассчёты здесь происходят только один раз - в момент создания объекта.
	// Значение total записывается исходя из текущих значений weight и price, оно не будет далее меняться автоматически.
	int total = (int) (weight * price);
	
	
	public static void doFruitMath(){
		
		String[] names = new String[]{"Яблоки","Бананы","Киви","Апельсины"};
		int n = names.length;
		
		// Автор кода решил назвать массив фруктов danil. Как мы выяснили ранее, на работу программы это не влияет.
		Fruit[] danil = new Fruit[n];
		for (int i = 0 ; i < n ; i++ ){
			danil[i] = new Fruit();
			
			danil[i].name = names[i];
			int temporary = (int)(Math.random()*2001 + 500);
			danil[i].weight = temporary/1000f;
			danil[i].price = (int) (Math.random()*3201 + 800);
			danil[i].total = (int) (danil[i].weight * danil[i].price);
		}
		for (int i = 0 ; i < n ; i++ ){
			displayFruitInfo(danil[i]);
		}
	}
	
	public static void displayFruitInfo(Fruit fruit){
		System.out.print(fruit.weight + " кг. товара \"");
		System.out.print(fruit.name + "\" было куплено по цене " + (float)fruit.price/100 + " руб.\n");
	}
}
