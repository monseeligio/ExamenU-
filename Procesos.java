package colasventanilla;
public class Procesos {
    Nodo cima;
    Nodo cima2;
    Nodo raiz;
    Nodo raiz2;
    int tamanioVIP;
    int tamanioComun;
    
    Nodo[] ventanilla= new Nodo[3];
    public boolean vacia(){
        return raiz==null;
    }
         public boolean vacia2(){
        return raiz2==null;
    }
         
         
    public void Insertar(String cliente,int turno ){
        if(cliente=="VIP"){
        Nodo nodoVIP= new Nodo(cliente, turno);
         if(raiz==null){
         raiz=nodoVIP;
         cima=nodoVIP;
         tamanioVIP++;
        }
         else{
        cima.Siguiente=nodoVIP;
        cima=nodoVIP;
        tamanioVIP++;
         }
    }
        else{
     Nodo nodoComun= new Nodo(cliente, turno);  
           if(raiz2==null){
         raiz2=nodoComun;
         cima2=nodoComun;
         tamanioComun++;
        }
         else{
        cima2.Siguiente=nodoComun;
        cima2=nodoComun;
        tamanioComun++;
         }  
        }
    }
    
 public void MostrarVIP(){
      if(vacia()){
            System.out.println("Fila vip:  ");
        }
        else{
        Nodo recorre=raiz;
        System.out.print("\nFila en espera VIP: ");
        while(recorre!=null){
            System.out.print(" "+recorre.cliente+""+recorre.num);
            recorre=recorre.Siguiente;}
        }
    }
 public void MostrarComun(){
      if(vacia2()){
            System.out.println("\nFila común:  ");
        }
        else{
        Nodo recorre=raiz2;
        System.out.print("\nFila en espera COMUN: ");
        
        
        while(recorre!=null){
            System.out.print(" "+recorre.cliente+""+recorre.num);
            recorre=recorre.Siguiente;}
        }
    }
 public void pasarAVentanilla(){
     if(vacia() && vacia2()){
         System.out.println("No hay clientes en espera en las colas");
 }
     
     else{
         
    if(ventanilla[0]==null ||ventanilla[1]==null ||ventanilla[2]==null ) {   
    for(int i=0;i<3;i++){
       if(ventanilla[i]==null){
           
       if(raiz!=null){
       ventanilla[i]=raiz;
       int b;
       b=i+1;
       System.out.println("Ventanilla "+b+" atiende a: "+ventanilla[i].cliente+ventanilla[i].num);
       if (ventanilla[i].Siguiente==null){ 
           raiz=null;  
       }
       else{
       raiz=ventanilla[i].Siguiente;
       }
       }
       
       else{
       if(raiz2!=null){ 
       ventanilla[i]=raiz2;
       int c;
       c=i+1;
       System.out.println("Ventanilla "+c+" atiende a: "+ventanilla[i].cliente+ventanilla[i].num);
      
       if (ventanilla[i].Siguiente==null){ 
        raiz2=null;
       }
       
       else
       raiz2=ventanilla[i].Siguiente; 
       }       
       }
       
      }
    }
    }
    else{
        System.out.println("Ventanillas ocupadas, debe desocupar alguna ventanilla");
    }
   }
 }
  
 public void terminarVentanilla(){
     

     if (ventanilla[0]==null&&ventanilla[1]==null&&ventanilla[2]==null){
         System.out.println("Las ventanillas estan desocupadas");
    }
     
     else{
               int num= (int)(Math.random()*3+0);

     if(ventanilla[num]!=null){
     ventanilla[num]=null;
     int num1=num+1;
     System.out.println("Ventanilla "+ num1+ " se desocupo");
     }
     else{
  
       terminarVentanilla();
       
     }
     }
     }
 }
 
 

    
    
    
    

