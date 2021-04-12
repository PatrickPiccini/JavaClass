package entities;

public class Individual  extends People {

	private Double spentHealth;
	
	public Individual () {
		super();
	}

	public Individual (String name, Double anualIncome, Double spentHealth) {
		super(name, anualIncome);
		this.spentHealth = spentHealth;
	}

	public Double getSpentHealth() {
		return spentHealth;
	}

	public void setSpentHealth(Double spentHealth) {
		this.spentHealth = spentHealth;
	}


	@Override
	public Double tax() {
		if(getAnualIncome() < 20000.0) {
			return getAnualIncome() *0.15 - spentHealth * 0.5;
		} else {
			return getAnualIncome() *0.25 - spentHealth * 0.5;
		}
	}

}
