# ArraySize
import java.io.*;
import java.util.*;
public class ArraySize
{
 public static void main(String args[])
 {
  Scanner sr=new Scanner(System.in);
	System.out.println("Enter the size of array");
	double size=sr.nextDouble();
	   
		   double iArr[] =new double[(int) size];
		   System.out.println("enter the element");
		   for(int i=0;i<iArr.length;i++){
			   iArr[i]=sr.nextInt();
		   }


	   
	   Arrays.sort(iArr);

	   for(int j=iArr.length-1;j>=0;j--){
		   System.out.print(iArr[j]+" ");
	   }
	   }

	}
