public class VariableArguments {

        static int sum(int ...arr){
            //Available as int [] arr
            int result = 0;
            for (int a : arr){
                result += a;
            }
            return  result;
         }


        static void main() {
        System.out.println("LEARNING VarArgs ");
        System.out.printf("The sum is: "+ sum(10,4,5,8,9));
        System.out.println("The sum of nothing is: "+ sum());



    }
}
