public class Q183 {

    public void question3(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        System.out.println("Enter the charecter for occurrence:");
        String sear=sc.nextLine();

        int remain=str.replace(sear,"").length();
        System.out.println("occurrence = "+(str.length()-remain));
    }

    public static void main(String[] args) {
        Q183 obj = new Q183();
        obj.question3();
    }
}
