import java.util.Scanner;

class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ตัวเลขที่ 1 : ");
        int a = sc.nextInt();
        System.out.print("ตัวเลขที่ 2 : ");
        int b = sc.nextInt();

        System.out.println("Result a+b : "+(a+b));
        System.out.println("Result a-b : "+(a-b));
        System.out.println("Result a*b : "+(a*b));
        System.out.println("Result a/b : "+(a/b));
        System.out.println("Result a%b : "+(a%b));
    }
}
