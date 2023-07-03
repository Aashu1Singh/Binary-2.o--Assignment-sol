/**
 * Ques_4
 */
public class Ques_4 {

    public static void main(String[] args) {
        int num1 = 155;
        int num2 = 84;
        int num3 = 12;

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }
}