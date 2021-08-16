package com.java.inheritance;
class Point{
  private final int x;
  private final int y;
  public Point(){
     this(0,0);
  }
  public Point(int x, int y){
     this.x = x;
	 this.y = y;
  }
  public int getX(){
     return x;
  }
  public int getY(){
     return y;
  }
  public void setX(int x){
   // this.x = x;//not allowed as x is final
  }
  public void setY(int y){
   // this.y =  y;//not allowed as y is final
  }
}
public class ImmutableTest{
  public static void main(String[] args){
      Point p = new Point(4,5);//We can not change the values so the object is immutable
	  System.out.println(p.getX()+","+p.getY());
  }
}