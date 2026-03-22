class linkedListDemo{
	public stastic void main(String[] args){
		LinkedList<Student> list=new linkedList<Student>();
		list.add(new student(1,"neelu",35));
		list.add(new student(3,"deek",85));
		list.add(new student(2,"anu",75));
		Collections.sort();
		display(list);
	}
	static void display(linkedList<Student> list){
		for(Student s : list){
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
	}
}