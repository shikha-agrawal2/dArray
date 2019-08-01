package coreJava.collections;
//public void sort(List list): is used to sort the elements of List. List elements must be of Comparable type.
public class Student implements Comparable<Student> {
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}
	
	@Override
	public int compareTo(Student o) {
		if(age == o.age)
			return 0;
		if(age < o.age)
			return -1;
		else
			return 1;
	}  
}
