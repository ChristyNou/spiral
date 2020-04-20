package com.spiral;

import java.util.ArrayList;
import java.util.List;

public class MySpiral {

    public static List<Point> makeGrid(Point p, List<Point> list) {
        list.add(p);
        return list;
    }

    public static void printList(List<Point> list) {
        System.out.println(list.toString());
    }

    public static List<Point> makeMaze(int[][] grid) {
        List<Point> result = new ArrayList<>();

        if (grid.length == 0) {
            return new ArrayList<>();
        } else {
            int height = grid.length;
            int width= grid[0].length;
            int i, startX = 0, startY = 0;

            while (startX < height && startY < width) {
            /* Print the first row from the remaining
             rows */
                for (i = startY; i < width; ++i) {
                    Point p = new Point(startX, i);
                    result.add(p);
                }
                startX++;

            /* Print the last column from the remaining
            columns */
                for (i = startX; i < height; ++i) {
                    Point p = new Point(i, width-1);
                    result.add(p);
                }
                width--;

            /* Print the last row from the remaining
            rows */
                if (startX < height) {
                    for (i = width-1; i >= startY; --i) {
                        Point p = new Point(height-1, i);
                        result.add(p);
                    }
                    height--;
                }

            /* Print the first column from the remaining
            columns */
                if (startY < width) {
                    for (i = height-1; i >= startX; --i) {
                        Point p = new Point(i, startY);
                        result.add(p);
                    }
                    startY++;
                }
            }
            return result;
        }
    }

    public static List<Point> makeMazeWithStartP(int[][] grid, Point start) {
        List<Point> result = new ArrayList<>();

        if (grid.length == 0) {
            return new ArrayList<>();
        } else {
            int height = grid.length;
            int width= grid[0].length;
            int i, startX = start.getX(), startY = start.getY();

            while (startX < height && startY < width) {
            /* Print the first row from the remaining
             rows */
                for (i = startY; i < width; ++i) {
                    Point p = new Point(startX, i);
                    result.add(p);
                }
                startX++;

            /* Print the last column from the remaining
            columns */
                for (i = startX; i < height; ++i) {
                    Point p = new Point(i, width-1);
                    result.add(p);
                }
                width--;

            /* Print the last row from the remaining
            rows */
                if (startX < height) {
                    for (i = width-1; i >= startY; --i) {
                        Point p = new Point(height-1, i);
                        result.add(p);
                    }
                    height--;
                }

            /* Print the first column from the remaining
            columns */
                if (startY < width) {
                    for (i = height-1; i >= startX; --i) {
                        Point p = new Point(i, startY);
                        result.add(p);
                    }
                    startY++;
                }
            }
            return result;
        }
    }


    public static void main(String[] args) {
        List<Point> myGrid = new ArrayList<>();
        int R = 5;
        int C = 6;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                Point p = new Point(i, j);
                myGrid = makeGrid(p, myGrid);
            }
        }
        int[][] grid = new int[R][C];
        //printList(myGrid);
        printList(makeMazeWithStartP(grid, new Point(2,3)));
    }
}
