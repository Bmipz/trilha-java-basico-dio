public class Site {

    public static void main(String[] args) {
        Cliente Bmipz = new Cliente();
        Cliente Jean = new Cliente();
        Bmipz.setNome("Bmipz");
        Jean.setNome("Jean");

        Conta BmipzCC = new ContaCorrente(Bmipz);
        Conta JeanCC = new ContaCorrente(Jean);
        Conta poupancaBmipz = new ContaPoupanca(Bmipz);

        //Depositado valor de 100,00 e tentando transferir mas valor é insuficiente;
        BmipzCC.depositar(100);
        BmipzCC.transferir(150, poupancaBmipz);

        //Depositado valor de 150,00 na CC do Jean e foi conseguir realizar transferência por ter saldo suficiente;
        JeanCC.depositar(150);
        JeanCC.transferir(150, poupancaBmipz);

        BmipzCC.imprimirExtrato();
        JeanCC.imprimirExtrato();
        poupancaBmipz.imprimirExtrato();
    }
}
