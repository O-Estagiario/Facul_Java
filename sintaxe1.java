public class sintaxe1 {
    public static void main(String[] args) {
        //For & while e do while & swith case
        for(int i = 0; i < 5; i++){
            System.out.println("Contador: " + i);
        }

        System.out.println("--------------");

        int conta = 0;

        while(conta < 5){
            System.out.println("Conta: " + conta);
            conta++;
        }

        System.out.println("--------------");

        int ct = 1;

        do {
            System.out.println("Numero: " + ct);
            ct++;
        }  while (ct <= 3);

        System.out.println("--------------");


    }
}

 public static void main(String[] args){
            int opcao = 2;

            switch(opcao){
                case 1 :
                    System.out.println("UM AQUI");
                    break;
                case 2 :
                    System.out.println("DOIS AQUI");
                    break;
                case 3 :
                    System.out.println("TRÊS AQUI");
                    break;
                default:
                    System.out.println("AQUI NÃO");
            }
 }