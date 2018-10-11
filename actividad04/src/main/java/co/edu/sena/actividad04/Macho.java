package co.edu.sena.actividad04;

public class Macho extends Hormiga implements Obrero, Soldado, Explorador, HormigaInterface{

    public void construir(){
        System.out.println("prostagma");
    }

    public void arreglar(){
        System.out.println("arreglo");
    }

    public void recolectar(){
        System.out.println("recolecto");
    }

    public void excavar(){
        System.out.println("excavo");
    }

    public void luchar(){
        System.out.println("chnnn");
    }

    public void defender(){
        System.out.println("defiendo");
    }

    public void vigilar(){
        System.out.println("vigilo");
    }

    public void investigar(){
        System.out.println("investigo");
    }

    public void marcarCaminos(){
        System.out.println("marco caminos(?");
    }

    public void informar(){
        System.out.println("informo");
    }

    public void cuidarCasa(){
        System.out.println("q+e");
    }
}
