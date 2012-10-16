/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package day5

import static day5.Matrix.java

myMatrix = new Matrix(10,10)
myMatrix.setElement(0,0)
myMatrix.setRow(6, "23,5,6,7,34,61,43,23,0,21")
myMatrix.setColumn(6, "23,5,6,7,34,61,43,23,0,21")

System.console().print(myMatrix.toString())
System.console().println()
myMatrix.prettyPrint()
