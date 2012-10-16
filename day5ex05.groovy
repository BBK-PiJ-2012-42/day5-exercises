/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package day5

import static day5.Matrix.java

myMatrix = new Matrix(4,4)
//myMatrix.setElement(0,0)
myMatrix.setRow(0, "0,1,2,3")
myMatrix.setRow(1, "1,0,1,2")
myMatrix.setRow(2, "2,1,0,1")
myMatrix.setRow(3, "3,2,1,0")
//myMatrix.setColumn(6, "23,5,6,7,34,61,43,23,0,21")

System.console().print(myMatrix.toString())
System.console().println()
myMatrix.prettyPrint()

System.console().println(myMatrix.isSymetrical())
System.console().println(myMatrix.isTriangular())