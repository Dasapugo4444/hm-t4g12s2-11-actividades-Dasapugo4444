package co.edu.sena.actividad04;

public class App {

    public static void main(String[] args){

        System.out.println("Obrero");
        Obrero machoObrero = new Macho();
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
        ((Macho) machoObrero).caminar();
        ((Macho) machoObrero).comer();
        ((Macho) machoObrero).correr();
        ((Macho) machoObrero).morir();
        ((Macho) machoObrero).nacer();
        ((Macho) machoObrero).respirar();

        System.out.println("------------");
        System.out.println("Soldado");

        Soldado machoSoldado = new Macho();
        ((Macho) machoSoldado).arreglar();
        ((Macho) machoSoldado).construir();
        ((Macho) machoSoldado).cuidarCasa();
        machoSoldado.defender();
        ((Macho) machoSoldado).excavar();
        ((Macho) machoSoldado).investigar();
        ((Macho) machoSoldado).informar();
        machoSoldado.luchar();
        ((Macho) machoSoldado).marcarCaminos();
        ((Macho) machoSoldado).recolectar();
        machoSoldado.vigilar();
        ((Macho) machoSoldado).caminar();
        ((Macho) machoSoldado).comer();
        ((Macho) machoSoldado).correr();
        ((Macho) machoSoldado).morir();
        ((Macho) machoSoldado).respirar();
        ((Macho) machoSoldado).nacer();

        System.out.println("------------");
        System.out.println("Explorador");

        Explorador machoExplorador = new Macho();
        ((Macho) machoExplorador).arreglar();
        ((Macho) machoExplorador).construir();
        ((Macho) machoExplorador).cuidarCasa();
        ((Macho) machoExplorador).defender();
        ((Macho) machoExplorador).excavar();
        machoExplorador.informar();
        machoExplorador.investigar();
        ((Macho) machoExplorador).luchar();
        machoExplorador.marcarCaminos();
        ((Macho) machoExplorador).recolectar();
        ((Macho) machoExplorador).vigilar();
        ((Macho) machoExplorador).caminar();
        ((Macho) machoExplorador).comer();
        ((Macho) machoExplorador).correr();
        ((Macho) machoExplorador).morir();
        ((Macho) machoExplorador).nacer();
        ((Macho) machoExplorador).respirar();
    }

}
