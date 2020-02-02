package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty"); //"setter" 
        System.out.println(misty.getName()); //"getter"
        misty.speak();  

        Cat topcat = new Cat();
        topcat.speak();
    }
}