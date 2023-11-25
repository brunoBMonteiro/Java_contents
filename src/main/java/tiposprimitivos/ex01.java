package tiposprimitivos;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = Scanner.nextLine();
        System.out.println("Digite o seu endereço: ");
        String endereco = Scanner.nextLine();
        System.out.println("Digite o seu salário: ");
        Double salario = Scanner.nextDouble();
        System.out.println("Digite o seu dia de nascimento: ");
        int dia = Scanner.nextInt();
        System.out.println("Digite o seu mês de nascimento: ");
        int mes = Scanner.nextInt();
        System.out.println("Digite o seu ano de nascimento: ");
        int ano = Scanner.nextInt();
        String data = dia + "/" + mes + "/" + ano;

        System.out.println("Eu " + nome + " morando no endereço, " + endereco + " confirmo que recebi o salário de " + salario + " na data " + data + ".");
    }
}
