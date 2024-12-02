package udla.schiriboga.abs_int.imprenta;

import udla.schiriboga.abs_int.imprenta.modelo.*;

public class Main {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Sara Chiriboga", "Ing. de Sofware", "Resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("C");
        cv.addExperiencia("Python");
        cv.addExperiencia("Trafico de tampico");

        Informe inform = new Informe("Autor : Sara Chiriboga", "Revisor : Javier Gomez", "Contenido : Estudio Microservicios");

        //imprimir info
        print(cv);
        print(inform);
    }

    public static void print(Hoja print){
        System.out.println(print.print());
    }


    Libro libro = new Libro(new Persona("Erich", "Gamma"));
}
//la interface no permite generar atributos y solo puede tener metodos abstractos
//las interfaces pueden heredarse SOLO entre interfaces
//un metodo abstracto no es implementado, puede ser distinto en cada clase ===> caracteristica principal de un metodo abstracto
//una clase abstracta NO SE PUEDE INSTANCIAR