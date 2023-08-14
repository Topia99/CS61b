/**
 * Invariants:
 * addLast: The next item we want to add, will go into position size
 * getLast: The item we want ot return is in position size -1.
 * size: The number of items in the list should be size.
 */
public class AList<T> {
    private T[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize() {
            T[] a = (T[]) new Object[size * 2];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
    }
    

    /** Inserts x into the back of the list. */
    public void addLast(T x){
        // Resize array if size reach to its maximum.
        if (size == items.length) {
            resize();
        }
        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the List. */
    public T getLast(){
        return items[size-1];
    }

    /** Returns ith item in the List (0 is the front). */
    public T get(int i){
        return items[i];
    }

    /** Removes item from the back of the list and 
     * returns deleted item.
     */
    public T removeLast() {
        T x = getLast();
        items[size -1] = null; // Important to do so in generic type to free memory.
        size = size -1;
        return x;
    }

}
