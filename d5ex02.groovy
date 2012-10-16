package day5

import static day5.ArrayCopier.java

myArrCopy = new ArrayCopier()

source = [10, 16, 25, 38, 58, 88, 133, 200, 301, 452]
destination = new int[10]

System.console().println("Source " + source + " Destination " + destination)

myArrCopy.copy(source, destination)

System.console().println("Source " + source + "Destination " + destination)

