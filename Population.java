package num6;

public class Population {

	private int organisms;
	private double populationIncrease;
	private int days;
	
	
	public int getOrganisms() {
		return organisms;
	}
	public void setOrganisms(int organisms) {
		this.organisms = organisms;
	}
	public double getPopulationIncrease() {
		return populationIncrease;
	}
	public void setPopulationIncrease(double populationIncrease) {
		this.populationIncrease = populationIncrease;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
	
	public void growPopulation(){
		for (int x = 1; x <= days; x++){
			System.out.printf("Day %d: %.0f organisms\n", x, Math.ceil(organisms));
			organisms *= (1 + populationIncrease);
		}
	}
	
	
	
	
}
