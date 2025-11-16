package warmup.loopWithinLoop;

public class Nested1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.println(i + ", " + j);
                count++;
                System.out.println("Number of times inner loop ran: " + count);
            }
        }
    }
}
