import com.sun.source.doctree.AuthorTree;

import javax.management.StringValueExp;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Automovil bmw = new Automovil("BMW", "i320", "Negro", 3);
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        /*Automovil bmw = new Automovil();
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);*/

        String marca = JOptionPane.showInputDialog("Marca: ");
        JOptionPane.showMessageDialog(null, "Muy buena marca");

        String var1;
        System.out.printf("Modelo: ");
        var1 = rd.readLine();
        System.out.println(" ");
        bmw.setModelo(var1);
        System.out.println("Modelo = " + var1);

        int var2;
        System.out.printf("Cilindraje: ");
        var2 = Integer.parseInt(rd.readLine());
        System.out.println("");
        bmw.setModelo(String.valueOf(var2));
        System.out.println("Cilindraje = " + var2);

        String var3;
        System.out.printf("Color: ");
        var3 = rd.readLine();
        bmw.setColor(var3);
        JOptionPane.showMessageDialog(null, "El color es: " + bmw.getColor());

        System.out.println(bmw.displayDetails());



    }
}