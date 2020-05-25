public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("candi".equals(type)){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
