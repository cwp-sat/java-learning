package learning;

import java.util.Scanner;

//一个数除了1和自己以外，没有任何约数即为素数
public class PrimeNumberDetermination {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("You can enter a number to check if it's a prime number(You can enter 0 to exit)");
        while(true){
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("You have logged out");
            break;
        }
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
             isPrime=true;
             break;
            }
            isPrime=false;
        }
        if(!isPrime){
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not a prime number");
        }
        }
    }
}
