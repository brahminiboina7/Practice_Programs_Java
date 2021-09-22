package com.java.ExceptionHandling;
/* Point:2 - In catch block, catch statements must be in the following order
 * 
 * catch(SubClassExceptiohn e1){
 * } 
 * catch(SuperClassException e2){
 * } 
 * 
 */
import java.io.IOException;

public class TryCatchDemo2 {
	public static void fun(int a)/*throws Throwable -->is optional when there is try/catch */  {
		try {
			if(a==0) {
				throw new Exception(" "+a);
			}
			if(a==1) {
				throw new IOException(" "+a);
			}
			if(a==2) {
				throw new ClassNotFoundException(" "+a);
			}
		}catch(IOException e) {
			System.out.println("caught ioexception: " +e.getMessage());
		}catch(Exception e) {
			System.out.println("caught exception: " +e.getMessage());
		}/*catch(ClassNotFoundException e) {
			System.out.println("caught classnotfoundexception: " +e.getMessage());
		}*/
		
		System.out.println("fun end");
	}
	public static void main(String[] args) throws Throwable{
		System.out.println("main begin");
		fun(0);
		fun(1);
		fun(2);
		System.out.println("main end");
	}
}
