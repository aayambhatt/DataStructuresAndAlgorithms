package warmup;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(456));
        System.out.println(isPalindrome(44544));

    }

    static boolean isPalindrome(int num){

        int originalNo = num;

        if(num<0){
            return false;
        }

        int revNo = 0;
        while(num>0){
            int rem = num % 10;
            revNo = (10*revNo) + rem;
            num = num/10;
        }

        return revNo == originalNo;
    }

}
