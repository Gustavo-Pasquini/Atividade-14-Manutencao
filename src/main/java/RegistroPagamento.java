import java.math.BigDecimal;
import java.math.RoundingMode;

public class RegistroPagamento {

    private TicketEstacionamento ticket;
    private Cliente cliente;
    private ValorMonetario valor;

    public RegistroPagamento(TicketEstacionamento ticket, Cliente cliente, BigDecimal valor) {
        this.ticket = ticket;
        this.cliente = cliente;
        this.valor = new ValorMonetario(valor);
    }

    public void imprimirComprovante() {
        String valorFormatado = valor.formataValor();

        System.out.println("Pagamento do ticket: " + ticket.getCodigo());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor: " + valorFormatado);

        valor.indicaTipoPagamento(new BigDecimal("50.00"));
    }

    public TicketEstacionamento getTicket() {
        return ticket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor.getValor();
    }
}
