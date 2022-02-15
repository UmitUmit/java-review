import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
        inventory.add(new Apple(80,Color.GREEN));
        inventory.add(new Apple(155,Color.RED));
        inventory.add(new Apple(120, Color.GREEN));

    filterApples(inventory,  apple -> apple.getWeight() > 150);
        System.out.println("**************************");
    filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));


//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
//        System.out.println(heavyApple);
//
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
//        System.out.println(greenApple);

    }

    private static void filterApples(List<Apple> inventory, Predicate<Apple> p)
    {
        for (Apple apple : inventory){
            if (p.test(apple)){
                System.out.println(apple.toString());
            }
        }
    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate)
//    {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory){
//            if (applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }



}
