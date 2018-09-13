import java.util.*;

public class merg
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
	
public static int[] mergeSortedArrays(int[] arr1, int[] arr2) 
{
		
		
int output[] = new int[arr1.length + arr2.length];
		
		
int i = 0; 
		
int j = 0;
		
		
int k = 0;
		
		
while(i < arr1.length && j < arr2.length) {
			
			
if(arr1[i] < arr2[j])
 {
				
output[k] = arr1[i];
				
i++;
				
k++;
			
} 
else if(arr2[j] < arr1[i])
 {
				
output[k] = arr2[j];
				
k++;
				
j++;
			
} 
else 
{
output[k] = arr1[i];
				
k++;
				
output[k] = arr2[j];
				
k++;
				
				
i++;
				
j++;
			
}
		
}
		
		
while(i < arr1.length) 
{
			
output[k] = arr1[i];
			
k++;
			
i++;
		
}
		
		
while(j < arr2.length) 
{
			
output[k] = arr2[j];
			
k++;
			
j++;
		
}
		
		
return output;
	
}
	
	

  public static void main(String args[])
  {
    int a[]=merg.inputArray();
    int b[]=merg.inputArray();
    int c[]=merg.mergeSortedArrays(a,b);
    merg.printArray(a);
    System.out.println();
     merg.printArray(b);
     System.out.println();
    merg.printArray(c);
  }
}