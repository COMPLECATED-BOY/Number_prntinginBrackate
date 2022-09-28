/*Suppose you want to print out numbers in brackets, formatted as
follows: [1][2][3], and so on. Write a method that takes two parameters: howMany and lineLength. The method should print out line numbers from 1 to howMany in the previous format, but it should not
output more than lineLength characters on any one line. It should
not start a [ unless it can fit the corresponding ] */

import java.util.Scanner;


class projexct3


{

    

    

    static void pro ( int a ,int b)

    {     if (b<3){
        System.out.println("error");
    }else
    {
        int j=b;
        int i=1;

        for(i=1;i<=a;i++)


        {
           
                System.out.print("["+i+"]");
              
                j-=3;
               if (j/3==0) {
                System.out.println();
                j=b;
                
               }
            
              
         
            }
           
            
        } 

    }
       
    


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many ");
int howmany  = sc.nextInt();
System.out.println("entern line lenght");
int linelength=sc.nextInt();

pro(howmany,linelength);


}


}