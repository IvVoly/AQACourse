package lesson6;

//1)

public class B {
    private int x;
    private int y;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public B(){

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double multiply(){
        return x*y;
    }
}
