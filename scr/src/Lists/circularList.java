package Lists;

public class circularList {
    private Nodo head;
    private int Size;
    private Nodo last;
    public circularList(){
        this.head = null;
        this.Size = 0;
        this.last =null;
        //this.last.setnext = head , con cada iteracion al agregar un nuevo nodo
    }
    public void insertFirst(String data){
        if (getTail() == null){
            Nodo nuevonodo = new Nodo(data);
            nuevonodo.setNext(head);
            setHead(nuevonodo);
            setTail(nuevonodo);
            setSize(1);

        }
        else{
            Nodo nuevonodo = new Nodo(data);
            nuevonodo.setNext(getHead());
            setHead(nuevonodo);
            getTail().setNext(nuevonodo);
            setSize(1);
        }

    }
    public Nodo getTail(){
        return this.last;
    }
    public void setTail(Nodo nodo) {
        this.last = nodo;
    }
    public void setHead(Nodo nodo){
        this.head = nodo;
    }
    public void getHead(Nodo nodo){
        this.head= nodo;
    }
    public void setSize(int num){
        this.Size +=num;
    }
    public Nodo getHead(){
        return this.head;
    }

}
