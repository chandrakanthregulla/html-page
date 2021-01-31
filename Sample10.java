/*WAP to count number of digits ,number of alphabets,number of symbols
 * i/p :j@v@html5qlw3b
 * o/p : NOD : 2
 *       NOA : 10
 *       NOS :2*/

package demopack1;
import java.util.*;

public class Sample10 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data....");
		String s1=scan.next();
		int alphaCount=0,digitCount=0,symbCount=0;
		for (int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z' || s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				alphaCount++;
				
			}else if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				digitCount++;
			}else
			{
				symbCount++;
			}
		}
		System.out.println("Number of alphabets are : " +alphaCount);
		System.out.println("Number of digits are : " +digitCount);
		System.out.println("Number of symbols are : " +symbCount);

	}

}
