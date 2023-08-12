/** An SLList is a list of integers, which hides the terrible trueth
 * if the nakedness within.
 */
public class SLList<LochNess> {

    /* In java, nested class is avaliable. 
     * Made IntNode private because user doesn't
     * need to know about it.
     * 
     * We can declare Intnode static, since it never uses
     * any of SLList's instance variables or methods
    */
    private class Node {
        public LochNess item;
        public Node next;
    
        public Node(LochNess i, Node n){
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private Node sentinel;
    private int size;

    /** Create an empty SLList. */
    public SLList() {
        sentinel = new Node(null , null); // The value of the sentinel node doesn't matter
        size = 0;
    }

    /** Create an list with item x int it. */
    public SLList(LochNess x) {
        sentinel = new Node(null , null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    /** Adds x to the front of the list.  */
    public void addFirst(LochNess x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    /** Returns the first item in the list.  */
    public LochNess getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(LochNess x) {
  
        Node current = sentinel;

        // Move current to the end of the list
        while (current.next != null){
            current = current.next;
        }

        // create a new IntNode and add to the next of current
         current.next = new Node(x, null);

         size += 1;
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

     public static void main(String[] args){
        /* Creates a list of one integer, namely 10 */
        SLList<Integer> L = new SLList<Integer>();
        L.addLast(10);
        L.addFirst(5);
        L.addLast(20);
        L.addLast(25);

        System.out.println(L.toString());
        System.out.println(L.size());

    }
}
