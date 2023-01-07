import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Switch Value::: ");
        int switchValue = sc.nextInt();
        switch (switchValue) {
            case 1 -> System.out.println("Value Was 1");
            case 2 -> System.out.println("Value Was 2");
            case 3 -> System.out.println("Value Was 3");
            case 4,5,6 -> System.out.println("Value was 4,5 or 6");
            default -> System.out.println("Enter Valid Value");
        }
    }
}
