package com.company;

import java.util.*;

public class Main {

    static int n,x,y,i,fx;
    final static int ARRAY_MAX = 10;
    public static void main(String[] args) {
//        输入行数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//       创建二维数组
        int [][] array= new int[ARRAY_MAX][];
        for (i=0;i<n;i++){
            array[i] = new int[n];
        }
//        初始化
        for (x=0;x<n;x++) {
            for (y = 0; y < n; y++) {
                array[x][y] = 0;
            }
        }
        //            fx: 0向下，1右上，2向右，3左下
        x=y=fx=0;
        i=1;

        do{
            array[x][y] = i++;
            switch (fx){
                case 0:
                    y++;
                    fx = 1;
                    break;
                case 1:
                    y--;
                    x++;
                    if(y==0){ fx = 2; }
                    break;
                case 2:
                    x++;
                    fx = 3;
                    break;
                case 3:
                    y++;
                    x--;
                    if(x==0) { fx = 0; }
                    break;
                default :break;
            }
        }while(x<n && y<n);

//        打印
        for (y=0;y<n;y++) {
            for (x=0;x<n;x++) {
                if(array[x][y] != 0){
                    System.out.print(array[x][y]+" ");
                }
            }
            System.out.println();
        }
    }
}
