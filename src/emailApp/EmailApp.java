package emailApp;

public class EmailApp {

	public static void main(String[] args) {
	
		emailImp emp = new emailImp("Firstname","lastname");
		emp.alternateEmail("Alternate Email");
		emp.showInfo();

	}

}
