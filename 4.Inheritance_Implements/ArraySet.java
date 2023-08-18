public class ArraySet<T> {
    private T[] items;
    private int size;

     /** Copy everything from array A to array B */
     private void ArrayCopy(T[] A, T[] B){
   
        System.arraycopy(A, 0, B, 0, size);  
    }

    /** Resizes the array to size x */
    private void resize(int x){
        // Create a new array with size x
        T[] a = (T[]) new Object[x];

        // Copy everything from array items to array a
        ArrayCopy(items, a);

        // Reassign reference of items to a
        items = a;
    }

    /** Create an empty ArraySet. */
    public ArraySet(){
        items = (T[]) new Object[8];
        size = 0;
    }

    /** Returns true if this set contains a specified value. */
    public boolean contains(T x){
        for(int i=0; i<size; i++){
            if(x.equals(items[i])){
                return true;
            }
        }
        return false;
    }

    /** Add x into the end of the set. If x already exist, ignore it.*/
    public void add(T x){
        // Check null input
        if(x == null){
            throw new IllegalArgumentException("Cannot add null!");
        }

        if(size == items.length){
            resize(2*items.length);
        }

        if(contains(x)){
            return;
        }

        items[size] = x;
        size += 1;
    }

    /** Returns the total number of items in the set. */
    public int size(){
        return size;
    }


    /** Return true if no the set is empty, false otherwise. */
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    /** returns an iterator to ME */
    public Iterator<T> iterator() {
        return ArraySetIterator;
    }

    private class ArraySetIterator implements Iterator<T> {
        private int currentPos;
        public boolean hasNext() {
            return currentPos < size;
        }

        public T next() {
            T item = items[currentPos];
            return item;
        }
    }

    public static void main(String[] args){
        ArraySet<Integer> aset = new ArraySet<Integer>();
        for(int i=0; i<10; i++){
            aset.add(i);
        }

        Iterator<Integer> seer = aset.iterator();

        while(seer.hasNext()){
            int i = seer.next();
            System.out.println(i);
        }
    }
}
