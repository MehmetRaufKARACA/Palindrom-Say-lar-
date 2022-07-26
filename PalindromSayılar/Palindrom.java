package PalindromSayılar;

import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number){
       int temp = number, reverseNumber = 0, lastNumber;

       while(temp != 0){
        lastNumber = temp % 10;
        reverseNumber = (reverseNumber * 10) + lastNumber;
        temp /= 10;
       }
       if(number == reverseNumber){
        System.out.println(number + " palindrom bir sayıdır.");
        return true;
       }else{
        System.out.println(number + " palindrom bir sayı değildir.");
        return false;
       }
            
        
        
       
    }
    public static void main(String[]args){
       
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        isPalindrom(sayi);
        
    }
}