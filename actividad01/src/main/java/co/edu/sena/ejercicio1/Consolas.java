package co.edu.sena.ejercicio1;

public abstract class Consolas {

    private int controles;
    private String conectorSonido;
    private String conectorVideo;

    public Consolas(int controles, String conectorSonido, String conectorVideo) {

    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles){
        this.controles=controles;
    }

    public String getConectorSonido() {
        return conectorSonido;
    }

    public void setConectorSonido(String conectorSonido) {
        this.conectorSonido = conectorSonido;
    }

    public String getConectorVideo() {
        return conectorVideo;
    }

    public void setConectorVideo(String conectorVideo) {
        this.conectorVideo = conectorVideo;
    }
}

