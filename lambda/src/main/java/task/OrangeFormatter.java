package task;

public interface OrangeFormatter {
    String accept(Orange orange);
    //since interface determine final returning type. so making it a String that accepts an object
    //So it can give us String result plus different Objects
}
