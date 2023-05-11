public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Bernedoodle myPet = new Bernedoodle();

        myPet.bark();
        System.out.println(myPet.pawSize);
        System.out.println(myPet.height);
    }
}