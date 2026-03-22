interface I1{
	void methI1();
}
interface I2{
	void methI2();
}
interface I3{
	void methI3();
}
interface I4{
	void methI4();
}
class c1{
	void methC1(){	
		System.out.println("Iam from c1");
	}
}
class c2 extends c1 implements I3,I4{
	public void methI1(){
		System.out.println("i am from I1");
	}
	public void methI2(){
		System.out.println("i am from I2");
	}
	public void methI3(){
		System.out.println("i am from I3");
	}
	public void methI4(){
		System.out.println("i am from I4");
	}
	void methC2(){
		System.out.println("i am from c2");
	}

}
class InterfaceDemo{
	public static void main(String[] args){
		c2 c=new c2();
		c.methI1();
		c.methI2();
		c.methI3();
		c.methI4();
		c.methC1();
		c.methC1();
	}
}
