public class Test {
    public static void main(String[] args) {
        FactoryAnimal animal = new FactoryAnimal();
        Animal a1 = animal.getAnimal("feline");
        System.out.println("a1sound" + a1.makeSound());
        Animal a2 = animal.getAnimal("candi");
        System.out.println("a1sound" + a2.makeSound());
    }
}
