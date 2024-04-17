package clinica;

public class Paciente {

    private String nome;
    private String cpf;
    private double altura;
    private double peso;
    private double imc;

    public Paciente() {
    }

    public Paciente(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente(String nome, String cpf, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        this.imc = imc;
        return imc;
    }

    public double getIMC() {
        return imc;
    }

    @Override
    public String toString() {
        return "Paciente " + nome +
                ", CPF = " + cpf +
                ", Altura = " + altura +
                ", Peso = " + peso +
                ", IMC = " + imc;
    }
}