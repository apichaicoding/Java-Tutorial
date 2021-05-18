import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนเลข : ");
        int money = sc.nextInt();
        System.out.println("จำนวนเงิน : " + money);

        System.out.println("1,000 จำนวน " + ((money >= 1000) ? (money / 1000) : 0) + " ใบ");
        money%=1000;
        System.out.println("500 จำนวน " + ((money >= 500) ? (money / 500) : 0) + " ใบ");
        money%=500;
        System.out.println("100 จำนวน " + ((money >= 100) ? (money / 100) : 0) + " ใบ");
        money%=100;
        System.out.println("50 จำนวน " + ((money >= 50) ? (money / 50) : 0) + " ใบ");
        money%=50;
        System.out.println("20 จำนวน " + ((money >= 20) ? (money / 20) : 0) + " ใบ");
        money%=20;
        System.out.println("เหลือ : "+money);
    }

}
