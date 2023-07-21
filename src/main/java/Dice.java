public class Dice {
    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void use(){
        int i = (int) (Math.random()*6);
        this.setValue(i);
    }

}
