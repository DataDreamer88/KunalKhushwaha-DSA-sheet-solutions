// Take integer inputs till the user enters 0 and print the sum of all numbers 
// Take integer inputs till the user enters 0 and print the largest number from all.


import java.util.*;
public class Inputtill0_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num, max=0;

        do{
            num = sc.nextInt();
            sum += num;
            if(num>max){
                max= num;
            }

        }while(num!=0); 
        
        System.out.println("Sum : " + sum);
        System.out.println("Largest : " + max);
    }
}


