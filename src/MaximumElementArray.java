public class MaximumElementArray {
    static void main() {
        int [] arr = {1,22,4,2,66,73,21,31,86};
        int max = Integer.MIN_VALUE;
        for (int element : arr){
            if (element>max){
                max = element;

            }
        }
        System.out.println("Maximum Number in Array is: "+ max);
    }
}
