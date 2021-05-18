import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนเลข : ");
        int month = sc.nextInt();
        String name;

        switch (month) {
            case 1:
                name = "มกราคม";
                break;
            case 2:
                name = "กุมภาพันธ์";
                break;
            default:
                name = "เดือนอื่น";
                break;
        }
        System.out.println(name);
    }
}
