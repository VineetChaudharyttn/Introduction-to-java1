import java.util.Scanner;

public class Q184 {

    void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        int upper = 0, lowwer = 0, digit = 0, spacil = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowwer++;
            } else if (Character.isDigit(str.charAt(i))) {
                digit++;
            } else
                spacil++;

        }
        System.out.println("Upper case =" + (float)upper/str.length() + "\nLowwer case=" + (float)lowwer/str.length() + "\nDigit="
                + (float)digit/str.length() + "\nSpecial charecter=" + (float)spacil/str.length());
    }

    public static void main(String[] args) {
        Q184 obj = new Q184();
        obj.question4();
    }
}
