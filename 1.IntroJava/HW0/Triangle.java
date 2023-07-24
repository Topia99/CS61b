public class Triangle {
    public int height;

    public Triangle(int h){
        height = h;
    }

    public void draw(){
        for (int i=0; i< height; i++){
            for (int j=0; j< i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Triangle a = new Triangle(10);

        a.draw();
    }
}