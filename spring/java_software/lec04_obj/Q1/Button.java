package Q1;

public class Button {
    String label;
    boolean pressed;
    static int numPressed = 0;
    Button(String label) {
        this.label = label;
        this.pressed = false;
    }
    Button(){
        this.label = "Untitled";
        this.pressed = false;
    }
    void press() {
        if(!this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }
    void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }
}
