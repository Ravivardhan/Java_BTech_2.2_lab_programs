static Thread currentThread()

class currentThreadDemo{
	public static void main(String args[])
	{
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println("name of thread after changing"+ t);
		
		try{
			for(int n=0;n>0;n--)
			{
				System.out.println(n);
				t.sleep(1000);
			}
		}
		catch(interruptedException e){
		System.out.println("main thread interrupted");
		}	
		}
		}