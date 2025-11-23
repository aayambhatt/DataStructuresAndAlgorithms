package warmup.starPattern;

public class SquarePatternDiffWay {
    public static void main(String[] args) {
        for(int i = 0 ; i < 4 ; i++){
            StringBuilder row = new StringBuilder("");
            for(int j = 0 ; j<4 ; j++){
                row.append("* ");
            }
            System.out.println(row);
        }
    }
}
