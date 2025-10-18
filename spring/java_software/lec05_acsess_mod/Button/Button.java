package Button;

public class Button {
    public final String label;
    private boolean pressed;
    static int numPressed = 0;

    public Button(String label) {
        this.label = label;
        this.pressed = false;
    }
    public Button(){
        this.label = "Untitled";
        this.pressed = false;
    }
    public void press() {
        if(!this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }
    public void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }
    public boolean isPressed() {
        return this.pressed;
    }
    public static int getNumPressed() {
        return numPressed;
    }
}
