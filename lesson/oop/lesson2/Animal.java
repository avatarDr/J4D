package lesson.oop.lesson2;

import javafx.geometry.Point3D;

public class Animal {
	
	String kind;
	Point3D location = null;
	boolean predator = true;
	float hunger = 0;
	
	// 3 конструктора, каждый из которых вызывает предыдущий с меньшим числом аргументов.
	//
	Animal( String animalKind ) {
		this.kind = animalKind;
	}
	Animal ( String kind, boolean isPredator ) {
		// Обратите внимание на цвета. Переменные будут белыми, поля - фиалковый (или как он называется?)
		this( kind );
		this.predator = isPredator;
	}
	Animal ( String kind, boolean isPredator, Point3D location ) {
		this( kind, isPredator );
		this.location = location;
	}
	
//	// Альтернативный способ делать несколько конструкторов,
//	// где мы из конструкторов с меньшим количеством аргументов вызываем конструкторы с большим.
//	// В этом случае значения по-умолчанию для полей kind, predator и location не нужны, они всегда задаются.
//	Animal ( String kind ) {
//		this( kind, false );
//	}
//	Animal ( String kind, boolean predator ) {
//		this( kind, predator, null );
//	}
//	Animal ( String kind, boolean predator, Point3D location ) {
//		this.kind = kind;
//		this.predator = predator;
//		this.location = location;
//	}
	
	void moveTo( Point3D location ) {
		// В этом методе мы вызываем такой же метод, но сформировав другие аргументы
		moveTo( location.getX(), location.getY(), location.getZ() );
	}
	void moveTo( double x, double y, double z ) {
		this.location = new Point3D( x, y, z);
	}
	
	// Господа, если вы считаете, что каждый раз писать static и использовать на 1 аргумент больше удобно,
	// я искренне поддерживаю вас в этом. Программирование - как музыка, каждый должен найти свой стиль.
	static void moveTo( Animal aniaml, Point3D location ) {
		aniaml.location = location;
	}
	static void moveTo( Animal aniaml, double x, double y, double z) {
		aniaml.location = new Point3D( x, y, z );
	}
}