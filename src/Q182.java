public class Q182 {

    public void question2(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.nextLine();
        System.out.print("Enter string to be check:");
        String cstr=sc.nextLine();
        int temp=0,count=0,i=0;

        while (temp>-1){
            temp=str.indexOf(cstr,i);
            i=temp+1;
            if (temp>-1)
            count++;
        }
        System.out.println("occurrence="+count);
    }

    public static void main(String[] args) {
        Q182 obj = new Q182();
        obj.question2();
    }
}
