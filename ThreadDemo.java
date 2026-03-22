class task1 implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("i :"+i);
		}
	}
}
class task2 extends Thread{
	public void run(){
		for(int j=0;j<5;j++){
			System.out.println("j :" +j);	
			try{
			Thread.sleep(3000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}

		
		}
	}
}
class task3 implements Runnable{
	public void run(){
		for(int k=0;k<5;k++){
			System.out.println("k :"+k);
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}

		}
	}

}

class ThreadDemo{
	public static void main(String[] args){
		task1 t1=new task1();
		task2 t2=new task2();
		task3 t3=new task3();

				
		new Thread(t1).start();
		t2.start();
		new Thread(t3).start();
	}
}