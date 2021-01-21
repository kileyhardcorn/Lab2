class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 55*11;

    double blue, brown, green, orange, red, yellow;

    blue = (total*0.24);
    brown = (total*0.13);
    green = (total*0.16);
    orange = (total*0.20);
    red = (total*0.13);
    yellow = (total*0.14);

    System.out.println("blue: " + blue);

    System.out.println("brown: " + brown);

    System.out.println("green: " + green);

    System.out.println("orange: " + orange);

    System.out.println("red: " + red);

    System.out.println("yellow: " + yellow);

    double Sum = blue + brown + green + orange + red + yellow;

    System.out.println("Sum: " + Sum);

    if(blue > brown & red > orange) System.out.println("Blue over Brown and Red Over Orange");

    if(brown <= green) 
    System.out.println("Brown is less than or equal to Green");

    if(Sum == total) 
    System.out.println("Numbers match");


  }
}