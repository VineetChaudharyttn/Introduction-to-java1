import java.util.Scanner;

public class Q188 {
    public void question8(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        stringBuffer.delete(4,9);
        System.out.println(stringBuffer);

    }

    public static void main(String[] args) {

        Q188 obj = new Q188();

        obj.question8();
    }
}
