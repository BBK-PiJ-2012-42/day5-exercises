/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayCopier arrCopyier = new ArrayCopier();
        int source[] = {10, 16, 25, 38, 58, 88, 133, 200, 301, 452};
        int destination[] = new int[10];
        
        arrCopyier.copy(source, destination);

        System.out.println("Source " + source + " Destination " + destination);
        
    }
}
