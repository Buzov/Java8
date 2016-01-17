package lesson_01.abstract_class;

import lesson_01.AbstractClass;
import lesson_01.UseAbstractClass;

/**
 *
 * @author artur
 */
public class Main {
    public static void main(String[] args) {
        UseAbstractClass.doSomething(new AbstractClass() {
            @Override
            public void action() {
                System.out.println("Hello world!");
            }
        });
    }
}
