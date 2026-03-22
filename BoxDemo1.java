class Box{
	double length;
	double width;
	double height;
	Box(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	Box(Box obj){
		length=obj.length;
		width=obj.width;
		height=obj.height;

	}
	double volume(){
		return length*width*height;
	}
}
class BoxDemo1{
	public static void main(String[] args){
		Box b=new Box(2.3,5.9,7.8);
		System.out.println("volume1:"+b.volume());

		Box b1=new Box(b);
		System.out.println("volume2:"+b1.volume());
	}
}


