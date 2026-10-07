import java.util.*;

class ExceptionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int no1=0,no2=0,Ans=0;

        try
        {

             System.out.println("Enter first number:");
             no1=sobj.nextInt();

             System.out.println("Enter secound number:");
             no2=sobj.nextInt();
  
             Ans=no1/no2;

        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occured:"+aobj);
            
        }

        finally
        {
            System.out.println("Inside finally block");
        }

        System.out.println("Division is:"+Ans);
    }
}