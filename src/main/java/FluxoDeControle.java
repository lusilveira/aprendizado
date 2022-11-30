public class FluxoDeControle {

    public static void main(String[] args){
        boolean ehVerdade = true;

        if (!ehVerdade ){
            System.out.println("Eh verdade");
        }

        ehVerdade = false;

                if(!ehVerdade){
                    System.out.println("Eh verdade");
                }else{
                    System.out.println("Não eh verdade");
                }

                ehVerdade = true;
                int x = 0;

            while (ehVerdade){
                System.out.println("Imprime");


                if(x == 5){
                    ehVerdade = false;
                }

               x++;

            }

            if(ehVerdade || x == 6 && ehVerdade != false){

            }

            for(int i = 0;
                i <=10;
                i = i + 1){
                System.out.println("Imprimi do FOR");
            }

    }

}
