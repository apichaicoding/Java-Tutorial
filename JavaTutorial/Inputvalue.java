//import Scanner
import java.util.Scanner;

class Inputvalue {
    public static void main(String[] args) {
        //input from Keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("ชื่อของคุณ : ");
        //variable get input
        String name = sc.nextLine();

        System.out.print("ป้อน พ.ศ. : ");
        int year = sc.nextInt();
        //current year 2564
        int age = 2564 - year ;

        System.out.println();
        System.out.println("---Profile---");
        System.out.println("สวัสดีคุณ "+name);
        System.out.println("ปีเกิด "+year);
        System.out.println("อายุ "+age);
        System.out.println();
    }
}
