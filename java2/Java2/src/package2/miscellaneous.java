
[4:08 PM] Antu Jilson(UST,IN)




import java.util.ArrayList;

import java.util.List;

import java.util.*;

 

public class Fprime {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int x =sc.nextInt();

        int y = sc.nextInt();

        List<Integer> fullPrimes = new ArrayList<Integer>();

 

        for (int i = x ; i < y; i++) {

            if (isPrime(i)) {

                String numString = Integer.toString(i);

                boolean isFullPrime = true;

                for (int j = 0; j < numString.length(); j++) {

                    int digit = Character.getNumericValue(numString.charAt(j));

                    if (!isPrime(digit)) {

                        isFullPrime = false;

                        break;

                    }

                }

                if (isFullPrime) {

                    fullPrimes.add(i);

                }

            }

        }

 

        if (fullPrimes.size() > 0) {

            for (int i = 0; i < fullPrimes.size(); i++) {

                System.out.print(fullPrimes.get(i));

                if (i < fullPrimes.size() - 1) {

                    System.out.print(",");

                }

            }

        } else {

            System.out.println("-1");

        }

    }

 

    private static boolean isPrime(int n) {

        if (n == 1) {

            return false;

        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }

}





