public class QueNo3 {
    public static void main(String[] args) {

        int[] arr = new int[]{7,8,5,4,3,};

        int small = arr[0];
        int al = arr.length;

        for (int i = 0 ; i < al ; i++){
            System.out.println(+arr[i]);

            if (arr[i] < small){
                small = arr[i];
            }
        } System.out.println("SMALLEST ELEMENT IN ARRAY : "+small);
    }
}


