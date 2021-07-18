package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenses;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if (anualIncome <= 20000.00) {
			tax += (anualIncome * 0.15) - (healthExpenses * 0.50);
		}
		else {
			tax += (anualIncome * 0.25) - (healthExpenses * 0.50);
		}
		return tax;
	}
}
