import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        display("1");
        System.out.println(getIP());
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Number a : ");
        // int a = sc.nextInt();
        // System.out.print("Number b : ");
        // int b = sc.nextInt();
        // System.out.println("ผลรวมที่ได้ : " + sum(a, b));
        int[] nummberA = { 10, 20, 30, 40, 50, 60 };
        displayArray(nummberA);
    }

    // Create method
    static void display(String check) {
        System.out.println((check == "1") ? "TH" : "EN");
    }

    // create method return
    static String getIP() {
        return "127.0.0.1";
    }

    // create method parameter and return
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // create method array
    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            System.out.println("ลำดับที่ : " + i + " ต่า : " + arr[i]);
        }
    }
}
