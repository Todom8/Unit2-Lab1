package writingClasses;

public class Auto extends Insurance {
	private String Make;
	private String Model;
	private double Collision;
	
	public Auto(String NewFirstName, String NewLastName, String NewMake, String NewModel, double NewLiability, double NewCollision) {
		setFirstName(NewFirstName);
		setLastName(NewLastName);
		setMake(NewMake);
		setModel(NewModel);
		setLiability(NewLiability);
		setCollision(NewCollision);
	}
	
	public void setMake(String NewMake) {
		Make = NewMake;
	}
	
	public void setModel(String NewModel) {
		Model = NewModel;
	}
	
	public void setCollision(double NewCollision) {
		Collision = NewCollision;
	}
	
	public String getMake() {
		return Make;
	}
	
	public String getModel() {
		return Model;
	}
	
	public double getCollision() {
		return Collision;
	}
	
	public void computeCommission() {
		setCommission((getLiability() + getCollision()) * 0.3);
	}
	
	public String toString() {
		String ReturnStr = "Auto";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nMake: " + getMake();
		ReturnStr = ReturnStr + "\nModel: " + getModel();
		ReturnStr = ReturnStr + "\nLiability: $" + getLiability();
		ReturnStr = ReturnStr + "\nCollision: $" + getCollision();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
