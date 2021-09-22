package com.java.ExceptionHandling;
/*Points to remember
 * Point1: we can catch all exceptions using each statement with super class exception.
 * 			Instead of two catch statements we can only use one catch.(ie., Super class catch)
 */

 
public class TryCatchDemo1 {
	public static void fun(int a)/*throws Throwable -->is optional when there is try/catch */  {
		try {
			if(a==0) {
				throw new Exception(" "+a);
			}
			if(a==1) {
				throw new Error(" "+a);
			}
		}catch(Throwable e) {
			System.out.println("caught throwable: " +e.getMessage());
		}
		System.out.println("fun end");
	}
	public static void main(String[] args) throws Throwable{
		System.out.println("main begin");
		fun(0);
		fun(1);
		System.out.println("main end");
	}

}
