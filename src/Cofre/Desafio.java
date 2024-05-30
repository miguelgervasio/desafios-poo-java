package Cofre;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            CofreDigital cofreDigital = new CofreDigital(scanner.nextInt());
            if (!cofreDigital.validarSenha(scanner.nextInt())) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            } else {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        scanner.close();
    }
}