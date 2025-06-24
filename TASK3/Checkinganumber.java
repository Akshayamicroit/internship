import java.util.Scanner;
public class Checkinganumber{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number:");
        int number1=scn.nextInt();

        if(number1<0) 
        {
            System.out.println("negative");}
        else if(number1>0){
            System.out.println("positive");
        }
        else{
            System.out.println("zero");
        }

    }
}