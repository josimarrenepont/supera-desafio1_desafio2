package Desafio1;

public class FlorSamambaia {

    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2){

        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if(distanciaCentros + r2 <= r1){
            return "RICO";
        }else{
            return "MORTO";
        }
    }
    public static void main(String [] args){
        System.out.println(tentativaDesenhar(5, 0,0,3,2,2));
        System.out.println(tentativaDesenhar(10,0,0,2,1,1));
    }
}
