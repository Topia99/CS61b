public class SpeedTestAList {
    public static void main(String[] args){
        AList l = new AList();
        int i=0;
        while(i < 10000000){
            l.addLast(i);
            i += 1;
        }
    }
}
