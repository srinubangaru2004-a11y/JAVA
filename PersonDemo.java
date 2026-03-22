class Person{
	int sid;
	String sname;
	String qual;
	void PersonDetails(int id,String name){
		sid=id;
		sname=name;
	}
	void PersonDetails(int id,String name){
		sid=id;
		sname=name;
	}

	void qualificationDetails(String Qual){
		qual=Qual;
	}
	String display(){
		return sid+" "+sname+" "+qual;
	}
}
class PersonDemo{
	public static void main(String[] args){
		Person p=new Person();
		p.PersonDetails(1,"neelima");
		p.qualificationDetails("Btech");
		System.out.println("PersonInfo:"+p.display());
	}
}