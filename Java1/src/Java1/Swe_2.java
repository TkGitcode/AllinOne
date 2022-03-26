package Java1;

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Swe_2 {
	static int countOfSubstringWithKOnes(
            String s, int K)
{
int N = s.length();
int res = 0;
int countOfOne = 0;
int []freq = new int[N+1];

freq[0] = 1;

for (int i = 0; i < N; i++) {

countOfOne += (s.charAt(i) - '0');

if (countOfOne >= K) {

res += freq[countOfOne - K];
}

freq[countOfOne]++;
}

return res;
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
        int K = sc.nextInt();
         int fin=countOfSubstringWithKOnes(s, K);
         if(fin>0)
        System.out.println(fin);
         else
        	 System.out.println(-1);

	}

}
