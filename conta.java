public class conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    private boolean saca (double valor) {
        if (valor <= this.limite) {
            if (valor <= saldo) {
                this.saldo = this.saldo - valor;
                return true;
            }
        }return false;
    }
    private void deposita (double valor){

    }
    private void transfere (conta destino, double valor){

    }
}
