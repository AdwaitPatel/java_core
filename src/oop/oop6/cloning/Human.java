package oop.oop6.cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] data;

    // use Clonable interface instead of this
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.data = new int[]{1, 2, 3, 4};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//      this is doing SHALLOW COPY (primitives -> copied, Objects -> referenced to original)
//        return super.clone();

        // this is deep copy
        Human twin = (Human)super.clone();

        // make a deep copy
        twin.data = new int[twin.data.length];

        for (int i = 0; i < this.data.length; i++) {
            twin.data[i] = this.data[i];
        }

        return twin;


    }
}
