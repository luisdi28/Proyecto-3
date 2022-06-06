package Lists;

public class circularList {
    private Nodo head;
    private int Size;
    private Nodo last;

    public circularList() {
        this.head = null;
        this.Size = 0;
        this.last = null;
        //this.last.setnext = head , con cada iteracion al agregar un nuevo nodo
    }

    public void insertFirst(String data) {
        if (getTail() == null) {
            Nodo nuevonodo = new Nodo(data);
            nuevonodo.setNext(head);
            setHead(nuevonodo);
            setTail(nuevonodo);
            setSize(1);
        } else {
            Nodo nuevonodo = new Nodo(data);
            nuevonodo.setNext(getHead());
            setHead(nuevonodo);
            getTail().setNext(head);
            setSize(1);
        }
    }

    public Nodo getTail() {
        return this.last;
    }

    public void setTail(Nodo nodo) {
        this.last = nodo;
    }

    public void setHead(Nodo nodo) {
        this.head = nodo;
    }

    public void getHead(Nodo nodo) {
        this.head = nodo;
    }

    public void setSize(int num) {
        this.Size += num;
    }

    public Nodo getHead() {
        return this.head;
    }

    public int getSize() {
        return this.Size;
    }

    public void displayList() {//arreglar este metodo
        Nodo current = getHead();
        while (current.getNext() != getHead()) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }

    public void delete(String name) {
        if (getSize()> 2){
            if (getHead().getData()== name) {
                setHead(getHead().getNext());
                //System.out.println(this.head.getData());
                getTail().setNext(getHead());
                //System.out.println(getTail().getNext().getData());
                setSize(-1);
            }
            else if (getTail().getData() == name){
                Nodo current = getHead();
                while (current.getNext().getData() != name){
                    current = current.getNext();
                }
                current.setNext(current.getNext().getNext());
                setTail(current);
                setSize(-1);
            }
            else{
                Nodo current = getHead();
                int counter = 0;
                String found = "no encontrado";
                while (counter <= getSize()){
                    current = current.getNext();
                    counter +=1;
                    if (current.getNext().getData() == name){
                        current.setNext(current.getNext().getNext());
                        setTail(current);
                        found ="encontrado";
                        break;
                    }
                }
                System.out.println(found);
                setSize(-1);
            }

        }
        else{ // se debe crear un metodo en caso de que hayan 2 nodos o menos.

        }
    }

    public static void main(String[] args) {
        circularList circularList = new circularList();
        circularList.insertFirst("1");
        circularList.insertFirst("2");
        circularList.insertFirst("3");
        circularList.insertFirst("4");
        circularList.insertFirst("5");
        circularList.displayList();
        ////////
        circularList.delete("5");//elimina el 5
        circularList.delete("1"); //elimina el 1
        circularList.delete("3");
        circularList.displayList();
        circularList.delete("4");
        circularList.displayList();

    }
}