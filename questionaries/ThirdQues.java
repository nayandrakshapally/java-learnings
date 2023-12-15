package questionaries;

import java.util.Scanner;

//create a java pgm to calculate the simple interest. ask user to input principal amount, interest rate and time period. calculate and display simple interest
// If you invest 1000 with 5% annual interest rate for 3 years, you's earn 150 in simple interest
public class ThirdQues {
    public static void main(String[] args) {
        ThirdQues calc = new ThirdQues();
        Scanner pamount = new Scanner(System.in);
        Scanner roi = new Scanner(System.in);
        Scanner time = new Scanner(System.in);
        try {
            System.out.println("Enter principal amount");
            int principalAmount = pamount.nextInt();
            System.out.println("Enter rate of interest");
            int rateOfInterest = roi.nextInt();
            System.out.println("Enter time perios");
            int timePeriod = time.nextInt();
            int simpleInterest = calc.calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);
            System.out.println("Simple interest calculated -> " + simpleInterest);
        } catch (Exception e) {

        } finally {
            pamount.close();
            roi.close();
            time.close();
        }

    }

    public int calculateSimpleInterest(int pamount, int roi, int time) {
        return (pamount * roi * time) / 100;
    }

}
