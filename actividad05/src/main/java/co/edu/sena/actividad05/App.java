package co.edu.sena.actividad05;

public class App {

    public static void main(String [] args){

        System.out.println("Obrero:");

        Obrero obrero=new Obrero() {

            public void comer() {
                System.out.println("como");
            }

            public void repirar() {
                System.out.println("respiro");
            }

            public void caminar() {
                System.out.println("Caminar");
            }

            public void correr() {
                System.out.println("correr");
            }

            public void nacer() {
                System.out.println("nacer");
            }

            public void morir() {
                System.out.println("morir");
            }

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
        obrero.caminar();
        obrero.comer();
        obrero.correr();
        obrero.morir();
        obrero.nacer();
        obrero.repirar();

        System.out.println("Soldado:");

        Soldado soldado=new Soldado() {

            public void comer() {
                System.out.println("como");
            }

            public void repirar() {
                System.out.println("respiro");
            }

            public void caminar() {
                System.out.println("Caminar");
            }

            public void correr() {
                System.out.println("correr");
            }

            public void nacer() {
                System.out.println("nacer");
            }

            public void morir() {
                System.out.println("morir");
            }

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
        soldado.caminar();
        soldado.comer();
        soldado.correr();
        soldado.morir();
        soldado.nacer();
        soldado.repirar();

        System.out.println("Explorador");

        Explorador explorador=new Explorador() {

            public void comer() {
                System.out.println("como");
            }

            public void repirar() {
                System.out.println("respiro");
            }

            public void caminar() {
                System.out.println("Caminar");
            }

            public void correr() {
                System.out.println("correr");
            }

            public void nacer() {
                System.out.println("nacer");
            }

            public void morir() {
                System.out.println("morir");
            }

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
        explorador.caminar();
        explorador.comer();
        explorador.correr();
        explorador.morir();
        explorador.nacer();
        explorador.repirar();
    }

}
