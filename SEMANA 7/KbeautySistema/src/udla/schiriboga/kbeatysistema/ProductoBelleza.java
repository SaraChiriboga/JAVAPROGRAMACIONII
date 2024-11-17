package udla.schiriboga.kbeatysistema;

/*========== CLASE PADRE ==========*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProductoBelleza {
    //atributos
    private String nombre;
    private String marca;
    private String idproduct;
    private String caducidad;
    private boolean certificado;
    private int cantidad;
    private double precio;
    static double IVA = 0.15; //para calculo

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(String idproduct) {
        this.idproduct = idproduct;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    //obtencion de precio con iva
    public double precioIncIVA(double precio){
        double precioAfterIva;
        precioAfterIva = precio + (precio * IVA);
        return precioAfterIva;
    }

    public void iniciar() throws IOException {
        ProductoBelleza local = new ProductoBelleza();
        //seccion labios
        MaquillajeLabios productos_labios = new MaquillajeLabios();
        List<String> productosLabios = new ArrayList<>();

        //seccion ojos
        MaquillajeOjos productos_ojos = new MaquillajeOjos();
        List<String> productosOjos = new ArrayList<>();

        //seccion piel
        MaquillajePiel productos_piel = new MaquillajePiel();
        List<String> productosPiel = new ArrayList<>();

        //seccion accesorios
        Accesorios productos_accesorios = new Accesorios();
        List<String> productosAccesorios = new ArrayList<>();

        //MENU
        boolean repeat = true;
        while (repeat){
            System.out.println("===== Bienvenid@ a Kbeauty! =====\n1. Modificar catalogo \n2. Buscar producto\n3. Mostrar catalogo");
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            //implementar mas funcionalidades
            int eleccion = Integer.parseInt(sc.readLine());
            int eleccion2;
            int eleccion3;

            //MODIFICAR CATALOGO
            if (eleccion == 1){
                //ELECCION DE CATALOGO A MODIFICAR
                System.out.println("1. Catalogo de maquillaje de labios\n2. Catalogo de maquillaje de ojos\n3. Catalogo de maquillaje de piel\n4. Catalogo de accesorios");
                eleccion2 = Integer.parseInt(sc.readLine());
                //MODIFICACION DE CATALOGO DE MAQUILLAJE DE LABIOS
                if (eleccion2 == 1){
                    System.out.println("1. Agregar\n2. Remover\n3. Editar");
                    eleccion3 = Integer.parseInt(sc.readLine());
                    if (eleccion3 == 1){
                        String nuevoProductoLabios = productos_labios.adjProductoLabios();
                        productos_labios.addProductoLabios(nuevoProductoLabios, productosLabios);
                    } else if (eleccion3 == 2) {
                        System.out.printf("Nombre o id del producto a remover: ");
                        String removerproducto = sc.readLine();
                        productos_labios.removeProductoLabios(removerproducto, productosLabios);
                    }else{
                        System.out.printf("Nombre o id del producto a editar: ");
                        String editarproducto = sc.readLine();
                        productos_labios.editProductoLabios(editarproducto, productosLabios);
                    }
                }
                //MODIFICACION DE CATALOGO DE MAQUILLAJE DE OJOS
                if (eleccion2 == 2){
                    System.out.println("1. Agregar\n2. Remover\n3. Editar");
                    eleccion3 = Integer.parseInt(sc.readLine());
                    if (eleccion3 == 1){
                        String nuevoProductoOjos = productos_ojos.adjProductoOjos();
                        productos_ojos.addProductoOjos(nuevoProductoOjos, productosOjos);
                    } else if (eleccion3 == 2) {
                        System.out.printf("Nombre o id del producto a remover: ");
                        String removerproducto = sc.readLine();
                        productos_ojos.removeProductoOjos(removerproducto, productosOjos);
                    }else{
                        System.out.printf("Nombre o id del producto a editar: ");
                        String editarproducto = sc.readLine();
                        productos_ojos.editProductoOjos(editarproducto, productosOjos);
                    }
                }
                //MODIFICACION DE CATALOGO DE MAQUILLAJE DE PIEL
                if (eleccion2 == 3){
                    System.out.println("1. Agregar\n2. Remover\n3. Editar");
                    eleccion3 = Integer.parseInt(sc.readLine());
                    if (eleccion3 == 1){
                        String nuevoProductoPiel = productos_piel.adjProductoPiel();
                        productos_piel.addProductoPiel(nuevoProductoPiel, productosPiel);
                    } else if (eleccion3 == 2){
                        System.out.printf("Nombre o id del producto a remover: ");
                        String removerproducto = sc.readLine();
                        productos_piel.removeProductoPiel(removerproducto, productosPiel);
                    }else{
                        System.out.printf("Nombre o id del producto a editar: ");
                        String editarproducto = sc.readLine();
                        productos_piel.editProductoPiel(editarproducto, productosPiel);
                    }
                }
                //MODIFICACION DE CATALOGO DE ACCESORIOS
                if (eleccion2 == 4){
                    System.out.println("1. Agregar\n2. Remover\n3. Editar");
                    eleccion3 = Integer.parseInt(sc.readLine());
                    if (eleccion3 == 1){
                        String nuevoProductoAccesorios = productos_accesorios.adjProductoAccesorios();
                        productos_accesorios.addProductoAccesorios(nuevoProductoAccesorios, productosAccesorios);
                    } else if (eleccion3 == 2){
                        System.out.printf("Nombre o id del producto a remover: ");
                        String removerproducto = sc.readLine();
                        productos_accesorios.removeProductoAccesorios(removerproducto, productosAccesorios);
                    }else{
                        System.out.printf("Nombre o id del producto a editar: ");
                        String editarproducto = sc.readLine();
                        productos_accesorios.editProductoAccesorios(editarproducto, productosAccesorios);
                    }
                }
            }

            //BUSCAR PRODUCTO
            if (eleccion == 2){
                local.buscarProducto(productosLabios, productosOjos, productosPiel, productosAccesorios);
            }
            
            //MOSTRAR CATALOGO
            if (eleccion == 3){
                System.out.println("1. Catalogo de maquillaje de labios\n2. Catalogo de maquillaje de ojos\n3. Catalogo de maquillaje de piel\n4. Catalogo de accesorios\n5. Catalogo completo");
                eleccion2 = Integer.parseInt(sc.readLine());
                if (eleccion2 == 1){
                    productos_labios.showProductoLabios(productosLabios);
                }else if (eleccion2 == 2){
                    productos_ojos.showProductoOjos(productosOjos);
                }else if (eleccion2 == 3){
                    productos_piel.showProductoPiel(productosPiel);
                }else if(eleccion2 == 4){
                    productos_accesorios.showProductoAccesorios(productosAccesorios);
                }else{
                    local.mostrarCatalogoCompleto(local.unirCatalogoCompleto(productosLabios, productosOjos, productosPiel, productosAccesorios));
                }
            }

            //VOLVER A MENU PRINCIPAL?
            System.out.printf("Desea volver al menu principal? (1. SI - 2. NO): ");
            int menu = Integer.parseInt(sc.readLine());
            if (menu == 2){break;}
        }
    }

    //union y despliegue de catalogos
    public List<String> unirCatalogoCompleto(List<String> maquillajeLabios, List<String> maquillajeOjos, List<String> maquillajePiel, List<String> accesorios){
        //conversion a string de las listas
        String maquillajelabios = maquillajeLabios.toString();
        String maquillajeojos = maquillajeOjos.toString();
        String maquillajepiel = maquillajePiel.toString();
        String acc = accesorios.toString();

        //union mediante lista
        List<String> catalogo = new ArrayList<>();
        catalogo.add(maquillajelabios);
        catalogo.add(maquillajeojos);
        catalogo.add(maquillajepiel);
        catalogo.add(acc);

        return catalogo;
    }

    public void mostrarCatalogoCompleto(List<String> catalogo){
        System.out.println(" ========== Catalogo Kbeauty ==========");
        catalogo.forEach(System.out::println);
    }

    //buscar productos
    public void buscarProducto(List<String> maquillajeLabios, List<String> maquillajeOjos, List<String> maquillajePiel, List<String> accesorios) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //lector
        MaquillajeLabios labios = new MaquillajeLabios();
        MaquillajeOjos ojos = new MaquillajeOjos();
        MaquillajePiel piel = new MaquillajePiel();
        Accesorios accesorio = new Accesorios();

        //preguntar nombre o id del producto
        System.out.printf("Parametro de busqueda:");
        String buscar = lector.readLine();

        labios.searchProductoLabios(buscar, maquillajeLabios); //metodo de busqueda de cada seccion
        ojos.searchProductoOjos(buscar, maquillajeOjos);
        piel.searchProductoPiel(buscar, maquillajePiel);
        accesorio.searchProductoAccesorios(buscar, accesorios);
    }
}
