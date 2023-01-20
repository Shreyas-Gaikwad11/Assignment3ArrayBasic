public class QueNo2 {
    public static void main(String[] args) {
        int[]arr = new int[10];
        int AL   = arr.length;

        int empID = 1;

        for (int i = 0 ; i < AL ; i++){
           arr[i] = empID;
            empID++;
        }

        for(int i = 0 ; i < AL ; i++){
            System.out.println(+arr[i]);

        }
    }
}
