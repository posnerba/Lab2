class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int Total;
    double Blue, Brown, Green, Orange, Red, Yellow;

    Total = 55 * 10;
    Blue = Total * .24;
    Brown = Total * .13;
    Green = Total * .16;
    Orange = Total * .20;
    Red = Total * .13;
    Yellow = Total * .14;

    System.out.println("Blue: " + Blue);
    System.out.println("Brown: " + Brown);
    System.out.println("Green: " + Green);
    System.out.println("Orange: " + Orange);
    System.out.println("Red: " + Red);
    System.out.println("Yellow: " + Yellow);

    double Sum;
    
    Sum = Blue + Brown + Green + Orange + Red + Yellow;
    
    System.out.println("Sum: " + Sum);

    if ( Blue > Brown && Green > Orange )
    System.out.println("Blue over Brown and Green over Orange");
    if ( Brown <= Red )
    System.out.println("Brown is less than or equal to Red");
    if ( Sum == Total )
    System.out.println("Numbers Match");


  }
}