package com.allybros.UIComponent;

import com.allybros.Unit.Country;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {

    Country[][] countries;
    private static int size;
    public static final int MIN_SIZE = 10;

    public MapPanel(int size) {
        MapPanel.size = size < MIN_SIZE ? 10 : size;

        GridLayout layout = new GridLayout(size,size); //Create layout
        countries = new Country[size][size];
        setLayout(layout);

        for (int i = 0; i < size; i++){
            for (int j= 0 ; j < size; j++) {
                //Countries includes to array
                countries[j][i] = new Country(j,i);
                add(countries[j][i]);
            }
        }
    }

    public void disableMap(){
        for (int i = 0; i < getMapSize() ; i++){
            for (int j= 0 ; j < getMapSize(); j++) {
                countries[j][i].setEnabled(false);
            }
        }
    }

    public static int getMapSize() {
        return size;
    }
}
