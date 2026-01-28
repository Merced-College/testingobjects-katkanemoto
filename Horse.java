//Kanemoto
//1/26/26
//Horse class for my Horse objects

public class Horse {

    //data variables
    private String name;
    private boolean ridable;
    private String color;

    //constructors
    public Horse() {            // default constructor
        name = "Unknown";
        ridable = true;
        color = "Mixed";
    }

    public Horse(String name, boolean ridable, String color) { // parameterized constructor
        this.name = name;
        this.ridable = ridable;
        this.color = color;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public boolean getRidable() { 
        return ridable; 
    }

    public void setRidable(boolean ridable) { 
        // simple guard (optional)
        if (!this.ridable) {
            this.ridable = ridable; 
            this.name = "Bad Idea";
        }
    }

    public String getColor() { 
        return color; 
    }

    public void setcolor(String color) { 
        this.color = color; 
    }

    @Override
    public String toString() {
        return "Horse{name='" + name + "', ridable=" + ridable + ", color='" + color + "'}";
    }
}//end class