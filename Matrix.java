/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author tnealo01
 */
public class Matrix {
    
    MatrixChecker myChecker = new MatrixChecker();
    
    int height, width;
    int[][] myMatrix;
    Matrix(int x, int y) {
        this.height = y;
        this.width = x;
        myMatrix = new int[x][y];
        for(int i=0;i<height;i++) {
            for(int j=0;j<width;j++) {
                //System.out.println("i "+i+" j "+j);
                myMatrix[j][i] = 0;
            }
        }
    }
    
    public void setElement(int x, int y) {
        if(x < width && y < height) {
            myMatrix[x][y] = 99;
        }
    }
    
    public void setRow(int x, String value) {
        String[] rowValues = value.split(",");
        if(rowValues.length <= width) {            
            for(int j=0;j<width;j++) {
                myMatrix[x][j] = Integer.parseInt(rowValues[j]);
            }
        }
    }
    
    public void setColumn(int x, String value) {
        String[] rowValues = value.split(",");
        if(rowValues.length <= height) {            
            for(int j=0;j<height;j++) {
                myMatrix[j][x] = Integer.parseInt(rowValues[j]);
            }
        }
    }    
    
    public String toString() {
        String output = "[";
        for(int i=0;i<height;i++) {
            for(int j=0;j<width;j++) {
                if(j==width-1) {
                    output = output + Integer.toString(myMatrix[j][i]) + ";";
                }else {
                    output = output + Integer.toString(myMatrix[j][i]) + ",";
                }
                
            }
        }
        return output+"]";
    }
    
    public void prettyPrint() {
        for(int i=0;i<height;i++) {
            for(int j=0;j<width;j++) {
                if(j==width-1) {
                    System.out.print(Integer.toString(myMatrix[j][i]) + "\n");
                }else {
                    System.out.print(Integer.toString(myMatrix[j][i]) + "\t");
                }
                
            }
        }
    }
    
    public String isSymetrical() {
        if(myChecker.isSymmetrical(myMatrix)==true) {
            return "Yes this is symetrical";
        }else {
            return "Nope";
        }      
    }
    
    public String isTriangular() {
        if(myChecker.isSymmetrical(myMatrix)==true) {
            return "Yes this is triangular";
        }else {
            return "Nope";
        }      
    }
    

    public void setMatrix(String fullLine) {
        
    }
}
