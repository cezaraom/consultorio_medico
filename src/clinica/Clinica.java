package clinica;

public class Clinica {

    private int qtdPacientes;
    private int qtdMaxPacientes;
    private Paciente paciente;

    Paciente[] pacientes = new Paciente[3];

    public void cadastrarPacientes(Paciente paciente) {

        Paciente pacienteAtual = new Paciente();

        for (int i = 0; i < pacientes.length; i++) {

            if (pacientes[i] == null) {
                pacientes[i] = paciente;
                pacienteAtual = pacientes[i];

                qtdPacientes++;
                break;
            }

        }

        double peso = pacienteAtual.getPeso();
        double altura = pacienteAtual.getAltura();
        double imc = pacienteAtual.calcularIMC(peso, altura);

        System.out.printf("Cadastrado paciente %s com IMC %.3f%n", pacienteAtual.getNome(), imc);

    }

    public void listarPacientes() {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                System.out.println(pacientes[i].getNome());
            }
        }
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null && pacientes[i].getCpf().equals(cpf)) {
                return pacientes[i];
            }
        }
        return null;
    }

    public void buscarPacientePorIMC(double inicioIntervalo, double fimIntervalo) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                double imc = pacientes[i].getIMC();
                if (imc >= inicioIntervalo && imc <= fimIntervalo) {
                    System.out.println(pacientes[i]);
                }
            }
        }
    }

    public void alterarPaciente(Paciente paciente, double novaAltura, double novoPeso) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null && pacientes[i].equals(paciente)) {
                pacientes[i].setAltura(novaAltura);
                pacientes[i].setPeso(novoPeso);
                break;
            }
        }
    }
}
