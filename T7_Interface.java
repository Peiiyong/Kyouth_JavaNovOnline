interface Animal{
    void eat();
    void sleep();
}

class Cat implements Animal{
    public void eat(){
        System.out.println("cat eats fish");
    }
    public void sleep(){
        System.out.println("Cat sleep fro 12 hours");
    }
}

class Bear implements Animal{
    public void eat(){
        System.out.println("bear eat honey");
    }
    public void sleep(){
        System.out.println("bear sleep entire winter");
    }
}
public class T7_Interface {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.eat();
        a1.sleep();

        System.out.println("========================");

        Animal a2 = new Bear();
        a2.eat();
    }
}
