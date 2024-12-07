import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner user_input =new Scanner(System.in);
        System.out.println("What is your temperature in celsius");
     float celcius_temperature=user_input.nextFloat();
        System.out.println("The temperature in faranheit is "+((celcius_temperature * 9/5 )+32) +"F");




    }
}