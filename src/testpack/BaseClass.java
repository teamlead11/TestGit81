package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Base Class");
		reversedbysyed();
	}

	public void add() {
		System.out.println("test method");
	}

	public void addBySatham() {
		System.out.println("test method added by satham aome changes");
	}

	public void addByAbinaya() {
		// TODO Auto-generated method stub
		System.out.println("Test method added by Abinaya");
	}

	public void addbyPapu() {
		// TODO Auto-generated method stub

		System.out.println("papu");
	}

	public void jeroprakash() {
		// TODO Auto-generated method stub
		System.out.println("add by virat");

	}

	public void reverseByManobalatest() {
		System.out.println("add logic for string reverse");
	}
	public static void reversedbysyed() {
		String s1="syed satham", s2="";
		for(int i=s1.length()-1; i>=0;i--) {
			s2=s2+s1.charAt(i);}
	System.out.println(s2);
	
	
	
	}
}
