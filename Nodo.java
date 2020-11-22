package colasventanilla;
public class Nodo {
    String cliente;
    Nodo Siguiente;
    int num;
    public  Nodo (String cliente, int numero){
        this.cliente=cliente;
        this.num=numero;
        Siguiente=null; 
        
}
}
