public class sintaxe {
    public static void main (String[] args) {
        // Declaração de variáveis & Operadores aritméticos, relacionais e lógicos. 
        int idade = 20;
        char genero = 'M';
        double altura = 1.90;
        String nome = "Diogo";
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Genero: " + genero);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("EStudante? " + estudante);

        System.out.println("--------------");

        int a = 10;
        int b = 3;

        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + a*b);
        System.out.println("A / B = " + a/b);
        System.out.println("A % B = " + a%b);

        System.out.println("--------------");

        int i = 20;
        int j = 3;
        int soma = i + j;
        int menos = i - j;
        double dividir = i / j;
        int mult = i * j;

        System.out.println("I + J = " + soma);
        System.out.println("I - J = " + menos);
        System.out.println("I * J = " + mult);
        System.out.println("I / J = " + dividir);

        System.out.println("--------------");

        int nota = 25;

        if(nota == 100){
            System.out.println("Você tirou nota maxíma!!!");
        } else if(nota != 100 && nota >= 70){
            System.out.println("Você passou!!");
        } else {
            System.out.println("Você está de recuperação");
        }
    }
}