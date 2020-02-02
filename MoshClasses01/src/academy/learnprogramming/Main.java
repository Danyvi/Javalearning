package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 2 independent objects from each other

        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());

        // textBox1 and textBox3 are both referring the same object on the heap
        // we have 2 variables on the stack that are referencing the same object
        var textBox3 = textBox1;

        textBox3.setText("Hello World");

        System.out.println(textBox1.text);
        System.out.println(textBox3.text);
    }
}
