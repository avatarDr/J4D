package lesson.oop.lesson1;

public class Hospital {
	
	public static void pseudoMain(){
		
		// Именя пациентам мы задаём сами. Из 3 букв, чтобы при выводе смотрелись ровно.
		String[] names = new String[]{ "Боб", "Юля", "Ася", "Тим", "Том" };
		// По количеству заданных имён мы определяем общее количество пациентов.
		int n=names.length;
		
		// Ранее для этой задачи требовалось 4 массива с примитивными данными, теперь 1 массив с нашей структурой.
		// Её описание называется классом и находится в файле Patient (public class Patient). Рекомендуется заглянуть туда.
		//	//int[] ages = new int[n];
		//	//float[] temps = new float[n];
		//	//String[] results = new String[n];
		Patient[] patients = new Patient[n];
		
		for( int i = 0 ; i < n ; i++) {
			// Так как Patient - сложный тип данных, его создание требует использование ключевого слова new.
			// Здесь мы создаём объект типа Patient.
			Patient p = new Patient();
			
			// Здесь мы записываем созданный объект в массив.
			// Без этого, массив будет заполнен значениями null, что означает, что в ячейке ничего не хранится.
			patients[i] = p;
			
			// Заполняем поля объектов, вместо того, чтобы заполнять элементы массивов
			p.name = names[i];
			
			//	//ages[i] = (int) ( Math.random() * 23 + 18 );
			p.age = (int) ( Math.random() * 23 + 18 );
			
			int temp = (int) (Math.random() * 51 + 350);
			//	//temps[i] = temp/10f;
			p.temperature = temp/10f;
			
			//	//results[i] = getResult(p.temperature);
			p.diagnosis = getResult(p.temperature);
			
		}
		for( int i = 0 ; i < n ; i++) {
			//Отображаем информацию по каждому пациенту
			showPatient(patients[i]);
		}
	}
	
	// Мы создали эти методы, чтобы основной метод (функция) занимал меньше места
	public static void showPatient(Patient p){
		System.out.print( "Пациент " + p.name);
		System.out.print( ", " + p.age + " лет отроду, явился с температурой " );
		System.out.print( p.temperature + " и получил диагноз \"");
		System.out.print( p.diagnosis +"\".\n");
	}
	
	public static String getResult( float temperature ) {
		if( temperature < 37 ) return "Здоров";
		else if( temperature < 38 ) return "Не здоров";
		else return "Всё плохо";
	}
}
