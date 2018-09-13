import java.util.*;

public class replac
{
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
	
	

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    String x = replac.replaceConsecutive(s);
    System.out.println(x);
  }
}