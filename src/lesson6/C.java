package lesson6;

//1)

public class C {
    private int first;
    private int second;

    public C(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public C(){

    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public int sum(){
        return first + second;
    }
}
