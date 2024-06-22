package com.simplepro;
class A
{
	static void test1()
	{
		System.out.println("A");
	}
	void test2()
	{
		System.out.println("A1");
	}
}
 class C extends A {

	 static void test1()
		{
			System.out.println("B");
		}
	 void test2()
		{
			System.out.println("c");
		}
 }
 class B{
	 
	public static void main(String[] args) {
		A a1=new A();
		a1.test1();//A
		C c1=new C();
		c1.test1();//B		
		A a=new C();
		a.test1();//A
		A a2=new C();
		a2.test2();//c
	}

}
