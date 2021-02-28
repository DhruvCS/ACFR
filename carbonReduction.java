import java.util.Scanner;
public class carbonReduction{
   public static void main(String[] args){
      Scanner key = new Scanner(System.in);
      System.out.print("How many cars do you have? :: ");
      int cars  = key.nextInt();
     System.out.print("How many electric cars do you have? :: ");
     int ecars  = key.nextInt();
     System.out.print("How many hybrid cars do you have? :: ");
     int hcars  = key.nextInt();
     System.out.print("How many Sq.ft is your house? :: ");
     int size  = key.nextInt();
     System.out.print("How many times per week do you use public transportation? :: ");
     int trans  = key.nextInt();
     System.out.print("How many new clothes do you buy per month? :: ");
     int cloths  = key.nextInt();
     System.out.print("Approximitly how many miles do you travel per day? :: ");
     int miles  = key.nextInt();
     System.out.print("How often do you bike,walk, or skateboard instead of using a car per week? :: ");
     int htrans  = key.nextInt();
     System.out.print("How many times do you consume red meat per week? :: ");
     int meat  = key.nextInt();
     
     if(cars>0){
        System.out.println("\n Make sure your tires are the right pressure, it gives better mileage.\n Try ethanol fuel.");
     }
     if(ecars>0){
        System.out.println("Turn on regenerative braking. \nMake sure your tires are the right pressure, it gives better mileage.");
     }
     if(hcars>0){
        System.out.println("Make sure your tires are the right pressure, it gives better mileage.\nTry ethanol fuel.\nTurn on regenerative braking.");
     }
     if(size>=4000){
        System.out.println("Adding solar panels stops the use of coal for electricity and would drastically decrease your carbon footprint.");
     }
     else{
        System.out.println("Unplug devices when not in use");
     }   
     if(cloths>4){
        System.out.println("Using public transport is a cheap and easy way to get from point a to point b, all while helping the environment.");
     }
     if(miles<5){
        System.out.println("For lower travel distances, consider walking, skateboarding, or biking. These alternatives are cheap and green");
     }
     else{
        System.out.println("For larger travel distances, try using trains or busses. Another option is to carpool with friends or family.");
     }
     if(htrans<5){
        System.out.println("For lower travel distances, consider walking, skateboarding, or biking. These alternatives are cheap and green.");
     }
     if(meat>3){
        System.out.println("Red meat causes 15% of the global greenhouse gasses. Consider replacing much of this meat with lean meats such as lean chicken, or other forms of protein, such as tofu.");
     }
   }
}