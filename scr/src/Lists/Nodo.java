package Lists;


public class Nodo {

    private String data;
    private Nodo next;

    public Nodo(String data){
        this.next = null;
        this.data = data;

    }
    public Object getData(){
        return this.data; //cambiar a this.data si no sirve
    }
    public void setData(String data){
        this.data = data;
    }
    public Nodo getNext(){
        return this.next;
    }
    public void setNext(Nodo nodo){
        this.next = nodo;
    }
}

