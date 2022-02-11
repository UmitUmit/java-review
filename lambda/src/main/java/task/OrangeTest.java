package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        /*
        In lambda expression:
        We can take out the type, since |||Interface type = (Orange orange)||| => so we can put like just =>|| (orange) -> {action}
        If only one parameter exists, then we can take out the parensisis as well =>||  orange -> {action}
        If only one liner code in the curly braces, then it can be taken out so => ||   orange -> action

        And we can use||| method(inventory, (Orange orange))||| => this way, just putting action inside method
         */


        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight()+ "g";
        //prettyPrintOrange(inventory, simpleFormatter);

        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight()+ "g");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + orange.getColor() + " Orange";
        };

        prettyPrintOrange(inventory, fancyFormatter);

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
