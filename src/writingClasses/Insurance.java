package writingClasses;

public class Insurance {
	private String FirstName;
	private String LastName;
	private double Liability;
	private double Commission;
	
	public void setFirstName(String NewName) {
		FirstName = NewName;
	}
	
	public void setLastName(String NewName) {
		LastName = NewName;
	}
	
	public void setLiability(double newLiability) {
		Liability = newLiability;
	}
	
	public void setCommission(double newCommission) {
		Commission = newCommission;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public double getLiability() {
		return Liability;
	}
	
	public double getCommission() {
		return Commission;
	}
	
	public void computeComission() {
		Commission = Liability;
	}
}
