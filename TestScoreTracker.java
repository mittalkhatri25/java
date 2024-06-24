import java.util.ArrayList;
import java.util.Scanner;

public class TestScoreTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();         
        int[] scores = new int[n];

        String[] elements = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(elements[i]);
        }

        
        scanner.close();

        
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }

        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }
    }
}
