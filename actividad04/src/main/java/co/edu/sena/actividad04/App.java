package co.edu.sena.actividad04;

public class App {

    public static void main(String[] args){

        Obrero machoObrero =new Macho();
        machoObrero.arreglar();
        machoObrero.construir();
        machoObrero.cuidarCasa();
        ((Macho) machoObrero).defender();
        machoObrero.excavar();
        ((Macho) machoObrero).informar();
        ((Macho) machoObrero).investigar();
        ((Macho) machoObrero).luchar();
        ((Macho) machoObrero).marcarCaminos();
        machoObrero.recolectar();
        ((Macho) machoObrero).vigilar();


    }

}
