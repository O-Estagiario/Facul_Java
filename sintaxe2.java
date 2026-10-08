public class sintaxe2 {
    public static void main(String[] args) {
        saudacao();
        exibirDobro(56);
    }
    public static void saudacao(){
        System.out.println("Seja bem vindo!");
    }

    public static void exibirDobro(int nm){
        int resultado = nm * 2;
        System.out.println("O Dobro de " + nm + " é " + resultado);
    }
    
}
