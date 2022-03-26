package FileIO;

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
class Home extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try {
			Thread.sleep(1*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am From Thread ");
		}
	}
}
public class thread {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		Home h=new Home();
		Thread k,k1 = null,k2;
		k=new Thread(h);
		k1=new Thread(h);
		k2=new Thread(h);
		k.start();
		k1.start();
		k1.join();
		k2.start();
		k2.join();
		

	}

}
