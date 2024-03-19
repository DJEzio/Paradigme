public class Form {
    public String color;
    public Form()
    {
        this.color = "white";
    }
    public Form(String color)
    {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getArea()
    {
        return 0;
    }
    public void tostring()
    {
        System.out.println("The form has the color [color]");
    }
}
