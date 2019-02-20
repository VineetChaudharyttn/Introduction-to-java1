public class Q187 {

    static String firstname="Vineet",lastName="Chaudhary";
    static int age =22;

    public static void question7(){
        System.out.println("Printing in static Method\n"+firstname+" "+lastName+" "+age);
    }

    static {
        System.out.println("Printing in static block\n"+firstname+" "+lastName+" "+age);
    }


    public static void main(String[] args) {

        question7();

        System.out.println("Printing in static Variables\n"+firstname+" "+lastName+" "+age);
    }
}
