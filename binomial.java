// calculate binomial 
import java.util.*;
class binomial{
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is: " + factorial(n)/(factorial(r)*factorial(n-r)));
    }
}
