package LeetCode;

public class Palindrome {
    public static void main(String[]args){
        int x = 121;
        System.out.println(checkPalindrome(x));
    }
    public static boolean checkPalindrome(int x){
        if(x < 0){
            return false;
        }
        int unrev = x;
        int rev = 0;
        while(x > 0){
            rev = rev*10 + x%10;
            x = x/10;
        }
        if(unrev == rev){
            return true;
        }
        return false;
    }
}
