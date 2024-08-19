package com.adapter;

public class Mobile
{
    private Charger charger;

    public Mobile(Charger charger)
    {
        this.charger = charger;
    }

    public void charge()
    {
        int volt = charger.getVolt();
        if (volt == 3)
        {
            System.out.println("Charging mobile with 3V...");
        } else
        {
            System.out.println("Cannot charge mobile, incompatible voltage: " + volt + "V");
        }
    }
}
