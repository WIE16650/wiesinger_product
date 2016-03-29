/**
 * Autor:   Uwe Wiesinger
 * Klasse:  4BBIF
 * Datum:   29.03.2016
 * Übung:   GitHub
 */

public class Product
{
    private String name;
    private float price;

    // Konstruktoren
    public Product()
    {
        setName  ("Coca Cola");
        setOnStock (10);
    } 

    // get Methode
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
    	return price;
    }

    // set Methode
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPreis(float preis)
    {
    	this.preis = preis;
    }

    // print Methode
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Auf Lager.? " + preis};

}