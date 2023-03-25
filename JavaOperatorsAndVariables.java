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

        System.out.println("Max's age is "
        + maxAge);

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

        /*
        Exercise (3.3):
        1. Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
        Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
        Sabendo que, em janeiro, foram gastos 15 mil reais,
        em fevereiro, 23 mil reais e, em março, 17 mil reais,
        faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
         */
        
        int januaryCost = 15000;
        int februaryCost = 23000;
        int marchCost = 17000;

        int quarterYearCost, monthlyCostAverage;

            // Despesa total no trimestre:
        quarterYearCost = januaryCost + februaryCost + marchCost;

            // Média mensal de gastos:
        monthlyCostAverage = quarterYearCost
        /3;

            // Impressão:
        System.out.println("Quarter year total cost: "
        + quarterYearCost);
        System.out.println("Median Monthly's cost: "
        + monthlyCostAverage);

            // Obrigando loop a executar o próximo passo:
        // for (int i = 0; i < 100; i++) {
        //     if (i > 50 && i	< 60) {
        //         System.out.println("It won't run here, from 51 to 59");
        //         continue;
        //     }
        //     System.out.println(i);
        // }

            // Brecando um loop num ponto específico:

        for (int i = 0; i < 30; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um numero divisivel por 19, entre os numeros 0 e 30 = (19)");
            }
        }

            // Casting:

        // O que não funciona:
        double d = 3.1415;
        // int i = d; // <- cannot convert from double to int

        // int x = 3.14; // <- cannot convert from double to int

        // double b = 5; // <- double can contain an integer number
        
        // int v = d; // <- cannot convert from double to int

        
        // O que funciona:
        int p = 5;
        double p2 = p; // <- double can contain an integer number
        
        // Casting -> moldado (casted) - Ex.1
        System.out.println("-------");
        System.out.println("Casting");
        System.out.println("-------");
        
        double d2 = 3.14;
        System.out.println("double d2 is: "
        + d2);

        int i2 = (int) d2; 
        System.out.println("After casting to in, the value of i2 from now is 3: "
        + i2);
        System.out.println("Casting rounds the floated number, and makes it an integer");


    }
}