package Java1;
/** 
* @Author -- TkGitcode
*/
public class swe_3 {

	public static void main(String[] args) {
		String d[]={"John","Johny","Janarthan"};
		


		String a1[]=new String[50];
		String a2[]=new String[50];
		String a3[]=new String[50];
		int a11=0,a12=0,a13=0;
		int sk=0,sk1=3;
		for(int i=0;i<3;i++)
		{
			if(d[i].length()%3==0)
			{
				for(int j=0;j<d[i].length()/3;j++)
				{
				String l=d[i].substring(sk,sk1);
				sk=sk+3;
				sk1=sk+3;
				for(int k=0;k<3;k++)
				{
					a1[a11++]=l;
				}
				System.out.print(l+" ");
				}
				//System.out.println();
			}
			else if(d[i].length()%2==0)
			{
				int len=d[i].length();
				int len2=len/2;
				int len3=len2-2;
				String l1=d[i].substring(len3, len2);
				String l11=d[i].substring(0, len3);
				String l12=d[i].substring(len2,len);
				a2[a12++]=l11;
				a2[a12++]=l1;
				a2[a12++]=l12;
				System.out.println(l11+" "+l1+" "+l12);
			}
			else 
			{
				int len=d[i].length();
				int len2=len/2;
				//System.out.println(len2);
				String l1=d[i].substring(0,len2);
				String l2=d[i].substring(len2,len2+1);
				String l3=d[i].substring(len2+1,len);
				a3[a13++]=l1;
				a3[a13++]=l2;
				a3[a13++]=l3;
				System.out.println(l1+" "+l2+" "+l3);
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.print(a1[i]);
		}
		

	}

}
