package Practice;

/**
 * @Author -- TkGitcode
 */
public class Pattern4 {

	public static void main(String[] args) {
		int n = 3;
		int n1 = 4, a = 0, val2 = 1, val1 = 1;
		for (int i = 1; i <= n; i++) {
			for(int k=n1;k<=n;k++)
			{
				val1++;
			}
			for (int j = 1; j < n1; j++) {
				System.out.print(val1++ + " ");
			}
			for (int j = n1; j <= n; j++) {
				System.out.print(val2++ + " ");
			}
			val2=val1;
			System.out.println();
		}

	}

}