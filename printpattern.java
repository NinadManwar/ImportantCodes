public class printpattern {
    public static void printpattern(int n) {
        int i,j,count;

        for (i = 0; i < n; i++) {
            count = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // write your code here
        printpattern.printpattern(8);
    }

}
