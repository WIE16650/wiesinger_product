/**
 * Autor:   Uwe Wiesinger
 * Klasse:  4BBIF
 * Datum:   29.03.2016
 * Übung:   GitHub
 */

public class Product
{
    private String name;

    // Konstruktoren
    public Product()
    {
        setName  ("Coca Cola");
    } 

    // get Methode
    public String getName()
    {
        return name;
    }

    // set Methode
    public void setName(String name)
    {
        this.name = name;
    }

    // print Methode
    public void print()
    {
        System.out.println("Name: " + name);
    }

}