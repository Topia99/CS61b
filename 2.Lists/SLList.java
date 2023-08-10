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


    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list.  */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    /** Returns the first item in the list.  */
    public int getFirst() {
        return first.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
        IntNode current = first;

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
        IntNode current = first;
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
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        L.addLast(25);

        System.out.println(L.toString());
        System.out.println(L.getSize());

    }
}
