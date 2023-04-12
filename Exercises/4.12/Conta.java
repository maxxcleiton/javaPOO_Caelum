/*

Ações:
Sacar para retirar um valor do saldo
Depositar a fim de adicionar um valor ao saldo
calculaRendimento para devolver o seu ganho mensal

O que fazer:
Transformar o modelo acima em uma classe java.
*/

class Conta  {
    String titularName;
    String agency;
    String openAccountDate;
    double balance;
    double number;
	
    void withdraw() {
        System.out.println("To withdraw money");
        balance -= number;

    };
    
    void deposit() {
        System.out.println("To deposit money");
        balance += number;
    };
    
    double calculaRendimento() {
        System.out.println("To return your monthly earnings");
        balance = balance * 0.1;
        return balance;
    };
    
};

class TestaConta {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
	
        // To withdraw money
    minhaConta.withdraw();


        // To deposit money
    minhaConta.deposit();

        // To return your monthly earnings
    minhaConta.calculaRendimento();

};
};