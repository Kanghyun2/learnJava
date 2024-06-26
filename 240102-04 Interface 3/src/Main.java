// 술병
// 현재 용량
class AlcholDrink {
	private int amount;

	public AlcholDrink(int amount) {
		super();
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AlcholDrink [amount=" + amount + "]";
	}
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
// 사람
class Person {
	
}
// 사람(술을 마실 수 있음)
class PersonDrinkable extends Person implements Drinkable  {
	@Override
	public void drink(AlcholDrink bottle) {
		bottle.setAmount(bottle.getAmount() - 10);
	}
}
// 사람 (춤을 출 수 있음)
class PersonDancealbe extends Person implements Danceable {
	@Override
	public void dance() {
		System.out.println("사람은 춤을 출 수 있습니다.");
	}
}
// 사람 (술도 마실 수 있으며, 춤도 출 수 있는 사람)
class PersonPerfect extends Person implements Drinkable, Danceable {
	@Override
	public void dance() {
		System.out.println("춤을 춘다.");
	}
	@Override
	public void drink(AlcholDrink bottle) {
		System.out.println("술을 마신다.");
	}
	
}

interface Danceable {
	public abstract void dance();
}

interface Drinkable {
	public abstract void drink(AlcholDrink bottle);
}


public class Main {
	public static void main(String[] args) {
		AlcholDrink bottle = new AlcholDrink(100);
		
		Person p = new Person();
		if (p instanceof Drinkable) {
			Drinkable d = (Drinkable) p;
		}
//		Drinkable d = (Drinkable) p;
		

//		PersonPerfect p = new PersonPerfect();
//		p.dance();
//		p.drink(bottle);
//		
//		Danceable cast = p;
//		cast.dance();
//		cast.drink(bottle);
		
//		Person p = new Person();
//		Person dp = new PersonDrinkable();
//		PersonDrinkable drinkable = new PersonDrinkable();
//		Drinkable idrink = new PersonDrinkable();
//		
//		AlcholDrink bottle = new AlcholDrink(100);
//		
////		p.drink(bottle);
////		dp.drink(bottle);
//		drinkable.drink(bottle);
//		idrink.drink(bottle);
	}
}
