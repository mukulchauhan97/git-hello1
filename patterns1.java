import java.util.*;
public class patterns1
{
public static int[] pattern(int n)
{
		
int var = 1; 
		
int output[] = new int[n];
		
		
int start = 0;
		
int end = output.length - 1;
		
		
while(start < end)
 {
			
			
output[start] = var;
			
var++;
			
output[end] = var;
			
var++;
			
			
start++; 
end--;
		
}
		
		
if(start == end) 
{
			
output[start] = var;
		
}
		
		
return output;
	
}

public static void printArray(int[] arr) 
{

	for(int i = 0; i < arr.length; i++) {
		
	System.out.print(arr[i] + " ");
		
}
	
}
	
	
	
	
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=patterns1.pattern(n);
    patterns1.printArray(a);
  }
}