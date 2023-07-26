public class DogLauncher {
    public static void main(String[] args){
        Dog d1 = new Dog(8);
        Dog d2 = new Dog(50);

        // Dog bigger = Dog.maxDog(d1, d2);
        Dog bigger = d1.maxDog(d2);
        
        bigger.makeNoise();
        
    }
}