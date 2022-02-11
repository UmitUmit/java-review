package functionalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //****************PREDICATE**********************//

        /*
        Anonimous class
         */
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//
//        lesserThan.test(50);



    /*
    Now let's do in lambda expression way
     */
        // Predicate<Integer> lesserThan1 = implementation of method belongs to the functional interface
//    Predicate<Integer> lesserThan1 = public boolean abc(Integer a){
//        return a < 18;
//    }
        // let's convert this into lambda
    /*
    lambda doesn't belong to any class, so let's remove public
    compiler knows < sign is boolean, so let's remove boolean
    we don't need method name, remove it
    What do you say about lambda ? ==> we need to put fat arrow sign -> between parentheses and curly braces
    (Integer a) -> {return a < 18}
    if it's one line in the curly braces, we can remove curly braces
    we can also remove return key word, coz compiler can understand a<18, it's gonna return something
    Also we can remove type Integer from inside parentheses, compiler understands a cannot be a strawberry, since <18
    If it's one parameter, we don't need  parentheses, so it can be removed

    so it now became:  Predicate<Integer> lesserThan = a -> a<18;
    a -> a<18; represents the implementation of the method that belongs to the functional interface
     */

        //Predicate<Integer> lesserThan = a -> a<18;

        // I did implementation, next thing is to call the method and see the output
    /*
    how do I call the method ?
    first Action Name--lambda expression, lambda expression is holding the action
    what is hold the lambda expression ? value lesserThan is holding it
     */
        Predicate<Integer> lesserThan = a -> a < 18;
        lesserThan.test(50);

        //why it didn't print something ?
        //if it's returning something, then it is holding some value
        //it either needs to be assigned to Boolean result, or directly sout
        Boolean result = lesserThan.test(50);
        System.out.println(result);


    }
}