/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author tnealo01
 */
public class MatrixChecker {
    public boolean isSymmetrical(int[] anArray) {
        boolean result = true;
        for(int i=0;i<anArray.length;i++) {
            if(anArray[i]!=anArray[anArray.length-i]) {
                result = false;
            }
        }
        return result;
    }
    
    public boolean isSymmetrical(int[][] aMatrix) {
        boolean result = true;
        //System.out.println("height "+aMatrix.length+" Width "+aMatrix[0].length);
        for(int i=0;i<aMatrix.length;i++) {
            for(int j=0;j<aMatrix[0].length;j++) {
                //System.out.println("i "+i+" j "+j);
                if(aMatrix[i][j] != aMatrix[j][i]) {
                    result = false;
                }
            }
        }
        return result;
    }
    
    public boolean isTriangular(int[][] aMatrix) {
        boolean result = true;
        //System.out.println("height "+aMatrix.length+" Width "+aMatrix[0].length);
        for(int i=0;i<aMatrix.length;i++) {
            for(int j=0;j<aMatrix[0].length;j++) {
                //System.out.println("i "+i+" j "+j);
                if(i<j) {
                    if(aMatrix[i][j] != 0) {
                        result = false;
                    }
                }

            }
        }
        return result;
    }
}
