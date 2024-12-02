package udla.schiriboga.abs_int.imprenta;

import udla.schiriboga.abs_int.imprenta.modelo.Curriculo;
import udla.schiriboga.abs_int.imprenta.modelo.Hoja;
import udla.schiriboga.abs_int.imprenta.modelo.Informe;

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
}