import java.util.Scanner;

public class sintaxe3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Qual sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + "! Você tem " + idade + " anos!!");

        sc.close();
    }
}