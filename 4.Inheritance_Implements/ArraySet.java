public class ArraySet {
    private T[] items;
    private int size;

     /** Copy everything from array A to array B */
     private void ArrayCopy(T[] A, T[] B){
        /** 
         * The head of the ArrayDeque can be at the end of the list.
         * If head is at 0, just copy the whole array at once.
         * Else, Copy from head to array.length first 
         */
        if (head == 0){
            System.arraycopy(A, 0, B, 0, size);
        } 
        else {
            if(head + size < A.length){
                System.arraycopy(A, head, B, 0, size);
            } else {
                /** Copy first part of the array, from head to array.length */
                int itemsBefore = A.length - head;
                System.arraycopy(A, head, B, 0, itemsBefore);

                /** Copy the rest of the items, from 0 to tail -1 */
                System.arraycopy(A, 0, B, itemsBefore, tail);
            }
        }
    }

    /** Resizes the array to size x */
    private void resize(int x){
        // Create a new array with size x
        T[] a = (T[]) new Object[x];

        // Copy everything from array items to array a
        ArrayCopy(items, a);


        // Correct head and tail
        head = 0;
        tail = size;

        // Reassign reference of items to a
        items = a;
    }

    /** Halve the  Array capacity. */
    private void halve() {
        int newSize = (int) items.length / 2;

        // Create a new array of newSize
        T[] a = (T[]) new Object[newSize];

        // Copy everything from array items to array a
        ArrayCopy(items, a);

        // Correct head and tail
        head = 0;
        tail = size;

        // Reassign referenceof items to a
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


}
