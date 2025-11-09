package warmup.functions;

public class Square {
    static int squareOfNum(int num){
        return num*num;
    }

    public static void main(String[] args) {
        int result = squareOfNum(5);
        System.out.println(result);

        int result2 = squareOfNum(-3);
        System.out.println(result2);
    }
}
