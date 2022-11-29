public class TiposDados {
    public static void main (String[] args){
        int meuPrimeiroNumero;
        boolean ehVerdade = true;
        double meuDecimal = 10.5;
        float meuFloat = 15.3f;// cast
        char character = 'a';
        String nome = "João";


        meuPrimeiroNumero = 10;

        int[] umArray = {20, 35, 100};
        int[] outroArray = new int[100];
        umArray[2] = 200;

        System.out.println(nome);
        System.out.println(umArray[2]);

        System.out.println(outroArray[25]);
        System.out.println(outroArray[99]);
    }

}
