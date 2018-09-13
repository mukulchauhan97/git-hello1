package patternsAndLoops;


import java.util.Scanner;


public class Arrays {
	
	
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
	
	


public static String replaceConsecutive(String str) 
{
		
int i = 0;
		
String out = "";
		
		
while(i < str.length()) 
{
			
			
int count = 1;
			
int j = i + 1;
			
			
while(j < str.length()) 
{
				
if(str.charAt(i) == str.charAt(j)) 
{
					
count++;
					
j++;
				
} 
else 
{
					
break;
				
}
			
}
			
out = out + str.charAt(i) +  count;
			
			
i = j;
		
}
		
		
return out;
	
}
	
	
public static void main(String[] args) 
{
		

//		int arr1[] = {1, 2, 6, 10, 12, 15, 20};

//		int arr2[] = {4, 5, 7, 17, 19, 21, 25, 30, 40, 50};

//		

//		
		String str = "aaabaaccddc";
		
		
String out = replaceConsecutive(str);
		
System.out.println(out);
		
		
System.out.println(('a' - 'b'));
	
}

}
