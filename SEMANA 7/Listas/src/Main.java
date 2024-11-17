import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creación de un ArrayList
        List<String> listaColores = new ArrayList<>();

        // Creación mediante la clase Arrays
        String[] nombres = {"Arturo", "Daniel", "Pamela"};
        List<String> listaNombres = Arrays.asList(nombres);

        // Adición de elementos individuales
        listaColores.add("Verde");
        listaColores.add("Amarillo");

        // Construir lista a partir de otra lista
        List<String> listaElementos = new ArrayList<>(listaColores);

        // Adición de elementos a otra colección
        listaElementos.addAll(listaNombres);

        // Desplegue de elementos de la lista
        System.out.println("Lista Nombre");
        listaNombres.forEach(System.out::println);
        System.out.println("Lista Cololes");
        listaColores.forEach(System.out::println);
        System.out.println("Lista Elementos");
        listaElementos.forEach(System.out::println);

        // Iteración de elementos individuales
        ListIterator<String> iterador1 = listaColores.listIterator();

        // Devuelve todos los elementos de la lista
        System.out.println("Recorrido con Iterador hacia adelante");
        while(iterador1.hasNext()){
            System.out.println("Color : " + iterador1.next());
        }
        System.out.println("Recorrido con Iterador hacia atras");
        while(iterador1.hasPrevious()){
            System.out.println("Color : " + iterador1.previous());
        }
        System.out.println("Recorrido con Iterador eliminación dinámica");
        while(iterador1.hasNext()){
            if(iterador1.next().equals("Amarillo")){
                iterador1.remove();
            }
        }
        // Inicialización con un nuevo iterador con elemento amarillo eliminado
        System.out.println("Lista de colores sin elemento eleminado");
        ListIterator<String> iterador2 = listaColores.listIterator();
        for(iterador2 = listaColores.listIterator(); iterador2.hasNext(); ) {
            System.out.println("Color Amarillo= " + iterador2.next());
        }

        //EJERCICIO:RECORRER LISTA Y ELIMINAR PAMELA
        ListIterator<String> iteradorelementos = listaElementos.listIterator();

        System.out.println("Adelante");
        while(iteradorelementos.hasNext()){ //adelante
            System.out.println("Elemento: " + iteradorelementos.next());
        }

        System.out.println("Atras");
        while(iteradorelementos.hasPrevious()){ //atras
            System.out.println("Elemento: " + iteradorelementos.previous());
        }

        //remover pamela
        while(iteradorelementos.hasNext()){
            if(iteradorelementos.next().equals("Pamela")){
                iteradorelementos.remove();
            }
        }

        System.out.println("Lista nueva: ");
        listaElementos.forEach(System.out::println);

    }
}