/**
 * Invariants:
 * addLast: The next item we want to add, will go into position size
 * getLast: The item we want ot return is in position size -1.
 * size: The number of items in the list should be size.
 */
public class AList {
    private int[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize() {
            int[] a = new int[size * 2];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
        }
    }

    /** Inserts x into the back of the list. */
    public void addLast(int x){
        // Resize array if size reach to its maximum.
        if (size == items.length) {
            resize();
        }
        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the List. */
    public int getLast(){
        return items[size-1];
    }

    /** Returns ith item in the List (0 is the front). */
    public int get(int i){
        return items[i];
    }

    /** Removes item from the back of the list and 
     * returns deleted item.
     */
    public int removeLast() {
        int x = getLast();
        size = size -1;
        return x;
    }

}
