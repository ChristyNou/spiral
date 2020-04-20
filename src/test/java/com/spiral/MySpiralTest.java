package com.spiral;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.spiral.MySpiral.makeMaze;
import static com.spiral.MySpiral.makeMazeWithStartP;
import static org.junit.Assert.*;

public class MySpiralTest {

    @Test
    public void makeGrid() {
    }

    @Test
    public void printList() {
    }

    @Test
    public void checkMazeNull() {
        int[][] grid = {};
        assertEquals(new ArrayList<>(), makeMaze(grid));
    }

    @Test
    public void checkMazeSize() {
        int[][] grid = new int[3][3];
        List<Point> result = makeMaze(grid);
        assertEquals(9, result.size());
    }

    @Test
    public void checkMaze3x3() {
        int[][] grid = new int[3][3];
        List<Point> result = makeMaze(grid);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(1, 1));
        assertEquals(expected, result);
    }

    @Test
    public void checkMaze5x5() {
        int[][] grid = new int[5][5];
        List<Point> result = makeMaze(grid);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 2));
        expected.add(new Point(0, 3));
        expected.add(new Point(0, 4));
        expected.add(new Point(1, 4));
        expected.add(new Point(2, 4));
        expected.add(new Point(3, 4));
        expected.add(new Point(4, 4));
        expected.add(new Point(4, 3));
        expected.add(new Point(4, 2));
        expected.add(new Point(4, 1));
        expected.add(new Point(4, 0));
        expected.add(new Point(3, 0));
        expected.add(new Point(2, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 2));
        expected.add(new Point(1, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(3, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 2));
        assertEquals(expected, result);
    }

    @Test
    public void checkMaze4x4() {
        int[][] grid = new int[4][4];
        List<Point> result = makeMaze(grid);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 2));
        expected.add(new Point(0, 3));
        expected.add(new Point(1, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(3, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 1));
        expected.add(new Point(3, 0));
        expected.add(new Point(2, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 1));
        assertEquals(expected, result);
    }

    @Test
    public void checkMaze5x6() {
        int[][] grid = new int[5][6];
        List<Point> result = makeMaze(grid);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 2));
        expected.add(new Point(0, 3));
        expected.add(new Point(0, 4));
        expected.add(new Point(0, 5));
        expected.add(new Point(1, 5));
        expected.add(new Point(2, 5));
        expected.add(new Point(3, 5));
        expected.add(new Point(4, 5));
        expected.add(new Point(4, 4));
        expected.add(new Point(4, 3));
        expected.add(new Point(4, 2));
        expected.add(new Point(4, 1));
        expected.add(new Point(4, 0));
        expected.add(new Point(3, 0));
        expected.add(new Point(2, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 2));
        expected.add(new Point(1, 3));
        expected.add(new Point(1, 4));
        expected.add(new Point(2, 4));
        expected.add(new Point(3, 4));
        expected.add(new Point(3, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 3));
        assertEquals(expected, result);
    }
    @Test
    public void checkMazeWithStartP_0_1(){
        int[][] grid = new int[5][6];
        List<Point> result = makeMazeWithStartP(grid, new Point(0,1));
        List<Point> expected= new ArrayList<>();
        expected.add(new Point(0,1));
        expected.add(new Point(0, 2));
        expected.add(new Point(0, 3));
        expected.add(new Point(0, 4));
        expected.add(new Point(0, 5));
        expected.add(new Point(1, 5));
        expected.add(new Point(2, 5));
        expected.add(new Point(3, 5));
        expected.add(new Point(4, 5));
        expected.add(new Point(4, 4));
        expected.add(new Point(4, 3));
        expected.add(new Point(4, 2));
        expected.add(new Point(4, 1));
        expected.add(new Point(3, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 2));
        expected.add(new Point(1, 3));
        expected.add(new Point(1, 4));
        expected.add(new Point(2, 4));
        expected.add(new Point(3, 4));
        expected.add(new Point(3, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 3));
        assertEquals(expected,result);
    }
    @Test
    public void checkMazeWithStartP_2_3() {
        int[][] grid = new int[5][6];
        List<Point> result = makeMazeWithStartP(grid, new Point(2, 3));
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(2, 3));
        expected.add(new Point(2, 4));
        expected.add(new Point(2, 5));
        expected.add(new Point(3, 5));
        expected.add(new Point(4, 5));
        expected.add(new Point(4, 4));
        expected.add(new Point(4, 3));
        expected.add(new Point(3, 3));
        expected.add(new Point(3, 4));
        assertEquals(expected,result);
    }
    @Test
    public void checkMazeWithStartP_2_2() {
        int[][] grid = new int[3][3];
        List<Point> result = makeMazeWithStartP(grid, new Point(2, 2));
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(2,2));
        assertEquals(expected,result);
    }
    @Test
    public void main() {
    }
}