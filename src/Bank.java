public class Bank {

    String name;
    int rateofinterest;
    
    public void getDetails(){
        name = "Bank";
        rateofinterest = 15;
        System.out.println("Name of Bank : "+name+"\nRate of interest : "+rateofinterest);
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.getDetails();

        obj = new SBI();
        obj.getDetails();

        obj = new BOI();
        obj.getDetails();

        obj = new ICICI();
        obj.getDetails();

    }

}

class BOI extends Bank{

    String name;

    int rateofinterest;

    public void getDetails(){
        name = "BOI";
        rateofinterest = 11;
        System.out.println("Name of Bank : "+name+"\nRate of interest : "+rateofinterest);
    }

}

class ICICI extends Bank{
    String name;

    int rateofinterest;

    public void getDetails(){
        name = "ICICI";
        rateofinterest = 7;
        System.out.println("Name of Bank : "+name+"\nRate of interest : "+rateofinterest);
    }

}

class SBI extends Bank{

    String name;
    int rateofinterest;

    public void getDetails(){
        name = "SBI";
        rateofinterest = 13;
        System.out.println("Name of Bank : "+name+"\nRate of interest : "+rateofinterest);
    }
}
