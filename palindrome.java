/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.*/

class Solution {
    public boolean isPalindrome(int x) {
            int number=reverse(x);
        if(x<0) return false;
        else{
        if(x==number) return true;
        else return false;
        }
    }
    public int reverse(int x) {
        int rem=1;
         int number=0;
        int flag=0;
        if(x<0){ 
            flag=1;
            x=x*(-1);
        }
        else flag=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            number=(number*10)+rem;
        }
        if(number>-2147483648 && number<=2147483647){
        if(flag==1) return (number*-1);
        else return number;
    }
        else return 0;
    }
    }

