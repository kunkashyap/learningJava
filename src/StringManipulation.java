import java.util.Scanner;


void main() {
    //Strings Methods
//    String name = "Kunal Kashyap";
//    System.out.println(name);
//
//    int value = name.length();
//    System.out.println(value);
//
//    String lowerCase = name.toLowerCase(Locale.ROOT);
//    System.out.println(lowerCase);
//
//    String upperCase = name.toUpperCase(Locale.ROOT);
//    System.out.println(upperCase);
//
//    String nTS = "                      Kunal         ";
//    System.out.println(nTS);
//
//    String tS = nTS.trim();
//    System.out.println(tS);


    /* SUBSTRING */
    String myName = "Kunal Kashyap";
    String mySurname = myName.substring(6);
    System.out.println(mySurname);


    String abc = myName.substring(4,10);
    System.out.println(abc);

    String name1 = "Kunal";
    String repName = name1.replace('l','p');
    System.out.println(repName);
    System.out.println(name1.replace("unal","un"));


    System.out.println(name1.startsWith("Ka"));
    System.out.println(name1.endsWith("l"));

    //Character at Index:-
    System.out.println(name1.charAt(2));

    //Index of Character
    System.out.println(name1.indexOf("un",2));

    System.out.println(name1.equalsIgnoreCase("kunal"));


    
    






}
