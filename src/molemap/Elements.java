/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package molemap;

/**
 *
 * @author hickey705
 */
public class Elements
{ private String elementName;
    private int atomicNumber;
private double molarMass;
    
public Elements(double mass, int atom, String name)
{
    elementName = name;
    atomicNumber = atom;
    molarMass = mass;
}


public int getAtomicNumber()
    {
        return atomicNumber;
    }

    public double getMass()
    {
        return molarMass;
    }
    
    public String getName()
    {
        return elementName;
    }        
}
