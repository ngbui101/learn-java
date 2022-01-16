import check.SecuredArithmetics;

public class DemoOverflow
{   
 /*   public class SecuredArithmetics
    {
        static int checkedIADD(int a, int b)
        {
            int r = a + b;
            if (( (a^r) & (b^r) ) < 0)
                System.out.println("Fehler: Overflow");
            return r;
        }
    }
*/

    public static void main(String[] args)
    {           
        int a = 3, b = 5, c = Integer.MAX_VALUE;
        System.out.println("c = " + c);
        System.out.println("c + a = " + (a + c));
        System.out.println("a + b = " + (a + b));
        System.out.println
            ("Mit overflow-Check: " + SecuredArithmetics.checkedIADD(a,c));
    }
} 
