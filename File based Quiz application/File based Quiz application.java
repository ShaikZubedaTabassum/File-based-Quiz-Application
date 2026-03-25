import java.io.*;
import java.util.*;
class FileQuizApp {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] q = line.split("\\|");

                System.out.println("\n" + q[0]);
                System.out.println(q[1]);
                System.out.println(q[2]);
                System.out.println(q[3]);
                System.out.println(q[4]);

                System.out.print("Enter answer (A/B/C/D): ");
                String ans = sc.nextLine().toUpperCase();

                if (ans.equals(q[5])) {
                    score++;
                }
            }

            br.close();
            System.out.println("\nFinal Score: " + score);

        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
