package check;

public class SecuredArithmetics
{
    public static int checkedIADD(int a, int b)
    {
        int r = a + b;
        if (( (a^r) & (b^r) ) < 0)
        System.out.println("Fehler: Overflow");
        return r;
    }
 }


