import inout.Console;
public class LinearenGleichungen {
    public static void main(String[] args) {
        double a, b, c, d, e ,f;
        double x, y;
        System.out.println("Geben Sie bitte a, b, c , d, e, f ein");
        a = Console.readDoubleComma();
        b = Console.readDoubleComma();
        c = Console.readDoubleComma();
        d = Console.readDoubleComma();
        e = Console.readDoubleComma();
        f = Console.readDoubleComma();
        double nenner = a * e - b *d;
        if (Math.abs(nenner) > 0) {
            x = ( c*e - b*f ) / nenner;
            y = ( a*f - c*d ) / nenner;
            System.out.println
                ("Die Gleichungen haben x = " + x + " und y = " + y);
        } else {
            System.out.println("Errors Nenner = 0");
        }
    }
}

