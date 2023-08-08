public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using resursion! */
    public int size() {
        if (rest == null){
            return 1;
        }

        return 1 + this.rest.size(); 
    }

    /** Return the size of the list using iteration */
    public int iterativeSize() {
        IntList current = this;
        int n = 0;

        while (current != null){
            n += 1;
            current = current.rest;
        }

        return n;
    }

    /** Return the ith item in the list 
     * @param i return the ith value
    */
    public int get(int i) {
        if (i == 0) {
            return this.first; 
        }

        return rest.get(i-1);
    }

    /** Return an IntList identical to L, 
     * but with all values incremented by x 
     * 
     * @param L an list
     * @param x increment by x
     * */
    public static IntList incrList(IntList L, int x) {
        if (L.rest == null){
            IntList Q = new IntList(L.first + x, null);
            return Q;
        }

        IntList Q = incrList(L.rest, x);
        Q =  new IntList(L.first + x, Q);

        return Q;
    }

    /**
     * Return an IntList identical to L, but with all value increment by x (in place).
     * 
     * @param L an list
     * @param x increment  by x
     */
    public static IntList dincrList(IntList L, int x){
        IntList Q = L;
        while (L != null){
            L.first += x;
            L = L.rest;
        }

        return Q;
    }

    /** Add  x to the front of the list. */
    public static IntList addFirst(IntList l, int x) {
        l = new IntList(x, l);
        return l;
    }

    /** Return the first item in the list.  */
    public int getFirst(){
        return this.first;
    }


    public void printList(){
        IntList current = this;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.first + ", ");
            current = current.rest;
        }
        System.out.println("]");
    }



    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = addFirst(L, 10);
        L = addFirst(L, 5);

        System.out.println(L.getFirst());

    }
}