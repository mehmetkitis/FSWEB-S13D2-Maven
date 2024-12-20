package org.example;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(isPalindrome(-1221));*/

        /*System.out.println(isPerfectNumber(13));*/

        System.out.println(numberToWords(1234));

    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for(int i = digits.length-1 ; i>=0 ; i--){
            reversed = reversed + digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }

    public static boolean isPerfectNumber(int number){
        if(number<0){
            return false;
        }
        int total = 0;
        for (int i = 1 ; i<=number/2 ; i++){
            if(number%i == 0){
                total = total + i;
            }
        }
        return number == total;
    }

    public static String numberToWords(int number){
        if (number<0){
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";
        for (char digit : digits){
            switch (digit){
                case '0':
                    numToText = numToText + "Zero ";
                    break;
                case '1':
                    numToText = numToText + "One ";
                    break;
                case '2':
                    numToText = numToText + "Two ";
                    break;
                case '3':
                    numToText = numToText + "Three ";
                    break;
                case '4':
                    numToText = numToText + "Four ";
                    break;
                case '5':
                    numToText = numToText + "Five ";
                    break;
                case '6':
                    numToText = numToText + "Six ";
                    break;
                case '7':
                    numToText = numToText + "Seven ";
                    break;
                case '8':
                    numToText = numToText + "Eight ";
                    break;
                case '9':
                    numToText = numToText + "Nine ";
                    break;
            }
        }
        return numToText.trim();
    }
}
