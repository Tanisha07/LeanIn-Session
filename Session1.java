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

        /*
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

        */

        // for loops 
        // print 0-4
        for (int i = 0; i < 5; i++) {
            //System.out.println(i);
        }

        // odd numbers 0-10
        for (int i = 1; i <= 10; i+=2) {
            // System.out.println(i);
        }

        // print a string
        //i=3
        for (int i = 1; i <= 5; i++) {
            System.out.println(i-1+") Tanisha");
        }

        // print 5-1
        for(int i=5; i>=1; i--){
            // System.out.println(i);
        }

        // brackets
        for (int i = 0; i < 5; i++){ 
            // System.out.println(i);
            // System.out.println("Hi");
        }

        // int i=5;
        // for( ; i>=1; i--){
        //     // System.out.println(i);
        // }

        // System.out.println(i+"<-");

        //-----------------------------------------------------
        // while loop

        int i = 10;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // comparison with for loop
        for (int i = 10; i < 5; i++) {
            System.out.println(i);
        }



        //--------------------------------------
        // do while loop

        // int i = 10;
        do{
            System.out.println(i);
            i++;
        }
        while(i<5);

    }

    // nested for loops
}