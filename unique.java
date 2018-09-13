import java.util.*;

public class unique
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
	
public static int uniqueElement(int arr[])
 {
		
		
for(int i = 0; i < arr.length; i++) 
{
			
int count = 1;
			
			
for(int j = 0; j < arr.length; j++) 
{
				
				
if(arr[i] == arr[j] && i != j ) 
{
					
count++;
				
}
			
}
			
			
if(count == 1) 
{
				
return arr[i];
			
}
		
}
		
		
return 0;
	
}
	
	

  public static void main(String args[])
  {
    int a[]=unique.inputArray();
    int x = unique.uniqueElement(a);
    System.out.println(x);
     
  }
}