class Student{
	private int rollno;
	private String name;
	public Student(){
	
	}
	public Student(int r, String n){
		rollno = r;
		name = n;
	}
	public int getRollNo(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return "("+rollno+", "+name+")";
	}
	public boolean equals(Object obj){
		Student param = (Student)obj; //narrowing
		return (this.rollno == param.rollno && this.name.equals(param.name));
	}
	//along with equals we must override hashcode also as per java API contract equals hashcode 
	public int hashCode(){
		return rollno+name.hashCode();
	}
}

class Employee<p>{
	private int id;
	private String name;
	private String dept;
	public Employee(){
	
	}
	public Employee(int i, String n, String d){
		id = i;
		name = n;
		dept = d;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return "("+id+", "+name+", "+dept+")";
	}
	public boolean equals(p obj){
		Employee param = (Employee)obj; //narrowing
		return (this.id == param.id && this.name.equals(param.name) && this.dept.equals(param.dept));
	}
	//along with equals we must override hashcode also as per java API contract equals hashcode 
	public int hashCode(){
		return id+name.hashCode()+dept.hashCode();
	}
}

class MySet<T>{
	private Object elements[] = new Object[10];		//elements default capacity 10
	private int index = 0;
	private int threshold = 5;
	public void add(T ele) {
		//verification for duplicate elements.
		//new eke has to be compared with existing elements
		boolean  duplicatFound = false;
		for(int i=0;i<index;i++){
			if(elements[i].equals(ele) && elements[i].hashCode() == ele.hashCode()){	//equals object must have equal hashcode
				duplicatFound = true;
				break;
			}
		}
		/*if(index == elements.length){
			Object[] newelements = new Object[elements.length+2*threshold];
			//copy all elements from old to newelements array.
		}*/
		//if we have an existing element then do not add that element.
		//if the ele is not existing then add ele.
		if(!duplicatFound){			//not efficient to use hashtables and bucketing concepts.
		elements[index] = ele;  	//add element logic
		index++;
		}
	}
	public String toString() {
		String elementsString = "[";
		for(int i=0; i<index; i++){
			elementsString = elementsString + elements[i].toString() + ",";
		}
	elementsString = elementsString + "\b]";
	return elementsString;
	}
	
	
}

public class MySetTestCaseUsingGen{
	public static void main(String[] args){
		Employee e1 = new Employee(1, "Modi","politics");
		Employee e2 = new Employee(2, "Nani","actor");
		Employee e3 = new Employee(3, "Arijit","Singer");
		Employee e4 = new Employee(4, "Dhoni","cricketer");
		Employee e5 = new Employee(2, "Nani","actor");
		
		Student s1 = new Student(127,"Brahmini");
		Student s2 = new Student(128,"Kavya");
		Student s3 = new Student(126,"Sandeep");
		Student s4 = new Student(129,"Nandini");
		Student s5 = new Student(127,"Brahmini");
		
		MySet<Student> studentSet = new MySet<>();
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		System.out.println(studentSet);
		
		MySet<Employee> employeeSet = new MySet<>();
		
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		System.out.println(employeeSet);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
		System.out.println(e2==e1);
		System.out.println(e2.equals(e1));
		System.out.println(e2==e3);
		System.out.println(e2.equals(s3));
		System.out.println(e2==e4);
		System.out.println(e2.equals(e4));
		System.out.println(e2==e5);
		System.out.println(e2.equals(e5));
		
		}
}