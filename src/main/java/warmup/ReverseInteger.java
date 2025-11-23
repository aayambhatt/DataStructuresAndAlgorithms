package warmup;

public class ReverseInteger{

    public static void main(String[] args) {

    }

    public int reverse(int x) {

        int revNo = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        while(x>0){
            int lastDigit = x%10;

            if(revNo>Integer.MAX_VALUE/10){
                return 0;
            }

            revNo = (revNo*10) + lastDigit;

            x = x/10;
        }

        return revNo*sign;

    }
}
