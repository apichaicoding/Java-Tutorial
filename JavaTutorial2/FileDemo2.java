import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("Introduction.txt"));
            BufferedReader br = new BufferedReader(reader);
            String message = "";

            while ((message = br.readLine()) != null) {
                System.out.println(message);
            }
            // int data;
            // while ((data = reader.read()) != -1) {
            // System.out.printf("%c",data);
            // }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
