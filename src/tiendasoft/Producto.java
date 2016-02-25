
package tiendasoft;

import java.util.Scanner;


public class Producto {
    
    String nombre;
    int cantidad=0, valorunit=0, totalven=0;
    Scanner leer=new Scanner(System.in);
    
    public void Agregar(){
        
      System.out.println("Ingrese el nombre del nuevo producto:");
      nombre=leer.nextLine();
      System.out.println("Ingrese la cantidad del producto: ");
      cantidad=leer.nextInt();
      System.out.println("Ingrese el valor unitario:");
      valorunit=leer.nextInt();
      System.out.println("Producto agregado.");
      
      
    }
    
    public void Mostrar(){
        System.out.println("Producto: "+(nombre));
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Valor unitario: "+valorunit);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void Borrar(){
        nombre="";
        cantidad=0;
        valorunit=0;
        totalven=0;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    public void Vender(int vendido){
        cantidad-=vendido;
        totalven+=vendido;
    }
    
    
    public int getTotal(){
        return totalven;
    }
    public int getValor(){
        return valorunit;
    }
    
    
}
