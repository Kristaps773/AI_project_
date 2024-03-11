package com.example.project_ai;

import javafx.scene.control.RadioButton;

import java.util.LinkedList;

public class PlayerAI extends Player{

    RadioButton algoritm = SettingsScene.getSelectedAlgoritmRadioButton();
    //here is the algorithm that the user chooses

    int chooseNumberInRow(LinkedList<Integer> numberRowList) {
        //Gets the current LinkedList,
        // gives the INDEX by which the number that the bot selects is located
        return 0;
    }
}
