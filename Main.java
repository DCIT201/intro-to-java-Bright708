import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner user_input =new Scanner(System.in);
       int celsius=1;
       int farenheit=2;
        System.out.println("If you're converting from celsius to farenheit,press 1 . Press 2 if otherwise");

     int celcius_farenheit_temperature=user_input.nextInt();
     if (celcius_farenheit_temperature==celsius){
         Scanner User_temperature =new Scanner(System.in);
         System.out.println("What is your temperature in celsius");
         float celsius_temperature_input=User_temperature .nextFloat();
         System.out.println("The temperature in faranheit is "+((celsius_temperature_input * 9/5 )+32) +"F");


     } else if (celcius_farenheit_temperature==farenheit) {
         Scanner User_temperature =new Scanner(System.in);
         System.out.println("What is your temperature in farenheit");
         float farenheit_temperature_input=User_temperature .nextFloat();
         System.out.println("The temperature in faranheit is "+((farenheit_temperature_input-32 )*5/9) +"c");

     }








    }
}