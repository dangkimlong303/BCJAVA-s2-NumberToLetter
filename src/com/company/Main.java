package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        int hund = number/100;
        int tens = (number-hund*100)/10;
        int ones = number-hund*100-tens*10;
        String strHundred = "";
        String strTens = "";
        String strOnes = "";

        switch (hund){
            case 1:
                strHundred = "one hundred ";
                break;
            case 2:
                strHundred = "two hundred ";
                break;
            case 3:
                strHundred = "three hundred ";
                break;
            case 4:
                strHundred = "four hundred ";
                break;
            case 5:
                strHundred = "five hundred ";
                break;
            case 6:
                strHundred = "six hundred ";
                break;
            case 7:
                strHundred = "seven hundred ";
                break;
            case 8:
                strHundred = "eight hundred ";
                break;
            case 9:
                strHundred = "nine hundred ";
                break;
            default:
                strHundred = "";
        }
        if (tens == 1){
            switch (ones){
                case 0:
                    strTens = "ten ";
                    break;
                case 1:
                    strTens = "eleven ";
                    break;
                case 2:
                    strTens = "twelve ";
                    break;
                case 3:
                    strTens = "thirteen ";
                    break;
                case 4:
                    strTens = "fourteen ";
                    break;
                case 5:
                    strTens = "fifteen ";
                    break;
                case 6:
                    strTens = "sixteen ";
                    break;
                case 7:
                    strTens = "seventeen ";
                    break;
                case 8:
                    strTens = "eighteen";
                    break;
                case 9:
                    strTens = "nineteen ";
                    break;
                default:
                    strTens = "";
            }
        }else {
            switch (tens){
                case 2:
                    strTens = "twenty ";
                    break;
                case 3:
                    strTens = "thirty ";
                    break;
                case 4:
                    strTens = "forty ";
                    break;
                case 5:
                    strTens = "fifty ";
                    break;
                case 6:
                    strTens = "sixty ";
                    break;
                case 7:
                    strTens = "seventy ";
                    break;
                case 8:
                    strTens = "eighty ";
                    break;
                case 9:
                    strTens = "ninety ";
                    break;
                default:
                    strTens = "";
            }
            if (hund==0 && tens == 0){
                switch (ones){
                    case 0:
                        strOnes = "zero ";
                        break;
                    case 1:
                        strOnes = "one ";
                        break;
                    case 2:
                        strOnes = "two ";
                        break;
                    case 3:
                        strOnes = "three ";
                        break;
                    case 4:
                        strOnes = "four ";
                        break;
                    case 5:
                        strOnes = "five ";
                        break;
                    case 6:
                        strOnes = "six ";
                        break;
                    case 7:
                        strOnes = "seven ";
                        break;
                    case 8:
                        strOnes = "eight ";
                        break;
                    case 9:
                        strOnes = "nine ";
                        break;
                    default:
                        strOnes = "";
                }
            }else {
                switch (ones){
                    case 1:
                        strOnes = "one ";
                        break;
                    case 2:
                        strOnes = "two ";
                        break;
                    case 3:
                        strOnes = "three ";
                        break;
                    case 4:
                        strOnes = "four ";
                        break;
                    case 5:
                        strOnes = "five ";
                        break;
                    case 6:
                        strOnes = "six ";
                        break;
                    case 7:
                        strOnes = "seven ";
                        break;
                    case 8:
                        strOnes = "eight ";
                        break;
                    case 9:
                        strOnes = "nine ";
                        break;
                    default:
                        strOnes = "";
                }
            }
        }
        System.out.println(strHundred + strTens + strOnes);
    }
}
