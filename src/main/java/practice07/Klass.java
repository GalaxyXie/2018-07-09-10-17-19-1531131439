package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public String getDisplayName(){
        if(this.getNumber()==0)
            return "No Class";
        else
            return "Class "+this.getNumber();
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
