package co.edu.sena.actividad05;

public class App {

    public static void main(String [] args){

        System.out.println("Obrero:");

        Obrero obrero=new Obrero() {

            public void construir(){
                System.out.println("prostagma");
            }

            public void arreglar(){
                System.out.println("arreglo");
            }

            public void recolectar(){
                System.out.println("Recolecto");
            }

            public void excavar(){
                System.out.println("excavo,cavo,avo,vo,o");
            }

            public void cuidarCasa(){
                System.out.println("Te cuido la casa bb");
            }
        };

        obrero.construir();
        obrero.arreglar();
        obrero.cuidarCasa();
        obrero.excavar();
        obrero.recolectar();

        System.out.println("Soldado:");

        Soldado soldado=new Soldado() {

            public void luchar(){
                System.out.println("terrorists win");
            }

            public void defender(){
                System.out.println("defiendo");
            }

            public void vigilar(){
                System.out.println("vigilo :0");
            }

        };

        soldado.defender();
        soldado.luchar();
        soldado.vigilar();

        System.out.println("Explorador");

        Explorador explorador=new Explorador() {

            public void investigar(){
                System.out.println("cherlo jols");
            }

            public void marcarCaminos(){
                System.out.println("marco... polo");
            }

            public void informar(){
                System.out.println("informo");
            }

        };

        explorador.investigar();
        explorador.marcarCaminos();
        explorador.informar();
    }

}
