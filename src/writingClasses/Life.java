package writingClasses;

public class Life extends Insurance {
	private int Age;
	private int Term;
	
	public Life(String NewFirstName, String NewLastName, int NewAge, int NewTerm) {
		setFirstName(NewFirstName);
		setLastName(NewLastName);
		setAge(NewAge);
		setTerm(NewTerm);
	}
	
	public void setAge(int NewAge) {
		Age = NewAge;
	}
	
	public void setTerm(int NewTerm) {
		Term = NewTerm;
	}
	
	public int getAge() {
		return Age;
	}
	
	public int getTerm() {
		return Term;
	}
	
	public void computeCommission() {
		setCommission(getTerm() * 0.2);
	}
	
	public String toString() {
		String ReturnStr = "Life";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nAge: " + getAge();
		ReturnStr = ReturnStr + "\nTerm: $" + getTerm();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
