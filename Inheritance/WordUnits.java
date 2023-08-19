
public class WordUnits {
    /** Returns the longest length word in the list. */
    public static String longest(list61b<String> list) {
        int maxDex = 0;
        for (int i=0; i<list.size(); i++){
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()){
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args){
        AList<String> l1 = new AList<>();
        l1.addLast("Alpha");
        l1.addLast("Elephent");
        l1.addLast("Yes Sir!!!");

        System.out.println(longest(l1));
    }
}
