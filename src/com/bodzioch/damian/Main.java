package com.bodzioch.damian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int apples = in.nextInt();
        int oranges = in.nextInt();
        int gold = in.nextInt();

        if (apples > oranges) {
            while (gold > 0){
                if (apples > oranges){
                    oranges++;
                    gold--;
                }
                else {
                    break;
                }
            }
        } else if (oranges > apples){
            while (gold > 0){
                if (oranges > apples){
                    apples++;
                    gold--;
                } else {
                    break;
                }
            }
        }
        if (gold != 0){
            oranges += gold / 2;
            apples += (gold / 2) + 1;
        }


        System.out.println("Minimalna roznica: " + Math.abs(oranges - apples));
        System.out.println("Ilosc jablek: " + apples);
        System.out.println("Ilosc pomaranczy: " + oranges);
    }
}
