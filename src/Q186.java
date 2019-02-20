
import java.util.Arrays;

public class Q186 {

    public void question6(){
        int arr[]={1,2,3,5,6,7,8,9,1,2,3,5,6,7,8,9,4};
        Arrays.sort(arr);
        int once=arr[0];
        for(int i=1;i<arr.length;i++){
            System.out.println(once+" "+arr[i]);
            once= once^arr[i];
        }
        System.out.println("Element "+once+"is not duplicate:");
    }

    public static void main(String[] args) {
        Q186 obj = new Q186();
        obj.question6();
    }
}
