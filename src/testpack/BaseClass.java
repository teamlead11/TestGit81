
package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Base Class");
		reversedbysyed();

		BaseClass obj = new BaseClass();
		obj.stringReverse();
	}

	public void add1() {
		System.out.println("test method");
	}

	public void addBySatham1() {
		System.out.println("test method added by satham aome changes");
	}

	public void addByAbinaya1() {
		// TODO Auto-generated method stub
		System.out.println("Test method added by Abinaya");
	}

	public void addbyPapu11() {
		// TODO Auto-generated method stub

		System.out.println("papu");
	}

	public void jeroprakash1() {
		// TODO Auto-generated method stub
		System.out.println("add by virat");

	}

	public void reverseByManobalatest() {
		System.out.println("add logic for string reverse");
	}
	public static void reversedbysyed1() {
		String s1="syed satham", s2="";
		for(int i=s1.length()-1; i>=0;i--) {
			s2=s2+s1.charAt(i);}
	System.out.println(s2);
	
	}
	public void stringReverse1() {
		// TODO Auto-generated method stub
		String name = "ABINAYA", rev = "";
		System.out.println("Entered string is " + name);
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			rev = rev + c;
		}
		System.out.println("Reversal of String is: " + rev);
	}	
	
	public void stringReverseBharath1() {
		// TODO Auto-generated method stub
		String name = "Bharath", rev = "";
		System.out.println("Entered string is " + name);
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			rev = rev + c;
		}
		System.out.println("Reversal of String is: " + rev);
	}
	
		
{
	 {
		 int lCaseCount =  0;
		 String s = "Welcome To JAVA Clas @ 12345";
		 for (int i = 0; i < s.length(); i++) {
		 char ch = s.charAt(i);
		 if (Character.isLowerCase(ch)) {
		 lCaseCount++;
		 } 
		 }
		 System.out.println("Lower Case Count code by prabhapapu: " + lCaseCount);
		 }
	 
	}

	
	public void merlinStringReverse1()
	{
	String str, rev = "";
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    str = sc.nextLine();
   
    int length = str.length();
    for (int i = length - 1 ; i >= 0 ; i--)
    rev = rev + str.charAt(i);
       
    System.out.println("Given String got Reversed:" + rev);
	}


public void reversejerovirat1111111() {
	// TODO Auto-generated method stub
	String s ="jerovirat" , rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		System.out.println(rev);
		
	}

}




public void reversesri(){
	String s= "sriram";
	String rev="";
	for (int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		System.out.println(rev);
	}
}

public void reversemano1() {
	System.out.println("Enter string to reverse:");
    
    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    String reverse = "";
    
    
    for(int i = str.length() - 1; i >= 0; i--)
    {
        reverse = reverse + str.charAt(i);
    }
    
    System.out.println("Reversed string is:");
    System.out.println(reverse);
	
}


public void update() {
	System.out.println("update code");
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



public static void reversedbysyed() {
	String s1 = "syed satham", s2 = "";
	for (int i = s1.length() - 1; i >= 0; i--)

	{
		s2 = s2 + s1.charAt(i);
		System.out.println(s1);
		System.out.println(s2);
	}
}

public void stringReverse() {
	// TODO Auto-generated method stub
	String name = "ABINAYA", rev = "";
	System.out.println("Entered string is " + name);
	for (int i = name.length() - 1; i >= 0; i--) {
		char c = name.charAt(i);
		rev = rev + c;
	}
	System.out.println("Reversal of String is: " + rev);
}

public void stringReverseBharath() {
	// TODO Auto-generated method stub
	String name = "Bharath", rev = "";
	System.out.println("Entered string is " + name);
	for (int i = name.length() - 1; i >= 0; i--) {
		char c = name.charAt(i);
		rev = rev + c;
	}
	System.out.println("Reversal of String is: " + rev);

	System.out.println("Enter string to reverse:");

	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";

	for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse);

}

public void reverseVinod() {
	System.out.println("Enter string to reverse:");

	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";

	for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse);

}

public void prabhapappu() {
	int lCaseCount = 0;
	String s = "Welcome To JAVA Clas @ 12345";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isLowerCase(ch)) {
			lCaseCount++;
		}

		System.out.println("Lower Case Count code by prabhapapu: " + lCaseCount);
	}
}

public void merlinStringReverse() {
	String str, rev = "";

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	str = sc.nextLine();

	int length = str.length();
	for (int i = length - 1; i >= 0; i--)
		rev = rev + str.charAt(i);

	System.out.println("Given String got Reversed:" + rev);
}

public void reversejerovirat() {
	// TODO Auto-generated method stub
	String s = "jerovirat", rev = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		rev = rev + s.charAt(i);
		System.out.println(rev);

	}

}

public void reversesri1() {
	String s = "sriram";
	String rev = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		rev = rev + s.charAt(i);
		System.out.println(rev);
	}
}

public void reversemano() {
	System.out.println("Enter string to reverse:");

	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";

	for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse);

}

public void reverseAnkita() {
	// TODO Auto-generated method stub
	String s = "Ankita", rev = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		rev = rev + s.charAt(i);
		System.out.println(rev);

	}
}

public void reverseVinoth() {
	System.out.println("Enter string to reverse:");

	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";

	for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse);

}

public void reverseJuls() {
	System.out.println("Enter string to reverse:");

	Scanner read1 = new Scanner(System.in);
	String str1 = read1.nextLine();
	String reverse1 = "";

	for (int i = str1.length() - 1; i >= 0; i--) {
		reverse1 = reverse1 + str1.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse1);

}
public void addVinoth () {
	System.out.println("hi");
}
public void addedBySakthi() {
	System.out.println("created by sakthi");

}
public void addByHarikrishnan() {
	System.out.println("Creaded by Harikrishnan");

}
public void addByHariS() {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter The Reverse String :::  ");
	String rev="";
	String org=s.nextLine();
	int len=org.length();
	for (int i =len-1; i >=0; i--) {
		rev=rev+org.charAt(i);
	}	
		System.out.println("Reverse Strin is  :::");
	}
	
public void addByHari() {
	
	System.out.println("this is my First Test");
}


public void addbymano() {
	System.out.println("created");
}



}



	

	
	



