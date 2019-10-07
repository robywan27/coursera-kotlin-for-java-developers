package week2.lectures;

import lectures.ExceptionsKt;
import lectures.FunctionsKt;

import java.io.IOException;
import static lectures.ExtensionsKt.lastChar;
import static lectures.ExtensionsKt.repeat;

public class UseFunction {
    public static void main(String[] args) {
        // you can call any top-level function in Kotlin as a static function
        FunctionsKt.displayMax(2, 3);

        // Call a Kotlin function which throws an exception
        try {
            ExceptionsKt.foo();
        } catch (IOException e) {
            System.out.println("An IO Exception was thrown");
        }

        // calling Kotlin extensions
        char c = lastChar("abc");
        repeat("abc", 3);
    }
}
