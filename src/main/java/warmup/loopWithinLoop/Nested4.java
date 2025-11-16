package warmup.loopWithinLoop;

public class Nested4 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 5 ; i>0 ; i--){
            for(int j = 0 ; j<i ; j++){
                System.out.println(i + ", " + j);
                count++;
                System.out.println("Number of times inner loop ran: " + count);
            }
        }
    }
}
