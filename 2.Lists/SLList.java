/** An SLList is a list of integers, which hides the terrible trueth
 * if the nakedness within.
 */
public class SLList {

    /* In java, nested class is avaliable. 
     * Made IntNode private because user doesn't
     * need to know about it.
     * 
     * We can declare Intnode static, since it never uses
     * any of SLList's instance variables or methods
    */
    private static class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    /** Create an empty SLList. */
    public SLList() {
        sentinel = new IntNode(63, null); // The value of the sentinel node doesn't matter
        size = 0;
    }

    /** Create an list with item x int it. */
    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list.  */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Returns the first item in the list.  */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
  
        IntNode current = sentinel;

        // Move current to the end of the list
        while (current.next != null){
            current = current.next;
        }

        // create a new IntNode and add to the next of current
         current.next = new IntNode(x, null);

         size += 1;
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    public String toString() {
        IntNode current = sentinel.next;
        String str = "";

        while (current != null){
            if (current.next != null){
                str += Integer.toString(current.item) + " -> ";
            } else {
                str += Integer.toString(current.item);
            }

            current = current.next;
        }

        return str;
    }

     public static void main(String[] args){
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList();
        L.addLast(10);
        L.addFirst(5);
        L.addLast(20);
        L.addLast(25);

        System.out.println(L.toString());
        System.out.println(L.size());

    }
}
