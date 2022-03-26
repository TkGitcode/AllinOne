/** 
* @Author -- TkGitcode
*/
/*Error Exception*/
public class AllinOne {
	 static void AnonyousEx(String ar[])
	{
		for(int i=0;i<ar.length;i++)
				System.out.println(ar[i]);
	}
	public static void main(String[] args) {
		System.out.println("Jagged Array : ");
		/*Jagged Array*/
		int count=0;
		int a[][] =new int[3][];
		a[0]=new int[5]; //1st column value is 5
		a[1]=new int[4]; //2nd column value is 4
		a[2]=new int[9];//2nd column value is 9
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array clone : ");
		int[] b= {1,3,5,6,4};
		int[] b1=b.clone();
		if(b==b1)
			System.out.println("True");
		else
			System.out.println("False");
		b1[0]=5;
		System.out.println(b1[0]);//b1[0] is 1
		System.out.println(b[0]);//b[0] is 5
		//when we change b1 value as 5 is not reflected to b
		System.out.println("Normal Array : ");
		int c[]=b;
		if(b==c)
			System.out.println("True");
		else
			System.out.println("False");
		c[1]=63;
		System.out.println(b[1]);
		/*When we change a value for array c then array of b value also been changed*/
		/*anonymous array*/
		System.out.println("Anonumous array : ");
			AnonyousEx(new String[] {"Krishna", "Vishnu", "Dhana", "Rupa", "Raja", "Kavya"});
	}

}
