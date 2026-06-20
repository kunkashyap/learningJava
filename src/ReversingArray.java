public class ReversingArray {
    static void main() {
        //Reversing an Array
        int  [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int a  = Math.floorDiv(l,2);
        int temp;
//        System.out.println(a);

        for (int i = 0; i < a; i++) {
           //Swap a[i] and a[l-1-i]
            // |4| |3| | |
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr){
            System.out.println(element);
        }


    }
}
