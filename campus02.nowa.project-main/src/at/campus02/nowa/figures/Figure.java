package at.campus02.nowa.figures;

public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    public int size=3;
    // privat int size=1;   public void setSize(int mySize){size=mySize;}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < 3; row++) {
            for (int i = 0; i < size; i++) {
              for (int col = 0; col < 3; col++) {
                for (int j = 0; j < size; j++) {
                    sb.append(symbol[col][row]);
                }
            }
            sb.append('\n');
        }
    }
        return sb.toString();
    }
}
