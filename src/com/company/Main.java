package com.company;

public class Main {
    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int lastDigit = 0;
            int n = number;
            int suma = 0;

            while (n != 0) {
                lastDigit = n % 10;
                if( lastDigit%2 == 0){
                    suma += lastDigit;

                }
                n = n / 10;

            }

            return suma;

        }

        else
            return -1;
    }
    public static boolean hasSharedDigit(int n, int m){
        int lastDigit = 0;
        int lastDigit2 = 0;
        int lastDigit3 = 0;
        int lastDigit4 = 0;

        if (m >= 10 && m <= 99 && n >= 10 && n <= 99)
        {
                lastDigit = n % 10;
                n = n / 10;
                lastDigit2 = n % 10;
                lastDigit3 = m % 10;
                m = m / 10;
                lastDigit4 = m % 10;
            System.out.println(lastDigit);
            System.out.println(lastDigit2);
            System.out.println(lastDigit3);
            System.out.println(lastDigit4);
            if(lastDigit  == lastDigit3 )
                return true;
                else if (lastDigit == lastDigit4)
                    return true;
                else if (lastDigit2 == lastDigit3)
                    return true;
                else if (lastDigit2 == lastDigit4)
                    return true;
                else
                    return false;

        }

        else
            return false;

    }


    public static boolean isValid(int number){
        if (number >=10 && number <=1000)
            return true;
        else return false;
    }
    public static boolean hasSameLastDigit(int n, int m, int b){
        int lastDigit = 0;
        int lastDigit2 = 0;
        int lastDigit3 = 0;

        if( isValid(n) && isValid(m) && isValid(b) == true){

            lastDigit = n % 10;
            lastDigit2 = m % 10;
            lastDigit3 = b % 10;
            //System.out.println(lastDigit);
            //System.out.println(lastDigit2);
            //System.out.println(lastDigit3);

            if(lastDigit  == lastDigit3 )
                return true;
            else if (lastDigit == lastDigit3)
                return true;
            else if (lastDigit2 == lastDigit3)
                return true;
            else if (lastDigit2 == lastDigit)
                return true;
            else
                return false;



        }
        else return false;


    }



    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int licznik = 1;
            int sum = 0;
            while (true) {
                if (first % licznik == 0 && second % licznik == 0){
                    sum = licznik;
                }
                licznik++;
                if(licznik >= first && licznik >=second)
                {break;}

                         }
            return sum;


        }


    }
    public static void printFactors(int number){
        if (number < 1)
            System.out.println("Invalid Value");
        else {
            int licznik = 1;
            int sum = 0;
            while (true) {
                if (number == 1){
                    System.out.println("1");
                    break;
                }
                if (number % licznik == 0) {
                    System.out.println(licznik);
                }
                licznik++;
                if (licznik == number) {
                    System.out.println(licznik);
                    break;
                }

            }

        }
    }
public static boolean isPerfectNumber(int number) {
    if (number < 1)
        return false;
    else {
        int licznik = 1;
        int sum = 0;
        if(number == 1)
            return true;
        while (true) {
            if (number % licznik == 0) {
                sum += licznik;
            }
            licznik++;
            if (licznik == number) {
                if(sum == number)
                    return true;
                else return false;

            }

        }

    }
}

public static void numberToWords(int number){
        int lastDigit ;
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else {
            int istniejaceLiczby = getDigitCount(number);
            number = reverse(number);
            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit == 0)
                    System.out.println("Zero");
                else if (lastDigit == 1)
                    System.out.println("One");
                else if (lastDigit == 2)
                    System.out.println("Two");
                else if (lastDigit == 3)
                    System.out.println("Three");
                else if (lastDigit == 4)
                    System.out.println("Four");
                else if (lastDigit == 5)
                    System.out.println("Five");
                else if (lastDigit == 6)
                    System.out.println("Six");
                else if (lastDigit == 7)
                    System.out.println("Seven");
                else if (lastDigit == 8)
                    System.out.println("Eight");
                else if (lastDigit == 9)
                    System.out.println("Nine");
                //System.out.println(number);
                number = number / 10;
                istniejaceLiczby -= 1;

            }
            for(int i =  0; i < istniejaceLiczby ; i++)
            {
                System.out.println("Zero");
            }
        }


}
public static int reverse(int reversedNumber){
    int lastDigit;
    int sum = 0;
    while (reversedNumber != 0) {
        lastDigit = reversedNumber % 10;
        sum = sum * 10;
        sum += lastDigit * 10;
        reversedNumber = reversedNumber / 10;
       // System.out.println(sum);
    }
    return sum / 10;
}
public static int getDigitCount(int number){
        int sum = 0;
        if (number < 0)
            return -1;
        else if(number == 0)
            return 1;
        else {

            int lastDigit;
            while (number != 0) {
                lastDigit = number % 10;
                sum++;
                number = number / 10;
            }
        }
        return sum;

}


    public static void main(String[] args) {
        //System.out.println(reverse(-256));
        numberToWords(100);

    }
}
