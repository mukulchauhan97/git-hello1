import java.util.*;
//Shift Zeroes....
public class Arr
{
public static void printArray(int[] arr) {

	for(int i = 0; i < arr.length; i++) {
		
	System.out.print(arr[i] + " ");
		
}
	
}
	
	
public static int[] inputArray() {
	
	Scanner s = new Scanner(System.in);
	
	int size = s.nextInt();
	
	
int arr[] = new int[size];

		
for(int i = 0; i < arr.length; i++) {

			arr[i] = s.nextInt();
	
	}
		
		
return arr;
	
}
	
public static void pushZerosToEnd(int[] arr) 
{
		
int nonZero = 0;
		
int i = 0;
		
		
while(i < arr.length) 
{
			
if(arr[i] != 0) {
				
int temp = arr[i];
				
arr[i] = arr[nonZero];
				
arr[nonZero] = temp;
				
				
nonZero += 1;
			
}
			
i++;
		
}
	
}
	
  public static void main(String args[])
  {
    int a[]=Arr.inputArray();
    Arr.pushZerosToEnd(a);
    Arr.printArray(a);
  }
}