class Exercise5 {
    public static void main(String[] args) {
        // Print the factorial numbers from 1 to 10, 20, 40.
        // And then change it from int to long

        long factorial = 1;

        for (int n = 1; n <= 40; n++) {
            factorial = factorial * n;

            System.out.println("The factorial number of " + n + " is: " + factorial);
        }
        ;

    };
};
