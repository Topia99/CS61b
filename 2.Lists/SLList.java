/** An SLList is a list of integers, which hides the terrible trueth
 * if the nakedness within.
 */
public class SLList {
    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds x to the front of the list.  */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Returns the first item in the list.  */
    public int getFirst() {
        return first.item;
    }

     public static void main(String[] args){
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
}
