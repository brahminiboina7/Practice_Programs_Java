package com.java.Enum;

enum Day{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}
public class EnumDemo2 {
	public static void main(String[] args) {
		Day d[] = Day.values();
		/*for(Day day:d) {	//using for each loop
			System.out.println(day);
		}*/
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}

}
