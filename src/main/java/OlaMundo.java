public class OlaMundo {

    public static void main(String[] args){
        minhaFuncaoNaoRetornaNada();


    }
    static void minhaFuncaoNaoRetornaNada(){
        System.out.println("Não Retorna nada");
    }
    static int minhaFuncaoRetornaInteiro() {
        System.out.println("Minha Função retorna um inteiro");


       int numeroRetornado = 10;
    return numeroRetornado;
    }
    static String minhaFuncaRetornaRecebeString(String meuParam){
        meuParam = "Deve retornar este parametro";

        System.out.println(meuParam);
        return meuParam;
     }

}
