package upn.com.code;

public class Producto {
    private String codigo,nombre;
    private double precio;
    private int cantidad;

    public Producto(String c,String n,double p,int q){
        codigo=c;nombre=n;precio=p;cantidad=q;
    }

    public double calcularTotal(){
        return precio*cantidad;
    }

    public double calcularTotal(double descuento){
        return calcularTotal()-(calcularTotal()*descuento/100);
    }

    public double calcularTotal(int q){
        return precio*q;
    }

    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    public int getCantidad(){return cantidad;}

    @Override
    public String toString(){
        return codigo+" | "+nombre+" | S/"+precio+" | Cant: "+cantidad;
    }
}