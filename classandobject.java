import java.util.*;

class Student {
	String name;
	String rollNumber;
	double marks;
	
	void display() {
		System.out.println("Your Name is "+name+", Roll Number is "+rollNumber+" and you scored +marks+");
	}
}

public class classandobject {
	public static void main (String[] args) {
	Student s1 = new Student();
	s1.name = "Anil";
	s1.rollNumber = "A2512655201";
	s1.marks = 86;
	s1.display();
	}
}