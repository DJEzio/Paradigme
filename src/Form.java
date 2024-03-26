public class Form {
    static public int counter = 0;
    public String color;

    public Form() {
        this.color = "white";
        counter += 1;
    }

    public Form(String color) {
        this.color = color;
        counter += 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }

    public void tostring() {
        System.out.println("The form has the color [color]");
    }

    static public int getcontor() {
        return counter;
    }
}
