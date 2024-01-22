import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    }

    public static void Quiz() {
        Scanner scanner = new Scanner(System.in);
        int win = 0;
        int loss = 0;
        int total = 0;
        String operatorValue = "";

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        while(true) {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            Fraction ans = new Fraction();

            int operator = (int) (Math.random() *4 +1);
            if (operator == 1) {
                operatorValue = "+";
                ans = Fraction.add(f1, f2);
            } else if (operator == 2) {
                operatorValue = "-";
                ans = Fraction.subtract(f1, f2);
            } else if (operator == 3) {
                operatorValue = "*";
                ans = Fraction.multiply(f1, f2);
            } else {
                operatorValue = "/";
                ans = Fraction.divide(f1, f2);
            }

            System.out.println(f1 + " " + operatorValue + " " + f2 + " = " );
            String answer = scanner.nextLine();
            Fraction fracAnswer = new Fraction(answer);

            if (fracAnswer.getNum() == ans.getNum() && ans.getDenom() == fracAnswer.getDenom()) {
                System.out.println("Correct!");
                win++;
                total++;
            } else {
                System.out.println("Wrong, the answer was " + ans);
                loss++;
                total++;
            }
            if (answer.equals("quit")) {
                double perc = (double) win/total *100;
                System.out.println("Your win/loss ratio was " + win + "/" + total + ", for a score of " + (int) perc + " percent!");
                break;
            }


        }
    }

}
