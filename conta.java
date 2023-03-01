public class conta {
        public int numero;
        public double saldo;
        public double limite;
        public String nome;

        public boolean saco(double valor){
            if(valor <= this.limite){
                if(valor <= saldo){
                    this.saldo = this.saldo - valor;
                    System.out.println("Voce sacou " + valor + " reais.\nSaldo atual: " + this.saldo);
                    return true;
                }else{
                    System.out.printf("Você não possui esse montante\nSaldo atual: " + this.saldo);
                }
            }else {
                System.out.println("Acima do limite permitido.");
            }
            return false;
        }
        public void deposita(double valor){
            this.saldo = this.saldo + valor;
            System.out.println("Saldo atual: " + this.saldo + valor );
        }
        public void transfere(conta destino, double valor){
            if(valor <= this.saldo){
                saco(valor);
                destino.deposita(valor);
                System.out.println("Transferido " + valor + " reais");
            }else{
                System.out.println("Você não possui esse montante");

        }
    }
}
