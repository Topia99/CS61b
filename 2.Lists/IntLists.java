/**
 * Create a List class that store Integer value
 * @param first List value
 * @param rest List pointer point to the next IntLists Class
 */
public class IntLists {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
    }
}
