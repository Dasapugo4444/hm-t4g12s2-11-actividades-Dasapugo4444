package co.edu.sena.bajo;

public class Clase1 implements InterfaceClase1{

    public static InterfaceClase2 getClase2() {
        return new Clase1.Clase2();
    }

    public static class Clase2 implements InterfaceClase2{

        public static InterfaceClase3 getClase3(){
            return new Clase2.Clase3();
        }

        public static class Clase3 implements InterfaceClase3{

            public static InterfaceClase4 getClase4(){
                return new Clase3.Clase4();
            }

            public static class Clase4 implements InterfaceClase4{

                public static InterfaceClase5 getClase5(){
                    return new Clase4.Clase5();
                }

                public static class Clase5 implements InterfaceClase5{

                    public static InterfaceClase6 getClase6(){
                        return new Clase5.Clase6();
                    }

                    public static class Clase6 implements InterfaceClase6{

                        public static InterfaceClase7 getClase7(){
                            return new Clase6.Clase7();
                        }

                        public static class Clase7 implements InterfaceClase7{

                            public static InterfaceClase8 getClase8(){
                                return new Clase7.Clase8();
                            }

                            public static class Clase8 implements InterfaceClase8{

                                public static InterfaceClase9 getClase9(){
                                    return new Clase8.Clase9();
                                }

                                public static class Clase9 implements InterfaceClase9{

                                    public static InterfaceClase10 getClase10(){
                                        return new Clase9.Clase10();
                                    }

                                    public static class Clase10 implements InterfaceClase10{

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
