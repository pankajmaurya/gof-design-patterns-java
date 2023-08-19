package net.hackspace.behavioural.visitor;

public abstract class PartyHost {

	String music = " No Music";
	String meal = " empty";
	String drink = "plane water ";
	CookVisitorI visitor = null;

	abstract void accept(CookVisitorI visitor);

	String getMusic() {
		return music;
	}

	void setMusic(String music) {
		this.music = music;
	}

	String getMeal() {
		return meal;
	}

	void setMeal(String meal) {
		this.meal = meal;
	}

	String getDring() {
		return drink;
	}

	void setDring(String dring) {
		this.drink = dring;
	}

	String getPartyDetail() {
		String detials = visitor!= null ?visitor.getClass().getSimpleName() : "in house cooking"  + " organized " + this.getClass().getSimpleName() + " has Music : " + music + " with Drink :"
		        + drink + " & Meal : " + meal;
		System.out.println(detials);
		return detials;
	}
	
    public void cookInHouse() {
		meal = "Spicy Vegetables";
		drink = "in house drink";
		music = "DJ music";
		getPartyDetail();	    
    }

}

class WeekEndParyHost extends PartyHost {

	@Override
	void accept(CookVisitorI visitor) {
		this.visitor = visitor;
		visitor.cook(this);
	}
}

class WeekDayParyHost extends PartyHost {

	
	@Override
	void accept(CookVisitorI visitor) {
		this.visitor = visitor;
		visitor.cook(this);
	}
}

