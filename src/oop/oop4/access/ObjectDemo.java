package oop.oop4.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // string representation of object
    @Override
    public String toString() {
        return super.toString();
    }

    // it is called by the garbage collector before an
    // object is removed, but since it is deprecated
    // and not guaranteed to run, it is generally avoided
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // give a unique representation of an object via number
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // check the values with other objects
    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(45);
        ObjectDemo obj2 = new ObjectDemo(45); // diff hash codes
//        ObjectDemo obj2 = obj; // same hash code

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        System.out.println(obj == obj2); // this check only where these two vars are pointing to
        System.out.println(obj.equals(obj2));  // this check the values only

        // get class infos
        System.out.println(obj.getClass().getName());

    }
}
