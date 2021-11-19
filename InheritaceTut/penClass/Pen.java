package InheritaceTut.penClass;

public class Pen {
    public String type = "gel";
    public String color = "blue";
    public int point = 10;

    static boolean clicked = false;
    
    public static void click(){
        clicked = true;
    }
    public static void unclick(){
        clicked = false;
    }
}
