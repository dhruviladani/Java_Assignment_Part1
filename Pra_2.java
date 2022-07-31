//21ce061
//Dhruvi Ladani
//Given a string, return a string made of the first 2 chars (if present), 
//however include first  char  only  if  it  is  'o' and  include  the  
//second  only  if  it  is  'z',  so  "ozymandias" yields "oz".
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"
import java.util.*;
class Pra_2
{
        public String startOz(String str) {
            if (str.startsWith("oz"))
          
              return "oz";
          
            else if (str.startsWith("o"))
          
              return "o";
          
            else if (str.startsWith("z", 1))
          
              return "z";
          
            else
          
              return "";
          }
}
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        test t = new test();
        String ans;
        ans=t.startOz(str);
        System.out.println("startOz("+str+")-->"+ans);
    }
}