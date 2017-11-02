package com.java.collections.codes;

public abstract class AbsClassCodes extends  Abs 

{
	void print()
	{
		System.out.println("p1");
	}
	void print2()
	{
		System.out.println("p2");
	}
}

abstract class Abs
{
	abstract void print();
}

abstract class A extends Abs
{
	void print()
	{
		System.out.println("print");
	}
	abstract void print2();
}
