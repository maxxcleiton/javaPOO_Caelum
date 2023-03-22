class JavaOperatorsAndVariables{
    public static void main(String[]
    args) {
        // I want a name:
        String name = "Max";
        System.out.println(name);

        // Age:
        int birthdayYear = 1998;
        int currentlyYear = 2023;
        int maxAge;

        maxAge = currentlyYear - birthdayYear;

        System.out.println("Max's age is " + maxAge);

        // Double (float)

        double pi = 3.14;

        // Bool

        boolean isTrue = true;
        boolean isFalse = false;

        boolean isMaxUnderBrazilAge = maxAge < 18;
        System.out.println("Is Max's age under majority in Brazil?");
        
        System.out.println("The answer is: " + isMaxUnderBrazilAge);

        // Char

        char letter = 'a';
        System.out.println(letter);

        
    }
}