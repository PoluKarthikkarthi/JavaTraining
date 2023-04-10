package collections;

public class InnerClass {

//	int x =7;
//	class MyInner
//	{
//		public void InnerMethod()
//		{
//			System.out.println("x == " + x);
//		}
//	}
//	public void OuterMethod()
//	{
//		System.out.println("From outer method = " + x);
//		MyInner inn = new MyInner();
//		inn.InnerMethod();
//	}
//	public static void main(String[] a)
//	{
//		InnerClass mo = new InnerClass();
//	//MyInner inn = new MyInner(); //invalid
//	//inn.InnerMethod();
//	//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
//		InnerClass.MyInner mi = mo.new MyInner(); //instantiate inner class
//	mi.InnerMethod();
//	mo.OuterMethod();
//	//mi.OuterMethod();  illegal
//	//mo.InnerMethod();   illegal 
	
	
//1)Check whether the inner class can be abstract
//	String name = "karthik";
//	
//	abstract class MyInnerAbstractClass{
//		public void regularClassAbstractInnerMethod() {
//			System.out.println("abstarct class inside method :" + name);
//			
//		}
//	}
//	class InnerCls extends MyInnerAbstractClass{
//		public void innerClassMethod() {
//			// TODO Auto-generated method stub
//			System.out.println(" abtractclass method calling from inner class " + name);
//		}
//		
//	}
//	public void outsideClassMethod() {
//		MyInnerAbstractClass abmi = new InnerCls();
//		System.out.println(" regular class regular method " + name);
//		abmi.regularClassAbstractInnerMethod();
//	}
//		
//	public static void main(String[] arg) {
//		InnerClass mo = new InnerClass();
//		InnerClass.InnerCls mi = mo.new InnerCls();
//		mi.innerClassMethod();
//		mo.outsideClassMethod();
//	}
	
//2)can it be inherited?
//3)scope of instance variable within the inner class 
//4)scope of local variable within the inner class
	int a = 23;
	class ClassInner{
		public void innerMethod() {
			int b = 45;
			System.out.println("karthik inner class");
			System.out.println(a);
			System.out.println(b);
		}
	}
	class secondInnerClass extends ClassInner{
		public void secondInnerClassMethod() {
			super.innerMethod();
		}
		
	}
	
	public static void main(String arg[]) {
		InnerClass mo = new InnerClass();
		InnerClass.secondInnerClass mi = mo.new secondInnerClass();
		InnerClass.ClassInner ci = mo.new ClassInner();
		mi.secondInnerClassMethod();
		ci.innerMethod();
		
	}
}
