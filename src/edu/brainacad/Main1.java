package edu.brainacad;

/**
 * Created by Admin on 22.02.2016.
 */
public class Main1{

    public static void main (String[] args ){

        int[][]test1={{1,2},{3,4}};
        int[][]test2={{5,6},{7,8}};
        int[][]addResult;

        Matrix matrix = new Matrix();
        addResult = matrix.multiplication(test1, test2);

        for(int i = 0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(addResult[j][i]+ " ");
            }
            System.out.println();
        }


    }

}