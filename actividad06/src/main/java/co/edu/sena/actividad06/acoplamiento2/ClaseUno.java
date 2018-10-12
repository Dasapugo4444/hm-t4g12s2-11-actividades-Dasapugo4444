package co.edu.sena.actividad06.acoplamiento2;

public class ClaseUno implements InterfaceClaseUno{


    public InterfaceClaseDos getClaseDos() {
        return new ClaseDos();
    }

    public class ClaseDos implements InterfaceClaseDos {

        public InterfaceClaseTres getClaseTres() {
            return new ClaseTres();
        }

        public class ClaseTres implements InterfaceClaseTres {

            public InterfaceClaseCuatro getClaseCuatro() {
                return new ClaseCuatro();
            }

            public class ClaseCuatro implements InterfaceClaseCuatro {

                public InterfaceClaseCinco getClaseCinco() {
                    return new ClaseCinco();
                }

                public class ClaseCinco implements InterfaceClaseCinco {

                    public InterfaceClaseSeis getClaseSeis() {
                        return new ClaseSeis();
                    }

                    public class ClaseSeis implements InterfaceClaseSeis {

                        public InterfaceClaseSiete getClaseSiete() {
                            return new ClaseSiete();
                        }

                        public class ClaseSiete implements InterfaceClaseSiete {


                            public InterfaceClaseOcho getClaseOcho() {
                                return new ClaseOcho();
                            }

                            public class ClaseOcho implements InterfaceClaseOcho {

                                public InterfaceClaseNueve getClaseNueve() {
                                    return new ClaseNueve();
                                }

                                public class ClaseNueve implements InterfaceClaseNueve{

                                    public InterfaceClaseDiez getClaseDiez(){
                                        return new ClaseDiez();
                                    }

                                    public class ClaseDiez implements InterfaceClaseDiez{

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }


