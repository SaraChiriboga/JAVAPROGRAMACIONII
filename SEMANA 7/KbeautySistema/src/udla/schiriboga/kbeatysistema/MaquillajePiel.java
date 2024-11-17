package udla.schiriboga.kbeatysistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;


public class MaquillajePiel extends ProductoBelleza{
    private String tipo;
    private String paraSubtono;
    private String tono;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getParaSubtono() {
        return paraSubtono;
    }

    public void setParaSubtono(String paraSubtono) {
        this.paraSubtono = paraSubtono;
    }

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }

    public String adjProductoPiel() throws IOException {
        ProductoBelleza tienda = new ProductoBelleza();
        StringBuilder producto = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Nombre del producto: ");
        String nombre = rd.readLine();
        setNombre(nombre); //agregando valores a los atributos
        producto.append(getNombre() + "\t");
        System.out.printf("Marca: ");
        String marca = rd.readLine();
        setMarca(marca);
        producto.append(getMarca() + "\t");
        System.out.printf("Precio: ");
        Double precio = Double.parseDouble(rd.readLine());
        setPrecio(tienda.precioIncIVA(precio));
        producto.append(getPrecio() + "\t");
        System.out.printf("Tono: ");
        String tono = rd.readLine();
        setTono(tono);
        producto.append(getTono() + "\t");
        System.out.printf("Subtono: ");
        String subtono = rd.readLine();
        setParaSubtono(subtono);
        producto.append(getParaSubtono() + "\t");
        System.out.printf("Tipo: ");
        String tipo = rd.readLine();
        setTipo(tipo);
        producto.append(getTipo() + "\t");
        System.out.printf("ID: ");
        String id = rd.readLine();
        setIdproduct(id);
        producto.append(getIdproduct() + "\t");
        System.out.printf("Cantidad disponible: ");
        int cantidad = Integer.parseInt(rd.readLine());
        setCantidad(cantidad);
        producto.append(getCantidad() + "\t");
        System.out.printf("Fecha de caducidad (DD/MM/YYYY): ");
        String caducidad = rd.readLine();
        setCaducidad(caducidad);
        producto.append(getCaducidad() + "\t");
        System.out.printf("Certificado (1. SI - 2. NO): ");
        int siono = Integer.parseInt(rd.readLine());
        boolean certificado;
        if (siono == 1){certificado = true;}else{ certificado = false;}
        setCertificado(certificado);
        producto.append(isCertificado());
        return producto.toString();
    }

    public void addProductoPiel(String producto, List<String> catalogoMaquillajePiel){
        catalogoMaquillajePiel.add(producto);
        System.out.println("============================");
        System.out.println("Producto agregado con exito!");
        System.out.println("============================\n");
    }

    public void removeProductoPiel(String nombreoid, List<String> catalogoMaquillajePiel){
        ListIterator<String> j = catalogoMaquillajePiel.listIterator();
        while (j.hasNext()){
            if (j.next().contains(nombreoid)){
                j.remove();
            }
        }
        System.out.println("============================");
        System.out.println("Producto eliminado con exito");
        System.out.println("============================\n");
    }

    public void editProductoPiel(String producto, List<String> catalogoMaquillajePiel) throws IOException {
        ListIterator<String> iterador = catalogoMaquillajePiel.listIterator();
        while (iterador.hasNext()){
            String parametro = iterador.next();
            if (parametro.contains(producto)){
                iterador.remove();
            }
        }
        MaquillajePiel productomodificado = new MaquillajePiel();
        productomodificado.addProductoPiel(productomodificado.adjProductoPiel(), catalogoMaquillajePiel);
    }

    public void showProductoPiel(List<String> catalogoMaquillajePiel){
        System.out.println("Nombre\tMarca\tPrecio\tTono\tSubtono\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        catalogoMaquillajePiel.forEach(System.out::println);
    }

    public void searchProductoPiel(String producto, List<String> catalogoMaquillajePiel){
        ListIterator<String> i = catalogoMaquillajePiel.listIterator();
        System.out.println("=================== Seccion piel ===================");
        System.out.println("Nombre\tMarca\tPrecio\tTono\tSubtono\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        while(i.hasNext()){
            String encontrado = i.next();
            if (encontrado.contains(producto)){
                System.out.println(encontrado);
            }
        }
        System.out.println("");
    }
}
