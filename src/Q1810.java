public class Q1810 {
    public void add(int i,int j){
        System.out.println("Addition is "+(i+j));
    }
    
    public void add(double i,double j){
        System.out.println("Addition1 is "+(i+j));
    }

    public void mul(float i,float j){
        System.out.println("Multiplication is "+(i*j));
    }
    
    public void mul(int i,int j){
        System.out.println("Multiplication1 is "+(i*j));
    }

    public void concat(String s1,String s2){
        System.out.println("Concatination is "+s1+s2);
    }

    public void concat(String s1,String s2,String s3){
        System.out.println("Concatination1 is "+s1+s2+s3);
    }

    public static void main(String[] args) {

        Q1810 obj = new Q1810();

        obj.add(10, 20);
        obj.add(56.34, 89.34);
        obj.mul(34.98f, 23.44f);
        obj.mul(54,82);
        obj.concat("Vineet","TTN");
        obj.concat("Dhanendra ", "TTN ", "Noida");

    }
}
