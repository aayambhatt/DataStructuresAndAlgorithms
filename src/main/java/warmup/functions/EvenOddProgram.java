package warmup.functions;

public class EvenOddProgram {
    static String isEvenOdd(int num){
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String res1 = isEvenOdd(8);
        System.out.println(res1);
        String res2 = isEvenOdd(27);
        System.out.println(res2);

    }
}
