import java.util.Scanner;

class Session1{
    public static void main(String args[]){
       //variables
       int num;
       num = 1;
       int num2 = 1;
       char ch = 'k';
       double d = 3.14;
       String s = "Hello";

       // output
    //    System.out.print("Hello World");
    //    System.out.print(s +" "+ num2);

        // operators
        // System.out.print(((3+7)/2)%3+ "");

        //relational operators
        // System.out.print(num != num2);
        // < > <= >= == !=

        //logical operators
        // System.out.print(!(num==num2));
        // ||, &&, !

        // inc/ dec operators
        // int k = 10;
        
        // System.out.println(k++ +"");
        // System.out.println(k+"");
        // --k, k--
        // k+=2; // k = k+2;

        //----------------------------------------------

        // if- else

        int k = -7;
        if(k>0){
            System.out.println("Positive number");
            if(k>3)
                System.out.println("k is greater than 3");
        }
        else{
            if(k==0)
                System.out.println("Zero");
            else
                System.out.println("Negative number");

        }


        // else if

        if(k>0){
            System.out.println("Positive number");
        }
        else if(k==0)
            System.out.println("Zero");
        else
            System.out.println("Negative number");


    }
}