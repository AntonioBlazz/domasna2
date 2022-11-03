package zadaca1;

public class Student {
 // deklariranje na atributi
	public String firstName;
 public  String lastName;
 public int index;
 // Default konstruktor
 public Student() {
	 
 }
 //Konstruktor koj na vlez prima tri argumenti
 public Student(String firstName, String lastName, int index) {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.index=index;
 }
}