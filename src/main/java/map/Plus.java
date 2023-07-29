package map;

public abstract class Plus {
    private int positionR;
    private int positionC;

    public int getPositionC() {
        return positionC;
    }

    public int getPositionR() {
        return positionR;
    }

    public void setPositionC(int positionC) {
        this.positionC = positionC;
    }

    public void setPositionR(int positionR) {
        this.positionR = positionR;
    }
    public abstract int event();

}

