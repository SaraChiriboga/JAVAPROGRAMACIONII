package udla.schiriboga.kbeatysistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;

public class MaquillajeLabios extends ProductoBelleza{
    private String pigmento;
    private String tipo; //(lapiz, gloss, tinte, etc)

    //getters y setters
    public String getPigmento() {
        return pigmento;
    }

    public void setPigmento(String pigmento) {
        this.pigmento = pigmento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //recoleccion y union de info de producto
    public String adjProductoLabios() throws IOException {
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
        System.out.printf("Pigmento: ");
        String pigmento = rd.readLine();
        setPigmento(pigmento);
        producto.append(getPigmento() + "\t");
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

    //agregar al catalogo
    public void addProductoLabios(String producto, List<String> catalogoMaquillajeLabios){
        catalogoMaquillajeLabios.add(producto);
        System.out.println("============================");
        System.out.println("Producto agregado con exito!");
        System.out.println("============================\n");
    }

    //remover del catalogo
    public void removeProductoLabios(String nombreoid, List<String> catalogoMaquillajeLabios){
        ListIterator<String> j = catalogoMaquillajeLabios.listIterator();
        while (j.hasNext()){
            if (j.next().contains(nombreoid)){
                j.remove();
            }
        }
        System.out.println("============================");
        System.out.println("Producto eliminado con exito");
        System.out.println("============================\n");
    }

    //editar producto del catalogo
    public void editProductoLabios(String producto, List<String> catalogoMaquillajeLabios) throws IOException {
        ListIterator<String> iterador = catalogoMaquillajeLabios.listIterator();
        String parametro = iterador.next();
        while (iterador.hasNext()){
            if (parametro.contains(producto)){
                iterador.remove();
            }
        }
        MaquillajeLabios productomodificado = new MaquillajeLabios();
        productomodificado.addProductoLabios(productomodificado.adjProductoLabios(), catalogoMaquillajeLabios);
    }

    //mostrar catalogo
    public void showProductoLabios(List<String> catalogoMaquillajeLabios){
        System.out.println("Nombre\tMarca\tPrecio\tPigmento\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        catalogoMaquillajeLabios.forEach(System.out::println);
    }

    //buscar en el catalogo
    public void searchProductoLabios(String producto, List<String> catalogoMaquillajeLabios){
        ListIterator<String> i = catalogoMaquillajeLabios.listIterator();
        System.out.println("=================== Seccion labios ===================");
        System.out.println("Nombre\tMarca\tPrecio\tPigmento\tTipo\tID\tCantidad\tF. Caducidad\tCertificado");
        while(i.hasNext()){
            String encontrado = i.next();
            if (encontrado.contains(producto)){
                System.out.println(encontrado);
            }
        }
        System.out.println("");
    }

}
