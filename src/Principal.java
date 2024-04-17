import clinica.Clinica;
import clinica.Paciente;
import util.Interface;

import java.util.Scanner;

public class Principal {

    public static final int QUANTIDADE_PESSOAS_CLINICA = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica();

        int opcao = -1;

        do {

            Interface.mostraMenu();

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    for (int i = 0; i < QUANTIDADE_PESSOAS_CLINICA; i++) {
                        System.out.println("Insira o nome do " + (i + 1) + "º paciente: ");
                        String nome = sc.nextLine();
                        System.out.println("Insira o cpf do " + (i + 1) + "º paciente: ");
                        String cpf = sc.nextLine();
                        System.out.println("Insira a altura do " + (i + 1) + "º paciente: ");
                        double altura = sc.nextDouble();
                        System.out.println("Insira o peso do " + (i + 1) + "º paciente: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Paciente paciente = new Paciente(nome, cpf, altura, peso);
                        clinica.cadastrarPacientes(paciente);
                    }

                    break;

                case 2:
                    clinica.listarPacientes();
                    break;

                case 3:

                    System.out.println("Digite o CPF do paciente a ser alterado: ");
                    String cpf = sc.nextLine();

                    Paciente paciente = clinica.buscarPacientePorCpf(cpf);
                    if (paciente != null) {

                        System.out.println("Insira a nova altura: ");
                        double novaAltura = sc.nextDouble();
                        System.out.println("Insira o novo peso: ");
                        double novoPeso = sc.nextDouble();
                        sc.nextLine();

                        clinica.alterarPaciente(paciente, novaAltura, novoPeso);

                        System.out.println("Paciente alterado com sucesso!");
                    }

                    break;

                case 4:

                    System.out.println("Digite o início do intervalo de valores dos IMCs dos pacientes: ");
                    double inicioIntervalo = sc.nextDouble();
                    System.out.println("Digite o final do intervalo de valores dos IMCs dos pacientes: ");
                    double fimIntervalo = sc.nextDouble();
                    sc.nextLine();

                    clinica.buscarPacientePorIMC(inicioIntervalo, fimIntervalo);

                    break;

                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente a opção desejada: ");

            }
        } while (opcao != 0);

        sc.close();
    }
}
