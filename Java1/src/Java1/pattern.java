package Java1;

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/

import java.util.Scanner;
public class pattern {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Row column input 
        /*1 2 2      00 01 02
          3 2 4      10 11 12
          8 5 6      20 21 22          */   
        int array[][] = new int[n][n];
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	
               //input 
            	array[i][j] = in.nextInt(); //input starts from a[0][0] =1
                
                if (i == j) {
                	
                    d1 = d1 + array[i][j];
                }
                if (i + j == n - 1) {
                    d2 = d2 + array[i][j];
                }
            }
        }
        System.out.println(Math.abs(d1 - d2));

    }
    
}

