package upn.com.code;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        List<Producto> lista = new ArrayList<>();

        try {
            System.out.print("Cantidad de productos: ");
            int n=t.nextInt(); t.nextLine();

            for(int i=0;i<n;i++){
                System.out.println("\nProducto "+(i+1));
                System.out.print("Codigo: "); String c=t.nextLine();
                System.out.print("Nombre: "); String nom=t.nextLine();
                System.out.print("Precio: "); double p=t.nextDouble();
                System.out.print("Cantidad: "); int q=t.nextInt(); t.nextLine();
                lista.add(new Producto(c,nom,p,q));
            }

            for(Producto x:lista){
                System.out.println("\n"+x);
                System.out.println("Total: S/"+x.calcularTotal());
                System.out.println("Con 10% descuento: S/"+x.calcularTotal(10.0));
                System.out.println("Total con 5 unidades: S/"+x.calcularTotal(5));
            }

        }catch(InputMismatchException e){
            System.out.println("Error: ingrese datos válidos.");
        }
    }
}