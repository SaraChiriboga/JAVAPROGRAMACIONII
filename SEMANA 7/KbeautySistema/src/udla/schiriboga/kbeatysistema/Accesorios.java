package udla.schiriboga.kbeatysistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;


public class Accesorios extends ProductoBelleza{
    private String material;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String adjProductoAccesorios() throws IOException {
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
        System.out.printf("Material: ");
        String material = rd.readLine();
        setMaterial(material);
        producto.append(getMaterial() + "\t");
        System.out.printf("Color: ");
        String color = rd.readLine();
        setColor(color);
        producto.append(getColor() + "\t");
        System.out.printf("ID: ");
        String id = rd.readLine();
        setIdproduct(id);
        producto.append(getIdproduct() + "\t");
        System.out.printf("Cantidad disponible: ");
        int cantidad = Integer.parseInt(rd.readLine());
        setCantidad(cantidad);
        producto.append(getCantidad() + "\t");
        System.out.printf("Certificado (1. SI - 2. NO): ");
        int siono = Integer.parseInt(rd.readLine());
        boolean certificado;
        if (siono == 1){certificado = true;}else{ certificado = false;}
        setCertificado(certificado);
        producto.append(isCertificado());
        return producto.toString();
    }

    public void addProductoAccesorios(String producto, List<String> catalogoAccesorios){
        catalogoAccesorios.add(producto);
        System.out.println("============================");
        System.out.println("Producto agregado con exito!");
        System.out.println("============================\n");
    }

    public void removeProductoAccesorios(String nombreoid, List<String> catalogoMaquillajeAccesorios){
        ListIterator<String> j = catalogoMaquillajeAccesorios.listIterator();
        while (j.hasNext()){
            if (j.next().contains(nombreoid)){
                j.remove();
            }
        }
        System.out.println("============================");
        System.out.println("Producto eliminado con exito");
        System.out.println("============================\n");
    }

    public void editProductoAccesorios(String producto, List<String> catalogoMaquillajeAccesorios) throws IOException {
        ListIterator<String> iterador = catalogoMaquillajeAccesorios.listIterator();
        while (iterador.hasNext()){
            String parametro = iterador.next();
            if (parametro.contains(producto)){
                iterador.remove();
            }
        }
        Accesorios productomodificado = new Accesorios();
        productomodificado.addProductoAccesorios(productomodificado.adjProductoAccesorios(), catalogoMaquillajeAccesorios);
    }

    public void showProductoAccesorios(List<String> catalogoAccesorios){
        System.out.println("Nombre\tMarca\tPrecio\tMaterial\tColor\tID\tCantidad\tCertificado");
        catalogoAccesorios.forEach(System.out::println);
    }

    public void searchProductoAccesorios(String producto, List<String> catalogoAccesorios){
        ListIterator<String> i = catalogoAccesorios.listIterator();
        System.out.println("=================== Seccion accesorios ===================");
        System.out.println("Nombre\tMarca\tPrecio\tTono\tSubtono\tTipo\tID\tCantidad\tCertificado");
        while(i.hasNext()){
            String encontrado = i.next();
            if (encontrado.contains(producto)){
                System.out.println(encontrado);
            }
        }
        System.out.println("");
    }
}
