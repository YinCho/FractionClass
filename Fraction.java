
/**
 * This class represents a fraction with a numerator and denominator
 *
 * @author Jerry You
 * @version 1.0
 */
public class Fraction {

    //Instance Variables
    private int numerator, denominator;

    /**
     * Default Constructor, Creates farctions of 1/1
     * 
     */
    //Constructors
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * Parameterized contructor
     * n = desired numerator
     * d = desired denominator
     */
    public Fraction(int n, int d) {
        if (d == 0) {
            System.out.println("Error: denominator can't be zero");
            d = 1;
        }
        numerator = n;
        denominator = d;
    }

    public Fraction(String str) {
        int n = str.indexOf("/");
        if(n > 0) {
            numerator = Integer.parseInt(str.substring(n-1,n));
            denominator = Integer.parseInt(str.substring(n+1,n+2));
        }

    }

    public Fraction(Fraction Frac) {
        numerator = numerator;
        denominator = denominator;
    }

    //Behaviour Methods
    public int getNum() {
        return numerator;

    }

    public int getDenom() {
        return denominator;

    }

    public String toString() {
        return numerator + "/" + denominator;

    }

    public double toDouble() {
        return (double) numerator/ denominator;
    }

    public void reduce() {
        int x = GCF();
        numerator /= x;
        denominator /=x;
    }

    public void setNum(int n) {
        numerator = n;
    }

    public void setDeno(int d) {
        denominator = d;
    }   
    
    public static Fraction multiply(Fraction Frac1, Fraction Frac2) {
        Fraction finalFrac = new Fraction(Frac1.numerator*Frac2.numerator, Frac2.denominator * Frac2.denominator);
        finalFrac.reduce();
        return finalFrac;
    }
    public static Fraction divide(Fraction Frac1, Fraction Frac2) {
        Fraction finalFrac = new Fraction(Frac1.numerator*Frac2.denominator, Frac1.denominator * Frac2.numerator);
        finalFrac.reduce();
        return finalFrac;
    }
    public static Fraction add(Fraction Frac1, Fraction Frac2) {
        Fraction finalFrac = new Fraction(Frac1.numerator*Frac2.denominator + Frac1.denominator * Frac2.numerator, Frac1.denominator *  Frac2.denominator);
        finalFrac.reduce();
        return finalFrac;
    }
    public static Fraction subtract(Fraction Frac1, Fraction Frac2) {
        Fraction finalFrac = new Fraction(Frac1.numerator*Frac2.denominator - Frac1.denominator * Frac2.numerator, Frac1.denominator *  Frac2.denominator);
        finalFrac.reduce();
        return finalFrac;
    }
    public int GCF() {
        int a = numerator;
        int b = denominator;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
    

