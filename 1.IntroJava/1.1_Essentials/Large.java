public class Large {
    /** Return the larger of x and y. 
     * @precondition: 
    */
    public static int larger(int x, int y){
        if (x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(2,30));
    }
}
