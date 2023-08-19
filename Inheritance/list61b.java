package a;
public interface list61b<T> {
    /** Inserts x into the back of the list. */
    public void addLast(T x);

    /** Returns the item fromm the back of the List. */
    public T getLast();

    /** Get the ith item in the List (0 is the front). */
    public T get(int i);

    /** Return the number of items in the List. */
    public int size();

    /** Deletes item from back of the list and returns deleted item. */
    public T removeLast();

    /** Inserts item into given position. */
    public void insert(T x, int position);

    /** inserts an item at the front. */
    public void addFirst(T x);

    /** Gets an item from the front. */
    public T getFirst();
}
