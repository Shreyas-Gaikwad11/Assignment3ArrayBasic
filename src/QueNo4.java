public class QueNo4 {
    public static void main(String[] args) {
        int[] arr =  new int[]{3,4,5,6,1,7};
        int large = arr[0];

        int al = arr.length;
         for (int i = 0 ; i < al; i++){
             System.out.println(+arr[i]);

             if(arr[i]>large){
                 large = arr[i] ;
             }
         }    System.out.println("LARGEST ELEMENT ARE :"+large);


    }
}
