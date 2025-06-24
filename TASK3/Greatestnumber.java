import java.util.Scanner;
public class Greatestnumber{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter two number:");
        int number1=scn.nextInt();
        int number2=scn.nextInt();

        if(number1<number2) 
        {
            System.out.println(number2);}
        else if(number1>number2){
            System.out.println(number1);
        }
        else{
            System.out.println("both number are equal");
        }

    }
}