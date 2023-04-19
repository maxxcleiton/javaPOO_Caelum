class TestaConta {
    public static void main(String[] args) {
        
        // I can use this way:
            // Conta minhaConta;
            // minhaConta = new Conta();
        
        // Or either this way:
            Conta minhaConta = new Conta();
        
        
            // To withdraw money
        minhaConta.withdraw();

        // To deposit money
        minhaConta.deposit();

        // To return your monthly earnings
        minhaConta.calculateYield();

        
        Data data = new Data();
        minhaConta.openAccountDate = data;

        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.titularName = "Danilo";
        c1.balance = 100;

        c2 = c1;
        // result: they are the same


        // Conta c2 = new Conta();
        // c2.titularName = "Danilo";
        // c2.balance = 100;
        // result: they are different

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

    };
};