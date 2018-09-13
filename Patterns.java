//package patternsAndLoops;


import java.util.Scanner;


public class Patterns 
{
	
	
public static void main(String[] args) 
{
		
		
Scanner s  = new Scanner(System.in);
		
int nRows = s.nextInt();
		
		
s.close();
		
		
int currRow = 1;
		
		
while(currRow <= nRows) 
{
			
			
//Spaces
			
int currSpace = 1;
			
while(currSpace <= nRows - currRow) 
{
				
System.out.print(" ");
				
currSpace++;
			
}
			
			
//Increasing
			
int currCol1 = 1;
			
while(currCol1 <= currRow) 
{
				
System.out.print(currCol1);
				
currCol1++;
			
}
			
			
int currCol2 = 1; int var = currRow - 1;
			
while(currCol2 <= currRow - 1) 
{
				
System.out.print(var);
				
var--;
				
currCol2++;
			
}
			
			
System.out.println();
			
currRow++;
			
		
}
		
	
}

}
