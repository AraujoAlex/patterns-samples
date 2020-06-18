package br.com.devmedia.patherns.adapter.square;

//BURACOS REDONDOS
public class SquareHole {
    private double width;

    public SquareHole(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public boolean fits(SquarePeg peg){
        boolean result;
        result = (this.getWidth() >= peg.getRadius());
        return result;
    }
}
