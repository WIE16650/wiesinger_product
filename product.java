/**
 * Autor:   Uwe Wiesinger
 * Klasse:  4BBIF
 * Datum:   29.03.2016
 * Übung:   GitHub
 */

public class Product
{
    private String name;
    private boolean onStock;

    // Konstruktoren
    public Product()
    {
        setName  ("Coca Cola");
        setOnStock (true);
    } 

    // get Methode
    public String getName()
    {
        return name;
    }
    
    public boolean getOnStock()
    {
    	return onStock;
    }

    // set Methode
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setOnStock(boolean onStock)
    {
    	this.onStock = onStock;
    }

    // print Methode
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Auf Lager.? " + onStock};

}