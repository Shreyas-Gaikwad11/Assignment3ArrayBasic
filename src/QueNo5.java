public class QueNo5 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6};
        int sum = 0;
        int al = arr.length;

        for(int i = 0; i < al; i++){
            System.out.println(+arr[i]);

            sum += arr[i];
        }
        System.out.println("SUM OF ARRAY : "+sum);
    }
}

