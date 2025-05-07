package com.example;


public class App 
{
public int add(int a,int b)
{
	return a+b;
}

    public static void main( String[] args )
    {
    	App calc= new App();
        System.out.println( "Sum:" +calc.add(5,3));
    }
}
