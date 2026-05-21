import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValorMonetario {
    private BigDecimal valor;

    public ValorMonetario(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String formataValor() {
        return "R$ "
                + valor.setScale(2, RoundingMode.HALF_UP)
                .toString()
                .replace(".", ",");
    }

    public void indicaTipoPagamento (BigDecimal valorReferencia) {
        if (this.valor.compareTo(valorReferencia) >= 0) {
            System.out.println("Classificação: pagamento de alto valor");
            return;
        }
        System.out.println("Classificação: pagamento comum");
    }
}
