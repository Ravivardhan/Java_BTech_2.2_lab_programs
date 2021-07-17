public class Ravi extends Threads{
	public void run(){
		System.out.println("class is running");
	}
}

public static void main(String args[]){
	Ravi r1=new Ravi();
	r1.start();
}
