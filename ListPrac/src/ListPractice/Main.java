package ListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;


// What is this project? Idk like some easy to use list "library" just do stuff
public class Main
{
    // Outside Variables
    static JFrame frame;
    static JPanel panel;
    static JButton button;
    static JLabel label;

    public static void main(String[] args)
    {
        // Prompt for Input
        System.out.println("Choose a type for your list");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();

        // Instance of List Class
        ListStuff ls = new ListStuff();
        ls.makeList(choice);

        // Instance of GUI Class
        GUI g = new GUI();

    }

    static class ListStuff
    {
        public static void makeList(String varType)
        {
            // Checking Input
            switch (varType)
            {
                case "int":
                    List<Integer> intList = new ArrayList<Integer>();
                    intList.add(4);
                    intList.add(53);
                    intList.add(22);
                    System.out.println(intList);
                    break;
                case "float":
                    List<Float> floatList = new ArrayList<Float>();
                    floatList.add(23.3f);
                    floatList.add(244.53f);
                    floatList.add(76f);
                    System.out.println(floatList);
                    break;
                case "boolean":
                    List<Boolean> booleanList = new ArrayList<Boolean>();
                    booleanList.add(true);
                    booleanList.add(false);
                    System.out.println(booleanList);
                    break;
                case "String":
                    List<String> stringList = new ArrayList<String>();
                    stringList.add("Jason");
                    stringList.add("Clavicus");
                    stringList.add("Ysgramor");
                    System.out.println(stringList);
                    break;
                case "double":
                    List<Double> doubleList = new ArrayList<Double>();
                    doubleList.add(3.23526626);
                    doubleList.add(1.42426624626);
                    doubleList.add(6.26858290265290165195025);
                    System.out.println(doubleList);
                    break;
                default:
                    System.out.println("Unsupported List type");
                    break;
            }
        }
    }
    static class GUI
    {
        public static void makeGUI()
        {
            // Button (Adds Nums)
            button = new JButton("Click me");
            button.setFocusable(false);

            // Label (Text)
            label = new JLabel("Yes");

            // Panel (Holds Objects)
            panel = new JPanel();
            panel.add(button);
            panel.add(label);

            // Main Window
            frame = new JFrame("Testing Lists");
            frame.setVisible(true);
            frame.setFocusable(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.add(panel);


        }
    }
}
