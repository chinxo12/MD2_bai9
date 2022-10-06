package bai3;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static String fizzBuzz(int number) {
        String fizzOrBuzz = "";
        if (number % 3 == 0 && number % 5 == 0) {
            fizzOrBuzz = "FizzBuzz";
        } else if (number % 3 == 0||(number+"").contains("3")) {
            fizzOrBuzz = "Fizz";
        } else if (number % 5 == 0||(number+"").contains("5")) {
            fizzOrBuzz = "Buzz";
        } else{
            fizzOrBuzz=number+"";
        }
        System.out.println(fizzOrBuzz);
            return fizzOrBuzz;
    }
}
