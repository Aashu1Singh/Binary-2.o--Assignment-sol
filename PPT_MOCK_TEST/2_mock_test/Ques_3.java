import java.util.*;

public class Ques_3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(6);

        double sum = 0;
        int count = numbers.size();

        for (int number : numbers) {
            sum += number;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers found.");
        }
    }
}
