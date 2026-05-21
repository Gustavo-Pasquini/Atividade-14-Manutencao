import java.time.LocalDateTime;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;
    private Seguro seguro;

    public Veiculo(String placa, String modelo, String cor,
                   String seguradora, String numeroApolice, String telefoneAssistencia) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.seguro = new Seguro();

        if (seguradora != null) {
            seguro.setSeguradora(seguradora);
        }
        if (numeroApolice != null) {
            seguro.setNumeroApolice(numeroApolice);
        }
        if (telefoneAssistencia != null) {
            seguro.setTelefoneAssistencia(telefoneAssistencia);
        }
    }

    public void imprimirDados() {
        System.out.println("Veículo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Seguro: " + getDadosSeguroFormatados());
    }

    public String getDadosSeguroFormatados() {
        return seguro.getDadosSeguroFormatados();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getSeguradora() {
        return seguro.getSeguradora();
    }

    public String getNumeroApolice() {
        return seguro.getNumeroApolice();
    }

    public String getTelefoneAssistencia() {
        return seguro.getTelefoneAssistencia();
    }
}
