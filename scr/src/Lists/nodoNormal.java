package Lists;

public class nodoNormal {

    private int X;
    private int Y;
    private nodoNormal next;

    public nodoNormal(int x , int y){
        this.next = null;
        this.X = x;
        this.Y=y;

    }
    public int getx(){
        return this.X;
    }
    public int gety(){
        return this.Y;
    }
    public void setpositions(int x , int y){
        this.X = x;
        this.Y=y;
    }
    public nodoNormal getNext(){
        return this.next;
    }
    public void setNext(nodoNormal nodo){
        this.next = nodo;
    }
}
