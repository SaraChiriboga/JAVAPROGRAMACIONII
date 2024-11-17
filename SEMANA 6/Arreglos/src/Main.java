import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        numeros[0] = 1;
        numeros[1] = 2;

        //numeros[1] = Integer.valueOf("2");
        numeros[1] = (int) 2L;
        //numeros[2] = 3;
        numeros[2] = - 1;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        //int k = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println(numeros.length);

        String[] productos = new String[3];
        productos[0] = "Memoria";
        productos[1] = "Samsung S2-3";
        productos[2] = "Macbook Air";

        //Arrays.sort(productos);

        System.out.println("Producto = " + productos[0]);
    }
}