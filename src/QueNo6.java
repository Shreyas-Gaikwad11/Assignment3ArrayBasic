public class QueNo6 {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int al = arr.length;
        for (int i = 0 ; i < al ; i ++) {

            if (arr[i] % 2 == 0) {

                System.out.println("\n EVEN NO : "+arr[i]);
            } else {

                System.out.println("\n ODD NO  : "+arr[i]);
            }
        }
        }
}
