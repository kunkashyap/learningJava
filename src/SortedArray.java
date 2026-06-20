public class SortedArray {
    static void main() {
        //If this Array is sorted or Not?
        int [] arr = {1,3,5,6,44};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not Sorted");
        }

    }
}
