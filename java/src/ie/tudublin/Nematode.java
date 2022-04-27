package ie.tudublin;

import processing.data.TableRow;

public class Nematode{


    public String Name;
    public float Length;
    public float limbs;
    public String Gender;
    public float eyes;


    public void Nematable(TableRow tr)
    {
        this(
            tr.getString("name"),
            tr.getFloat("length"),
            tr.getFloat("limbs")
            tr.getString("gender"),
            tr.getFloat("eyes")
        );
    }
    
    public Nematode(String name, float length, float limbs, String gender, float eyes) {
        Name = name;
        Length = length;
        this.limbs = limbs;
        Gender = gender;
        this.eyes = eyes;
    }

    public Nematode(TableRow r) {
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public float getLength() {
        return Length;
    }
    public void setLength(float length) {
        Length = length;
    }
    public float getLimbs() {
        return limbs;
    }
    public void setLimbs(float limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public float getEyes() {
        return eyes;
    }
    public void setEyes(float eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Nematode [Gender=" + Gender + ", Length=" + Length + ", Name=" + Name + ", eyes=" + eyes + ", limbs="
                + limbs + "]";
    }

    public static void add(Nematode n) {
    }




}