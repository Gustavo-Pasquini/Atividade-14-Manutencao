public class Cobranca {

    private String banco;
    private String agencia;
    private String conta;
    private String metodoPagamentoPreferencial;

    public Cobranca(String banco, String agencia, String conta, String metodoPagamentoPreferencial) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
    }

    public String getDadosCobrancaFormatados() {
        return banco + " | Agência " + agencia + " | Conta " + conta
                + " | Método preferencial: " + metodoPagamentoPreferencial;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getMetodoPagamentoPreferencial() {
        return metodoPagamentoPreferencial;
    }

    public void setMetodoPagamentoPreferencial(String metodoPagamentoPreferencial) {
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
    }
}
