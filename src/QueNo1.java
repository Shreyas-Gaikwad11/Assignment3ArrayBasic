import javax.xml.transform.stream.StreamSource;

public class QueNo1 {
    public static void main (String[]args){

        int[] arr = {1,2,3,4,5,6};
        int AL    = arr.length;
        for (int i= 0; i < AL; i= i+2){
            System.out.println(arr[i]);
        }

    }
}
