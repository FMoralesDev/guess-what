package contador.sistema;

public class Cadastro {
    double valorGuardado, valorAdicionado;

    public Cadastro() {
        this.valorGuardado = 0.0;
    }

    public Cadastro(double saldoInicial) {
        this.valorGuardado = saldoInicial;
    }
    public void adicionar(double valor) {
        if (valor > 0) {
            this.valorGuardado += valor;
        }
    }

    public double getValorGuardado(){
        return this.valorGuardado;
    }
}
