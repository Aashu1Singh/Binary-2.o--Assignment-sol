class Animal {
    public Animal makeSound() {
        System.out.println("Generic animal sound");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public Dog makeSound() {
        System.out.println("Woof!");
        return new Dog();
    }
}

class Cat extends Animal {
    @Override
    public Cat makeSound() {
        System.out.println("Meow!");
        return new Cat();
    }
}

// class A {
//     public double show() {
//         return -1;

//     }
// }

// class B extends A {
//     public float show() {

//         return 1.0f;

//     }
// }

// public class Demo {

// }
