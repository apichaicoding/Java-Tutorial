import java.io.*;

public class FileDomo {
    public static void main(String[] args) {
        // File f = new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Introduction.txt"));
            // writer.write("Hello World");
            // writer.write("สบายดีไหมครับ");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("สวัสดีครับ\n");
            bw.write("เขียนโปรแกรมภาษา Java เบื้องต้น\n");
            bw.write("โดย นายอภิชัย ถิ่นทองหลาง");
            // writer.close();
            bw.close();
            System.out.println("เขียนเสร็จแล้ว");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
