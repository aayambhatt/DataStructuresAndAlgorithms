package warmup.starPattern;

public class RightAlignedRightAngleTrianglePattern {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            // print spaces (2 spaces per missing star)
            for (int s = 0; s < 4 - i - 1; s++) {
                System.out.print("  ");   // <-- two spaces here
            }

            // print stars with a following space each
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println(); // move to next row
        }
    }
}
