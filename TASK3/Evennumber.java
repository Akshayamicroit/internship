import java.util.Scanner;
public class Evennumber{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=scn.nextInt();
        System.out.println(number%2==0?"even":"odd");
        
    }
}
