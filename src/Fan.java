public class Fan {
    final private int SLOW = 1;
    final private int MEDIUM = 2;
    final private int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString(){
        return this.on? "speed="
                + getSpeed()
                + " color="
                + getColor()
                + " radius="
                + getRadius()
                : "Fan is off";
    }
}

