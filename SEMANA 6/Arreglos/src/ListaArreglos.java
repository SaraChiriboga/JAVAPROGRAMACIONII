import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArreglos {
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
        System.out.println("Lista Nombre:");
        listaNombres.forEach(System.out::println);
        System.out.println("Lista Cololes:");
        listaColores.forEach(System.out::println);
        System.out.println("Lista Elementos:");
        listaElementos.forEach(System.out::println);
    }
    //for each actua en cada elemento de la lista, sin excepciones
}
