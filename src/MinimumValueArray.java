public class MinimumValueArray {
    static void main() {
        int [] arr = {1,4,65,44,-9,-211};

        int min = Integer.MAX_VALUE;
        for (int element : arr){
            if (element < min){
                min = element;
            }
        }
        System.out.println("Min value: " +min);
    }
}
