import java.util.*;
import java.io.*;
class factorial{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result= factorial(n);
     System.out.println(result);
    }

    public static int factorial(int n){
if(n==0)
{
    return 1;
}
  else {
    return (n * factorial(n - 1));
}
    }}