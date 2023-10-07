package jungle_book;


public class Game {
	
	public static void main(String args[])
	{
		Human h = new Human();//function call
		h.name = " Mowgli ";
		h.think();
		h.eat();
		h.drink();
		h.sleep();
		h.dance();
		
		Bear b = new Bear();
		b.name = " Baloo ";
		b.walk();
		b.eat();
		b.drink();
		b.sleep();
		b.hunt();
		
		Tiger t = new Tiger();
		t.name = " Shere Khan ";
		t.walk();
		t.eat();
		t.drink();
		t.roar();
		
		Wolf w = new Wolf();
		w.name = " Bagheera ";
		w.walk();
		w.eat();
		w.drink();
		w.sleep();
		w.bark();
		
		Snake s = new Snake();
		s.name = " kaa ";
		s.eat();
		s.sleep();
		s.drink();
		s.hunt();
		
		
	}


}
