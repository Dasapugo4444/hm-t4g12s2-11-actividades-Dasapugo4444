package co.edu.sena.ejercicio1;

public class App {

    public static void main(String[] args){

        WiiU wiiU=new WiiU(2,"Fosmon 2","HDMI");
        System.out.println();

        Snes nes=new Snes(1, "AV", "AV");
        System.out.println();

        Wii wii=new Wii(2,"Zvcu01","Anyqoo");
        System.out.println();

        Switch switch1=new Switch(2, "N/A", "Adaptador De Concentrador Hdmi Tipo C ");
        System.out.println();

        Psvita vita=new Psvita(0, "N/A", "HDMI");
        System.out.println();

        Play4 p4=new Play4(4, "Jack", "HDMI");
        System.out.println();

        Play3 p3=new Play3(4,"Jack", "HDMI");
        System.out.println();

        Play2 p2=new Play2(2,"Jack","AV");
        System.out.println();

        Play p1=new Play(2,"Jack","RCA VA");
        System.out.println();

        Play4Pro p4p=new Play4Pro(4, "Jack", "HDMI");
        System.out.println();

        Play4Slim p4s=new Play4Slim(4, "Jack", "HDMI");
        System.out.println();

        Play4Fat p4f=new Play4Fat(4, "Jack", "HDMI");
        System.out.println();

    }

}
