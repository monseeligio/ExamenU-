
package colasventanilla;

import java.util.Scanner;

public class ColasVentanilla {
    public static void main(String[] args) {
     Procesos cola =new Procesos();
     int opc2=0;
     int opc;
     int turno=0;
     String []cliente={"VIP","COMUN"};
     
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. Pasar a ventanilla");
        System.out.println("3. Mostrar fila");
        System.out.println("4. Terminar una ventanilla");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            
            case 1:  
            
             if(turno==0){
                 turno=(int)(Math.random()*10+1);
             }   
             else{
                 turno++;
             }
             int num= (int)(Math.random()*2+0);
             if (num==0){
                 cola.Insertar(cliente[0],turno);
                 System.out.println("Cliente a insertar: "+cliente[0]+turno);
             }
             else{
                 cola.Insertar(cliente[1],turno);
                 System.out.println("Cliente a insertar: "+cliente[1]+turno);

             }
            
            break;
            case 2:
            cola.pasarAVentanilla();        
            break;
            case 3:   
            cola.MostrarVIP();
            cola.MostrarComun();
            break;
            case 4:
            cola.terminarVentanilla();
            
            
                break;
            case 5: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
       }while(opc2!=5);

    }
    
}
