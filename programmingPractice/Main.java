public class Main {
    public static void main(String[] args) {
        // String str = "Hello world!";
        // int[] freq = new int[256];
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     freq[ch]++;
        // }
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     System.out.println(ch + ": " + freq[ch]);
        // }

        // String str1 = "Dev Debasis Qspider";
        // String word = "";
        // String maxWord = "";

        // for (int i = 0; i < str1.length(); i++) {
        //     if (str1.charAt(i) != ' ') {
        //         word += str1.charAt(i);
        //     } else {
        //         if (word.length() >= maxWord.length()) {
        //             maxWord = word;
        //         }
        //         word = "";
        //     }

        //     // Check the last word after the loop ends
        //     if (i == str1.length() - 1) {
        //         if (word.length() >= maxWord.length()) {
        //             maxWord = word;
        //         }
        //         word = "";
        //     }
        // }

        // System.out.println(maxWord);

        // String str2 = "Hello";
        // // String res= "";
        // int[] freq1 = new int[256];
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str2.charAt(i);
        //     // if(!check(res, ch)) {
        //     // res += ch;
        //     // }
        //     freq1[ch]++;
        // }
        // // System.out.println(res);

        // for (int i = 0; i < 256; i++) {
        //     if (freq1[i] == 1) {
        //         System.out.print((char) i);
        //     }
        // }

        // String str3 = "listen";
        // String str4 = "silent";
        // int[] freq2 = new int[256];
        // boolean isAnagram = true;
        // if (str3.length() != str4.length()) {
        //     isAnagram = false;
        // }
        // for (int i = 0; i < str3.length(); i++) {
        //     char ch = str3.charAt(i);
        //     freq2[ch]++;
        // }
        // for (int i = 0; i < str4.length(); i++) {
        //     char ch = str4.charAt(i);
        //     freq2[ch]--;
        // }
        // for (int i = 0; i < 256; i++) {
        //     if (freq[i] != 0) {
        //         isAnagram = false;
        //     }
        // }
        // if (isAnagram) {
        //     System.out.println(str3 + " & " + str4 + " are Anagram");
        // } else {
        //     System.out.println(str3 + " " + str4 + " are not Anagram");
        // }

        // String str5 = "abcdefdghijklmnopqrstuvwxyz";
        // int[] freq3 = new int[26];
        // boolean isPanagram = true;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     freq3[ch - 'a']++;
        // }
        // for (int i = 0; i < freq3.length; i++) {
        //     if (freq3[i] == 0) {
        //         isPanagram = false;
        //     }
        // }
        // if (isPanagram) {
        //     System.out.println(str5 + " is panagram");
        // } else {
        //     System.out.println(str5 + " is not panagram");
        // }

        // String str6 = "Hi I am 20 years old and my name is RHYTHM.";
        // int upperCount = 0;
        // int lowerCount = 0;
        // int digitCount = 0;
        // int specialCount = 0;
        // for (int i = 0; i < str6.length(); i++) {
        //     char ch = str6.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         lowerCount++;
        //     } else if (ch >= 'A' && ch <= 'Z') {
        //         upperCount++;
        //     } else if (ch >= '0' && ch <= '9') {
        //         digitCount++;
        //     } else {
        //         if (ch != ' ') {
        //             specialCount++;
        //         }
        //     }
        // }
        // System.out.println("upper count: " + upperCount);
        // System.out.println("lower count: " + lowerCount);
        // System.out.println("digit count: " + digitCount);
        // System.out.println("special count: " + specialCount);

        // int num = 145;
        // int original = num;
        // int sum = 0;
        // while (num != 0) {
        //     int rem = num % 10;
        //     int fact = factorial(rem);
        //     sum += fact;
        //     num /= 10;
        // }
        // if (original == sum) {
        //     System.out.println(original + " is a strong number");
        // } else {
        //     System.out.println(original + " is not a strong number");
        // }

        int num1 = 5; // number of primes to find
        int number = 2; // starting from the first prime number
        int count = 0;

        while (count < num1) {
            boolean isPrime = true;
            int c = 2;

            while (c <= Math.sqrt(number)) {
                if (number % c == 0) {
                    isPrime = false;
                    break; // exit the loop early
                }
                c++;
            }

            if (isPrime) {
                System.out.println(number + " is a prime number");
                count++;
            }

            number++;
        }
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean check(String str, char ch) {
        boolean isPresent = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                isPresent = true;
            }
        }
        return isPresent;
    }

}