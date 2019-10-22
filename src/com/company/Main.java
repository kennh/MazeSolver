package com.company;

import java.util.LinkedList;

public class Main {

    static Maze m = new Maze();


    // static LinkedList<Position> path = new LinkedList<Position>();

    public static void main(String[] args) {

        int[][] maze = {
                {2, 0, 1, 1, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        // 0 = wall
        // 1 = path
        // 2 = destination
        m.maze = maze;
        m.start = new Position(4,8);
        m.path = new LinkedList<Position>();

       if (solveMaze(m.start)) {
           System.out.println("You Won!");
       } else {
           System.out.println("No Path.");
       }

    }

    private static boolean solveMaze(Position p) {
        m.path.push(p);

        while (true) {
            int y = m.path.peek().y;
            int x = m.path.peek().x;

            m.maze[y][x] = 0;

            // down
            if (isValid(y + 1, x)) {
                if (m.maze[y + 1][x] == 2) {
                    System.out.println("Moved Down.");
                    return true;
                } else if (m.maze[y + 1][x] == 1) {
                    System.out.println("Moved down");
                    m.path.push(new Position(y + 1, x));
                    continue;
                }
            }


            // left
            if (isValid(y, x - 1)) {
                if (m.maze[y][x - 1] == 2) {
                    System.out.println("Moved left.");
                    return true;
                } else if (m.maze[y][x - 1] == 1) {
                    System.out.println("Moved left");
                    m.path.push(new Position(y, x - 1));
                    continue;
                }
            }

            // up
            if (isValid(y - 1, x)) {
                if (m.maze[y - 1][x] == 2) {
                    System.out.println("Moved up.");
                    return true;
                } else if (m.maze[y - 1][x] == 1) {
                    System.out.println("Moved up");
                    m.path.push(new Position(y - 1, x));
                    continue;
                }
            }

            // right
            if (isValid(y, x + 1)) {
                if (m.maze[y][x + 1] == 2) {
                    System.out.println("Moved right.");
                    return true;
                } else if (m.maze[y][x + 1] == 1) {
                    System.out.println("Moved right");
                    m.path.push(new Position(y, x + 1));
                    continue;
                }
            }

            m.path.pop();
            System.out.println("Moved Back.");
            if (m.path.size() <= 0) {
                return false;
            }
        }
    }

    public static boolean isValid ( int y, int x) {
        if (y < 0 ||
                y >= m.maze.length ||
                x < 0 ||
                x >= m.maze[y].length) {
            return false;
        }
        return true;
    }
}
