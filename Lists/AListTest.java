import org.junit.Test;
import static org.junit.Assert.*;

public class AListTest {
    public static void TestInsert(){
        AList<String> l1 = new AList<>();

        l1.addLast("A");
        l1.addLast("B");
        l1.addLast("C");
        l1.addLast("D");
        l1.addLast("E");



        // Insert "O" after B
        l1.insert("O",2);

        // Check Output
        System.out.println("Expected Value: " + "A B O C D E ");
        System.out.print("Actual Value: ");
        l1.printList();
    }

    public static void main(String[] args){
        TestInsert();
    }
}
