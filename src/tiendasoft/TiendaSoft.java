
package tiendasoft;

import java.util.Scanner;


public class TiendaSoft {

    
    public static void main(String[] args) {
        
        Producto inventario[]=new Producto[5];
        int op, i, can=0,j,cven, totalventas=0;
        Scanner lector=new Scanner(System.in);
        String temp;
        
        do{
            
            System.out.println("=====PELUCHITOS.COM======");
            System.out.println("*****Bienvenido*****");
            System.out.println("1. Agregar Producto.");
            System.out.println("2. Buscar Producto.");
            System.out.println("3. Eliminar Producto.");
            System.out.println("4. Mostrar Inventario.");
            System.out.println("5. Realizar venta.");
            System.out.println("6. Mostrar Ganancias totales.");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción.");
            op=lector.nextInt();
            lector.nextLine();
                                
            switch (op){
                
                case 1:
                    System.out.println("\n \n ");
                    System.out.println("========================================");
                    if(can<5){
                        inventario[can]=new Producto();
                        inventario[can].Agregar();
                        can++;
                    }else
                        System.out.println("Inventario lleno.");
                    break;
                case 2:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    System.out.println("Nombre del producto a buscar:");
                    temp=lector.nextLine();
                    for(i=0;i<can;i++){
                        if(temp.equals(inventario[i].getNombre())){
                            inventario[i].Mostrar();
                            break;
                        }
                    }
                    if(i>=can)
                        System.out.println("Error, el producto no existe.");
                    break;
                case 3:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    System.out.println("Nombre del producto a eliminar:");
                    temp=lector.nextLine();
                    for(i=0;i<can;i++){
                        if(temp.equals(inventario[i].getNombre())){
                            inventario[i].Borrar();
                            for(j=i+1;j<can;j++)                               
                                inventario[j-1]=inventario[j];
                            can--;
                            
                            break;
                        }
                             
                    }
                    if(i>=can)
                        System.out.println("Error, el producto no existe.");
                    break;
                case 4:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    for(i=0;i<can;i++){
                        inventario[i].Mostrar();
                    }
                    break;
                case 5:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    System.out.println("Ingrese el nombre del producto a vender:");
                    temp=lector.nextLine();
                    for(i=0;i<can;i++){
                        if(temp.equals(inventario[i].getNombre())){
                           System.out.println("Cantidad:");
                           cven=lector.nextInt();
                           if(cven>inventario[i].getCantidad())
                               System.out.println("Cantidad insuficiente. Tenemos: "+(inventario[i].getCantidad()));
                           else{
                               inventario[i].Vender(cven);
                               System.out.println("Total esta venta: $"+(cven*inventario[i].getValor()));
                            }
                               
                            break;
                        }
                    }
                    if(i>=can)
                        System.out.println("Error, el producto no existe.");
                    break;
                case 6:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    for(i=0;i<can;i++){
                        System.out.println("Producto\t Cant\t Vunit\t Vtotal");
                        System.out.print(inventario[i].getNombre()+"\t");
                        System.out.print(inventario[i].getTotal() +"\t");
                        System.out.print(inventario[i].getValor() +"\t");                        
                        System.out.println((inventario[i].getTotal()*inventario[i].getValor()));
                        totalventas+=inventario[i].getTotal()*inventario[i].getValor();                        
                    }
                    System.out.println("*****Total Ventas: $"+totalventas);
                    break;
                case 7:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    System.out.println("*****Hasta Pronto*****");
                    break;
                default:
                    System.out.println("\n \n");
                    System.out.println("========================================");
                    System.out.println("Opción no válida.");
                    break;    
            
               
            }
            System.out.println("\n \n");
            System.out.println("========================================");
        }while(op!=7);       
        
    }
    
}
