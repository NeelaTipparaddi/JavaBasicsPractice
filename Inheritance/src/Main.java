public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 49);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("Special Animal");
        doAnimalStuff(dog,"fast");
    }

        public static void doAnimalStuff(Animal animal, String speed){
            animal.makeNoise();
            animal.move(speed);
            System.out.println(animal);
            System.out.println("__________");
        }
    }

