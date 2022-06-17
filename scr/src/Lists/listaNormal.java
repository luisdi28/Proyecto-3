package Lists;

public class listaNormal {
    //cambiar node a nodo por si no funciona
    private nodoNormal head;
    private int size;
    public listaNormal(){//constructor de la lista enlazada
        this.head = null;
        this.size = 0;

    }
    public boolean isEmpty(){
        return this.head == null; //tira un boleano de true o false para ver si esta vacio
    }
    public int getSize(){
        return this.size;
    }
    public void setHead(nodoNormal nodo){
        this.head = nodo;
    }
    public void setSize(int number){
        this.size +=number;
    }
    public nodoNormal getHead(){
        return this.head;
    }
    public void insertFirst(int x , int y){
        nodoNormal nuevonodo = new nodoNormal(x,y); //de nuevo ,revisar si es nodo o node
        nuevonodo.setNext(head);
        setHead(nuevonodo);
        setSize(1);



    }
    public nodoNormal deleteFirst(){ // revisar este metodo , creo que se hace diferente
        if ( this.head !=null){
            nodoNormal temp = this.head;
            setHead(this.head.getNext());
            this.setSize(-1);
            return temp ; //cuando termine el comando, temp se elimina por el recolector de basura
        } else{
            return null;
        }
    }
    public void displayList(){
        nodoNormal current = getHead();
        while (current !=null){
            System.out.println(current.getx());
            System.out.println(current.gety());
            current = current.getNext();
        }
    }
    public int buscarx(int number){
        int n = getSize() - 1 ;
        int x = 0;
        nodoNormal current = this.head;
        while (n>=number){
            if ( n != number){
                current = current.getNext();
                n-=1;
            }
            else{
                x = current.getx();
                break;
            }
        }
        return x;
    }
    public int buscary(int number){
        int n = getSize() - 1 ;
        int y = 0;
        nodoNormal current = this.head;
        while (n>=number){
            if ( n != number){
                current = current.getNext();
                n-=1;
            }
            else{
                y = current.gety();
                break;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        listaNormal listaNormal = new listaNormal();
        listaNormal.insertFirst(3,4);
        listaNormal.insertFirst(5,6);
        listaNormal.displayList();
        listaNormal.buscarx(0);
        listaNormal.buscary(0);

    }
}
