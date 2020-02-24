package ie.tudublin;

public class Cat extends Animal //inheritance
{
    private int numLives;

    public Cat(String name)
    {
        // Constructor chaining to the superclass
        super(name);
        setNumLives(9);        
    }
<<<<<<< HEAD
    
    public int getNumLives()
    {
=======

    // Accessor method for reading the private field
    public int getNumLives() {
>>>>>>> b8af229bd5b2fdd3e3f403bbf3333675f3821094
        return numLives;
    }

    // Accessor method for writing to the private field
    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    // Virtual function
    // Dynamic function binding
    public void speak()
    {
        System.out.println("Meow!");
    }
}