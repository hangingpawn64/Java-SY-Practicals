class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Dog is Barking");
    }
}
public class extendedClasses {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.Bark();
    }
}
