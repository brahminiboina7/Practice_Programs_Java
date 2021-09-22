package com.java.ExceptionHandling;
/*Point4: If a method is throwing super class and sub class Exceptions then throws Declaration Exceptions
 * order can be any order
 *
 *Point5: If a method throws different exceptions then the catch statements order is any order in the
 *calling method
 *
 *Point6: If a method throws super class and sub class exceptions then to catch each exception separately
 * we use subclass exception catch first, then super class exception catch next.
 * To catch all exception with a single catch use superclass exception catch
 */
import java.io.EOFException;
public class TryCatchDemo4 {
	static void fun(int a) throws EOFException, Exception {
		//static void fun(int a) throws Exception, EOFException { --> we can also write like this
			if(a==0) {
				throw new Exception();
			}
			if(a==1) {
				throw new EOFException();
			}
			
		}
		public static void main(String[] args) throws Exception, EOFException{
			fun(0);
			fun(1);
		}

}
