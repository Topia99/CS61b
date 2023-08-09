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
