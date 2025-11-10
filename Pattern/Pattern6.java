public class Pattern6 {
    public static void main(String[] args) {
        pattern28(9);
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            // Print spaces in row 
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }

            // New line
            System.out.println();
        }
    }
}
