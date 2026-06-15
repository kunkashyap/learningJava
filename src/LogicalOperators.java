void main() {
    /*
    AND - $$
    OR - ||
    NOT - !
     */

    boolean a = true;
    boolean b = true;
    boolean c = true;
    if (a && b && c){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }




    boolean x = true;
    boolean y = false;
    boolean z = false;

    if ( x || y || z) {
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }


    boolean k = true;
    boolean l = false;
    boolean m = false;

    if ( !k) {
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }



}