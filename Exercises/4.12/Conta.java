/*

Ações:
Sacar para retirar um valor do saldo
Depositar a fim de adicionar um valor ao saldo
calculaRendimento para devolver o seu ganho mensal

O que fazer:
Transformar o modelo acima em uma classe java.
*/

class Conta {
    String titularName;
    String agency;
    Data openAccountDate;
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

    double calculateYield() {
        System.out.println("To return your monthly earnings");
        balance = 2;
        return balance *= 0.1;
    };

    double GetBalance() {
        System.out.println("getbalance: " + balance);
        return balance;
    };

    String recuperaDadosParaImpressao() {
        return "Informaçoes da conta";
    }
};

class Data {
    int dia;
    int mês;
    int ano;
}