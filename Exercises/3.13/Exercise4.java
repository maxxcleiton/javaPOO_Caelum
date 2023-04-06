class Exercise4 {
    public static void main(String[] args) {
        //Print the factorial numbers from 1 to 10.
	
	    int factorial = 1;

	    for (int n = 1; n<=10; n++){
		factorial = factorial*n;
		
        System.out.println("The factorial number of " +n+ " is: " +factorial);
    };
	        
    };
};
