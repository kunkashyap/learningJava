void main() {
    //Q1.
    String name = "Kunal Kashyap";
    name = name.toLowerCase(Locale.ROOT);
    System.out.println(name);

    //Q2.
    String spaces = "                  Hello!!!                ";
    spaces = spaces.replace(' ', '_');
    System.out.println(spaces);

    //Q3.
    String letter = "Dear <|name|>, Thanks a lot";
    letter = letter.replace("<|name|>", "Kunal");
    System.out.println(letter);

    //Q4.
    String dtSpaces = "This String contains  doubles and triple spaces   ";
    System.out.println(dtSpaces.indexOf("  "));
    System.out.println(dtSpaces.indexOf("   "));

    //Q5.
    String myLetter = "Dear Kunal,\n\t This Java course is nice,\n\t Thanks.";
    System.out.println(myLetter);







}