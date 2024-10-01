package writingClasses;

public class Home extends Insurance {
	private double Footage;
	private double Dwelling;
	private double Contents;
	
	public void setFootage(double NewFootage) {
		Footage = NewFootage;
	}
	
	public void setDwelling(double NewDwelling) {
		Dwelling = NewDwelling;
	}
	
	public void setContents(double NewContents) {
		Contents = NewContents;
	}
	
	public double getFootage() {
		return Footage;
	}
	
	public double getDwelling() {
		return Dwelling;
	}
	
	public double getContents() {
		return Contents;
	}
	
	public void computeCommission() {
		setCommission((getLiability() * 0.3) + ((getDwelling() + getContents()) * 0.2));
	}
	
	public String toString() {
		String ReturnStr = "Home";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nFootage: " + getFootage();
		ReturnStr = ReturnStr + "\nDwelling: $" + getDwelling();
		ReturnStr = ReturnStr + "\nContents: $" + getContents();
		ReturnStr = ReturnStr + "\nLiability: $" + getLiability();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
