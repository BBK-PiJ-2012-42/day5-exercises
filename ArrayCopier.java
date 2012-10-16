package day5;

public class ArrayCopier {

    public void printArray(int[] toPrint) {
        for(int i=0; i<toPrint.length; i++) {
            System.out.print(" "+toPrint[i]);
        }
        System.out.println();
    }    
    
    public void copy(int[] src, int[] dst) {
        if(src.length < dst.length) {
            for(int i=0; i < dst.length; i++) {
                if(i>src.length-1) {
                    dst[i] = 0;
                }else {
                    dst[i] = src[i];
                }
            }
        }else if(src.length >= dst.length) {
            for(int i=0; i < dst.length; i++) {
                dst[i] = src[i];
            }
        }
    }
    
    public static void main(String[] args) {
        

        
        ArrayCopier arrCop = new ArrayCopier();
        int source[] = {10, 16, 25, 38, 58, 88, 133, 200, 301, 452};
        int destination[] = new int[10];
        
        arrCop.printArray(source);
        arrCop.printArray(destination);
        arrCop.copy(source, destination);
        arrCop.printArray(source);
        arrCop.printArray(destination);        
    }    
    
}
