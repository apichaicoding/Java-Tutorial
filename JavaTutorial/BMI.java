import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) : ");
        double height = sc.nextDouble();
        weight/=100;

        double bmi = weight/(height*height);

        System.out.println("หนัก : "+weight);
        System.out.println("สูง : "+height);
        System.out.println("ค่า BMI : "+bmi);
        
    }
}
