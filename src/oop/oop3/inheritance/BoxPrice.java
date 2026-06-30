package oop.oop3.inheritance;

public class BoxPrice extends BoxWeight {
    int price;

    BoxPrice() {
        super();
        this.price = -1;
    }

    BoxPrice (int side, int weight, int price) {
        super(side, weight);
        this.price = price;
    }

    public BoxPrice(int l, int w, int h, int weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }


}
