package co.edu.sena.actividad06.acoplamiento2;

public class App {

    public static void main(String[] args){

        InterfaceClaseUno objetoClaseUno=new ClaseUno();
        InterfaceClaseDos objetoClaseDos=objetoClaseUno.getClaseDos();
        InterfaceClaseTres objetoClaseTres=objetoClaseDos.getClaseTres();
        InterfaceClaseCuatro objetoClaseCuatro=objetoClaseTres.getClaseCuatro();
        InterfaceClaseCinco objetoClaseCinco=objetoClaseCuatro.getClaseCinco();
        InterfaceClaseSeis objetoClaseSeis=objetoClaseCinco.getClaseSeis();
        InterfaceClaseSiete objetoClaseSiete=objetoClaseSeis.getClaseSiete();
        InterfaceClaseOcho objetoClaseOcho=objetoClaseSiete.getClaseOcho();
        InterfaceClaseNueve objetoClaseNueve=objetoClaseOcho.getClaseNueve();
        InterfaceClaseDiez objetoCLaseDiez=objetoClaseNueve.getClaseDiez();

    }

}
