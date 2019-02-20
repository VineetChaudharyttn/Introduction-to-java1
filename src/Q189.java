class  Q189 {

    public static void main(String[] args) {
        for (Houses h: Houses.values()
             ) {
            h.getPrice();
        }
    }
    
}

enum Houses{

    ONEBHK(100000),TWOBHK(200000),THREEBHK(300000);

    int coste;

    Houses(int p){

        coste=p;

    }

    public void getPrice(){

        System.out.println(name()+" is of "+coste);

    }
}