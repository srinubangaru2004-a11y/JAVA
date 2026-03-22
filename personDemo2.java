class Person{
	int sid;
	public String sname;
	private String qual;
	protected static int count;
	final int SAL=60000;
	Person(int sid, String sname,String qual){
		this.sid=sid;
		this.sname=sname;
		this.qual=qual;
		//count++;
	}  
	String display(){
		return "personInfo: "+sid+" "+sname+" "+qual;
	}      
}
class personDemo2{
	public static void main(String[] args){
		Person p=new Person(1,"neelma","btech");
		//System.out.println(p.display());
		Person p1=new Person(2,"rajesh","btech");
		//System.out.println(p1.display());

		Person p2=new Person(3,"ramu","btech");
		//System.out.println(p2.display());
		
		Person[] pobj={p,p1,p2};
		
		for(int i=0;i<pobj.length;i++){
			System.out.println(pobj[i].display()+"personCount: "+ ++count);
		}

	}
java write
potd
js remining  5805238422
}