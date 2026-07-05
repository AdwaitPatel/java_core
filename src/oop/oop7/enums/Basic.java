package oop.oop7.enums;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public static final -> constants
        // final means u can't create child enums
        // each constant type is Week


        // this is private or default -> because we don't want to create new objects
        Week() {
            System.out.println("Constructor called for : " + this);
        }


        // internally : Week Monday = new Week();

    }

    static void main(String[] args) {
        Week day = Week.Monday;
        System.out.println(day);

        for (Week week : Week.values()) {
            System.out.println(week);
        }
    }
}
