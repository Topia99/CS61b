public class Triangle {

    public static void drawTriangle(int height){
        for (int i=0; i< height; i++){
            for (int j=0; j< i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawTriangle(10);
    }
}