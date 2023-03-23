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
    }
}