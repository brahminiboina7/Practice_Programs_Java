package com.java.inheritance;
final class CurrencyNote{
   private final int noteValue;
   public CurrencyNote(int v){
       noteValue = v;
   }
   public int noteValue(){
     return noteValue;
   }
}
public class TestCase{
  public static void main(String[] args){
      CurrencyNote n = new CurrencyNote(500); // wrapping or boxing or packing
	  int v = n.noteValue(); // unwrapping or un boxing or un packing
	  int b1 = 21; // the compiler takes it as int b1 = new int(21);-->auto boxing
	  int i = b1;  // the compiler takes it as int i = b1.intvalue(); --->auto unboxing
	  System.out.println(i);
	  System.out.println(v);
  }
}