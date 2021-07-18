package entities;

public class Company extends TaxPayer {
	
	private Integer numberEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		double tax = 0.00;
		if (numberEmployees < 10) {
			tax += (anualIncome * 0.16);
		}
		else {
			tax += (anualIncome * 0.14);
		}
		return tax;
	}
	
	

}
