package com.company;

public class Main {

    public static boolean isLeapYear(int y) {
        return   y%4 == 0 &&
                (y%400 == 0 || y%100 != 0);
    }

    public static boolean isLater(int m1, int d1, int y1, int m2, int d2, int y2) {
        if (y1>y2) return true;
        else if (y2>y1) return false;
        else if (m1>m2) return true;
        else if (m2>m1) return false;
        else if (d1>d2) return true;
        else return false;
    }

    public static int findBestFit(int size1, int size2, int space) {
        int res;
        if (size1+size2<=space) res = 3;
        else if ((size1>size2 || size2>space) && size1<space) res = 1;
        else if ((size2>size1 || size1>space) && size2<space) res = 2;
        else res = 0;
        return res;
    }

    public static boolean makeBench(int small, int big, int goal) {
        return (goal/5 <= big && goal%5 <= small);
    }

    public static void main(String[] args) {

        // leap year
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));
// is later
        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is later than 2/2/2010 " + isLater(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is later than 2/2/2010 " + isLater(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is later than 1/3/2011 " + isLater(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2010 " + isLater(4,8,2010, 1,2,2010));
// Best Fit
        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));
// Make Bench
        System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8));
        System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));
        System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));
        System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));
        System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));
        System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));
        System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));
        System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));
        System.out.println("Make benches 2 6 23 is " + makeBench(2,6,23));
    }
}
