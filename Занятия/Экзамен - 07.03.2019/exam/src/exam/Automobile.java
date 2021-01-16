
package exam;

import java.util.Objects;


public abstract class Automobile implements Comparable<Automobile> {
    
    private String title;
    private String color;
    private Fuel fuel;

    public Automobile(String title, String color, Fuel fuel) {
        this.title = title;
        this.color = color;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Automobile{" + "title=" + title + ", color=" + color + ", fuel=" + fuel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.title);
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + Objects.hashCode(this.fuel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automobile other = (Automobile) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (this.fuel != other.fuel) {
            return false;
        }
        return true;
    }

    
    public int compareTo(Automobile auto){
        return this.title.compareTo(auto.title);
    }
    
   public String writeToText(){
        return String.format("%10s %5s %4s", this.title, this.color, this.fuel);
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public Fuel getFuel() {
        return fuel;
    }
    
   
}
