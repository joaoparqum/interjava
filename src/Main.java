import com.jp.interjava.aula53.DiaSemana;

public class Main {

    public static void main(String[] args) {
        imprimeEnum();
    }

    /*public static void usandoConstantes() {

        System.out.println("Teste usando constantes:");
        imprimeDia(DiaSemanaConstantes.SEGUNDA);
        imprimeDia(DiaSemanaConstantes.TERCA);
        imprimeDia(DiaSemanaConstantes.QUARTA);
        imprimeDia(DiaSemanaConstantes.QUINTA);
        imprimeDia(DiaSemanaConstantes.SEXTA);
    }*/

    public static void imprimeDia(DiaSemana dia) {

        switch(dia){
            case SEGUNDA:
                System.out.println("Segunda-feira");
            break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }

    }

    public static void imprimeEnum() {

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;

        System.out.println("Teste usando enuns");
        imprimeDia(segunda);
        imprimeDia(terca);
        imprimeDia(quarta);
        imprimeDia(quinta);
        imprimeDia(sexta);

    }

}