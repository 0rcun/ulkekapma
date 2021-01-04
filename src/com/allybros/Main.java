package com.allybros;

import com.allybros.UIComponent.GameInitWindow;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File directory = new File("./");
        System.out.println("Runing on: "+directory.getAbsolutePath());
        new GameInitWindow();
    }
}
