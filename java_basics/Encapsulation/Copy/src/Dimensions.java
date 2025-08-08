public class Dimensions {
    private final int length;
    private final int width;
    private final int height;

    public Dimensions() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void getVolume() {
        getHeight();
    }



    public void getHeight() {
    }

    public void setLenght(int length) {
        new Dimensions(length, width, height);
    }

    public void setWidth(int width) {
        new Dimensions(length, width, height);
    }

    public void setHeight(int length) {
        new Dimensions(length, width, height);
    }
}

