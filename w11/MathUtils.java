package w11;

//****************************************************************
//MathUtils.java
//
//Provides static mathematical utility functions.
//
//****************************************************************
public class MathUtils{
	//-------------------------------------------------------------
	//Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n){
		//jika angka inputan negatif
		if(n < 0)
			throw new IllegalArgumentException("Not Defined for Negative Integers");
		//jika angka inputan lebih dari 16
		else if(n > 16)
			throw new IllegalArgumentException("Arithmetic Overflow");
		
		int fac = 1;
		for (int i=n; i>0; i--)
		fac *= i;
		return fac;
	}
}
