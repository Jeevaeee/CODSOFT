/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Student_grade
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_mark=0;
		//String sub=null;
		//String[] arrstr=;
		//int arr_size=0;
	    
		System.out.println("How many Subject due you want to enter:");
		int total_sub=sc.nextInt();
		String [] arr =new String[total_sub];
		float [] arr1=new float[total_sub];
		for(int i=0;i<=total_sub-1;i++)
		{
		    Scanner str=new Scanner(System.in);
		    //int arr[total_sub];
		    System.out.println("Enter a subject name:");
		    arr[i]=str.nextLine();
		    System.out.println("Enter a Mark of an subject");
		    arr1[i]= sc.nextFloat();
		    if(arr1[i]>100)
		    {
		        System.out.println("Please enter the mark from 1 to 100");
		        break;
		    }
		    
		    //System.out.println(arr[i]+" - "+arr1[i]);
		    total_mark+=arr1[i];
		    if(i==total_sub-1)
		    {
		        //System.out.println("**********");
		        System.out.println("*****SUBJECTS AND THE CORRESPONDING MARKS*****");
		    	for(int j=0;j<=total_sub-1;j++)
		    {
		        System.out.println(arr[j]+" - "+arr1[j]);
		    }
		    }
		}
		System.out.println("TOTAL MARKS OBTAINED  - "+total_mark);
		float average =((total_mark)/total_sub);
		System.out.println("AVERAGE OF THE MARKS - "+average);
		if(average>=80)
		{
		    System.out.println("A-GRADE");
		}
		else if(average>=60 && average< 80)
		{
		    System.out.println("B-GRADE");
		}
		else if(average>=40 && average<60)
		{
		    System.out.println("C-GRADE");
		}
		else if(average<40 && average >1)
		{
		    System.out.println("D-GRADE");    
		}
		else
		{
		    System.out.println("Please enter the mark from 1 to 100");   
		}
	}
	
}