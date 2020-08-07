package org.example;

import static net.bytebuddy.matcher.ElementMatchers.named;

import java.io.File;
import java.io.IOException;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;


public class Magician {

    public static void main(String[] args) {
        try {
            new ByteBuddy().redefine(Hat.class)
                    .method(named("pullOut"))
                    .intercept(FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("/Users/motivator/Workspace/study/java/jvm-ex/target/classes/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new Hat().pullOut());
    }
}
