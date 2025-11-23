package warmup;

public class CountDigits {
    public static void main(String[] args) {
        int num = 256;
        System.out.println(countDigits(num));

        System.out.println(countDigits(12365));
        System.out.println(countDigits(5));
        System.out.println(countDigits(0));
        System.out.println(countDigits(-400));

    }

    static int countDigits(int num){
        int count = 0;
        if(num==0){
            return 1;
        }

        num = Math.abs(num);

        while(num>0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
