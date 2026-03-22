class Box{
	double length;
	double width;
	double height;
	Box(double l, double w, double h)
	{
		length=l;
		width=w;
		height=h;
	}
	
	String volume(String s){
		return s;
	}

	double volume(){
		return length*width*height;
	}
}

class BoxDemo{
	public static void main(String[] args){
		Box b=new Box(2.2,5.3,4.9);
		System.out.println(b.volume("calculate volume:"));
		System.out.println(b.volume());

	}
}