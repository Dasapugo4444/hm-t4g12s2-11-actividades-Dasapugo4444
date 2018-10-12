package co.edu.sena.actividad06.acoplamiento2.acoplamiento1;

public class App {

    public static void main(String [] args) {

       ClaseUno obClase1 =new ClaseUno();
       ClaseUno.ClaseDos obClase2 = obClase1.new ClaseDos();
       ClaseUno.ClaseDos.ClaseTres obClase3 = obClase2.new ClaseTres();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro obClase4 = obClase3.new ClaseCuatro();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco obClase5 = obClase4.new ClaseCinco();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis obClase6 = obClase5.new ClaseSeis();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete obClase7 = obClase6.new ClaseSiete();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho obclase8 = obClase7.new ClaseOcho();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve obClase9 = obclase8.new ClaseNueve();
       ClaseUno.ClaseDos.ClaseTres.ClaseCuatro.ClaseCinco.ClaseSeis.ClaseSiete.ClaseOcho.ClaseNueve.ClaseDiez obClase10 = obClase9.new ClaseDiez();
    }

    }


