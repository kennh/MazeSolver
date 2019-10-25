package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class TestMaze {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("What size maze would you like: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

//        try {
//            Scanner inputFile = new Scanner(new File("newmaze"));
//            List<Integer> list = new ArrayList<>();
//            while (inputFile.hasNextInt()) {
//                list.add(inputFile.nextInt());
//                System.out.println(list);
//            }
//            inputFile.close();
//        }
//        catch(FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
        Scanner inputFile = new Scanner(new File("newmaze"));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < number + 1; i++) {
            list.add(inputFile.nextInt());
            list2d.add(list);
        //
        }
        System.out.println(list);
    }
}
// take input for length of the array ( maze size ).
// make the arraylist that length,
// make the arraylist into  multidemensional array to create maze
// see if maze can be solved.
