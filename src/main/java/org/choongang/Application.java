package org.choongang;

import com.sun.tools.javac.Main;
import org.choongang.main.MainRouter;

public class Application {
    public static void main(String[] args) {
        MainRouter.getInstance().start();
    }
}
