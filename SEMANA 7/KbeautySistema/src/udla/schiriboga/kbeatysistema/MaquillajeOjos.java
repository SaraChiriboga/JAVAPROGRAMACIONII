package udla.schiriboga.kbeatysistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;


public class MaquillajeOjos extends ProductoBelleza{
    private String tipo; //sombra, delineador, etc
    private String tono;
    private boolean waterproof;

    //metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public String adjProductoOjos() throws IOException {
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
        System.out.printf("Waterproof?: ");
        int wtp = Integer.parseInt(rd.readLine());
        if (wtp == 1){waterproof = true;}else{waterproof = false;}
        setWaterproof(waterproof);
        producto.append(isWaterproof() + "\t");
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

    public void addProductoOjos(String producto, List<String> catalogoMaquillajeOjos){
        catalogoMaquillajeOjos.add(producto);
        System.out.println("============================");
        System.out.println("Producto agregado con exito!");
        System.out.println("============================\n");
    }

    public void removeProductoOjos(String nombreoid, List<String> catalogoMaquillajeOjos){
        ListIterator<String> j = catalogoMaquillajeOjos.listIterator();
        while (j.hasNext()){
            if (j.next().contains(nombreoid)){
                j.remove();
            }
        }
        System.out.println("============================");
        System.out.println("Producto eliminado con exito");
        System.out.println("============================\n");
    }

    public void editProductoOjos(String producto, List<String> catalogoMaquillajeOjos) throws IOException {
        ListIterator<String> iterador = catalogoMaquillajeOjos.listIterator();
        while (iterador.hasNext()){
            if (iterador.next().contains(producto)){
                iterador.remove();
            }
        }
        MaquillajeOjos productomodificado = new MaquillajeOjos();
        productomodificado.addProductoOjos(productomodificado.adjProductoOjos(), catalogoMaquillajeOjos);
    }

    public void showProductoOjos(List<String> catalogoMaquillajeOjos){
        System.out.println("Nombre\tMarca\tPrecio\tTono\tWaterproof\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        catalogoMaquillajeOjos.forEach(System.out::println);
    }

    public void searchProductoOjos(String producto, List<String> catalogoMaquillajeOjos){
        ListIterator<String> i = catalogoMaquillajeOjos.listIterator();
        System.out.println("=================== Seccion ojos ===================");
        System.out.println("Nombre\tMarca\tPrecio\tTono\tWaterproof\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        while(i.hasNext()){
            String encontrado = i.next();
            if (encontrado.contains(producto)){
                System.out.println(encontrado);
            }
        }
        System.out.println("");
    }
}
