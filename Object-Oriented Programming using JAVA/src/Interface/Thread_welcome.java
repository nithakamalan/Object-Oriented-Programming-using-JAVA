package Interface;

public class Thread_welcome {

	
	public static void main(String[] args) {
		welcome w = new welcome();
		w.start();
	}

	}
class welcome extends Thread{
	
	public void run() {
		String str ="Welcome";
		int l = str.length();
		int i;
		for(i=0;i<l;i++) {
			char c = str.charAt(i);
			try {
				Thread.sleep(15000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread running"+i+"time");
			System.out.println(c);
		}
	}

}
