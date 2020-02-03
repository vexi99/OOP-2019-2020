package ie.tudublin;

public class Main
{

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism
<<<<<<< HEAD

        misty.setName("Misty"); //"setter" 
        System.out.println(misty.getName()); //"getter"
=======
        misty.setName("Misty");
        System.out.println(misty.getName());  
>>>>>>> ac14bafdf3526db59073db63023180ff9ca4d9f0
        misty.speak();  
        Cat topcat = new Cat();
        topcat.speak();

        Main main = new Main();
		main.helloProcessing();
        
    }
}