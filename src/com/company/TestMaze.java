package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestMaze {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner input = new Scanner(new File("newmaze"));
            List<Integer> list = new ArrayList<Integer>();
            while (input.hasNextInt()) {
                list.add(input.nextInt());
                System.out.println(list);
            }
            input.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// try and take input for length of the array ( maze size ).  make the array that length, the see if it can be solved as a puzzle.
