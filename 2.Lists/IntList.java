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
        L = new IntList(10, L);
        L = new IntList(5, L);
        L = new IntList(3, L);
        L = new IntList(1, L);

        System.out.println("Recursion Size: " + L.size());
        System.out.println("Iteration Size: " + L.iterativeSize());
        System.out.println("Get 3th item in the list: ");
        System.out.println("Expected value: 10; Actual value: " + L.get(3));

        System.out.println();

        System.out.println("Test Increment List");
        System.out.println("Orginal list: [1, 3, 5, 10, 15]");
        System.out.println("Call method: incrList(L, 3);");
        System.out.println("Expect value: [4, 6, 8, 13, 18]");
        System.out.print("Actual value: ");
        incrList(L, 3).printList();


        System.out.println("Test Increment List (In Place)");
        System.out.println("Orginal list: [1, 3, 5, 10, 15]");
        System.out.println("Call method: incrList(L, 3);");
        System.out.println("Expect value: [4, 6, 8, 13, 18]");
        System.out.print("Actual value: ");
        dincrList(L, 3).printList();
        
    }
}