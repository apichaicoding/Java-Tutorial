import java.util.Scanner;

class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("C or F ");
        String check = sc.nextLine();
        if (check == "F") {
            System.out.print("องศา : ");
            float fahren = sc.nextFloat();

            float cel = (fahren - 32) * 5 / 9;
            System.out.println("องศสฟาเรนไฮร์ : " + fahren + " = องศาเซลเซียร : " + cel);
        } else {
            System.out.print("องศา : ");
            float cel = sc.nextFloat();

            float fahren = (cel * 9 / 5) + 32;
            System.out.println("องศาเซลเซียร : " + cel + " = องศสฟาเรนไฮร์ : " + fahren);
        }

    }
}
