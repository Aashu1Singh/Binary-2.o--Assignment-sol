
public class Ques_2 {

    public static void printFib(int n) {

        if (n == 1) {
            System.out.print("0" + " ");
        } else if (n == 2) {
            System.out.println("0 " + "1");
        } else if (n > 2) {
            int num1 = 0;
            int num2 = 1;
            int num3 = 0;

            for (int i = 0; i < n; i++) {
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
                num3 = num1 + num2;

            }
        }

    }

    public static void main(String[] args) {

        int val = 6;
        printFib(val);

    }

}
