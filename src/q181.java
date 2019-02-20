public class q181 {

    void subString(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        System.out.println("Enter new Substring:");
        String rsub=sc.nextLine();
        System.out.println("Enter the SubString which is to be replaced:");
        String sub=sc.nextLine();
        String newstr=str.replaceAll(sub,rsub);
        System.out.print(newstr);
    }

    public static void main(String[] args) {
        q181 obj = new q181();
        obj.subString();
    }
}
