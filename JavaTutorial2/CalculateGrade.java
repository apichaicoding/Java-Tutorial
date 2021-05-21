import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CalculateGrade {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("Score.txt"));
            output = new PrintWriter(new File("Grade.txt"));
            String nisit = "";
            String grade = "";
            while (input.hasNext()) {
                nisit = input.nextLine();
                int pos = nisit.indexOf(" ");
                String scoreStr = nisit.substring(pos, nisit.length());
                // System.out.println("ข้อมูล = " + scoreStr.trim());

                double score = Double.parseDouble(scoreStr);
                grade = (score >= 80.0) ? "A" : (score >= 70.0) ? "B" : (score >= 60.0) ? "C" : "D";
                output.println(nisit + "  " + grade);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        output.close();
    }
}