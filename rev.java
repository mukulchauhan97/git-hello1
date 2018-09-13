import java.util.*;
public class rev
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    String r[]=s.split(" ");
    String reve = "";
    for(int i=0;i<r.length;i++)
    {
      for(int j=r[i].length()-1;j>=0;j--)
      {
        reve=reve+r[i].charAt(j);
      }
        reve=reve+" ";
    }
    System.out.println(reve);
  }
}