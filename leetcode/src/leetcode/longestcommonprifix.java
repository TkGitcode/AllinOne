package leetcode;
/** 
* @Author -- TkGitcode
*/
public class longestcommonprifix {
 
	public static void main(String[] args) {
		String[] a= {"flower","floer","flower","flow"};
		String a1="";
					for(int j=0;j<a[0].length();j++)
					{
						
							if(a[0].charAt(j) == a[a.length	 - 1].charAt(j)){
						          a1 += (a[0].charAt(j));
							}
						          else 
						          {
						        	  break;
						          }
				
						}
					System.out.println(a1);
					}
					
					
				}	


