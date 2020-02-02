package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        int i = 0;

        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  

        Cat topcat = new Cat();
        topcat.speak();
        /*
        System.out.println(topcat.getNumLives()); //check of lives remaining
        topcat.kill();
        System.out.println(topcat.getNumLives()); //check of lives remaining
        */
        
        for(i=0;i<9;i++)
        {
            topcat.kill();
        }
    }
}