package day5;

public class Target {
    
    int size;
    int[][][] myCube;
    
    Target(int size) {
        this.size = size;
        myCube = new int[size][size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                for(int k=0;k<size;k++) {
                    myCube[j][i][k] = 0;
                }
                //System.out.println("i "+i+" j "+j);
                
            }
        }
    }
    
    public void init() {
        myCube[(int) Math.abs(size-1 * Math.random())][(int) Math.abs(size-1 * Math.random())][(int) Math.abs(size-1 * Math.random())] = 1;
    }
    
    public void fire(int x, int y, int z) {
        if(x>size || y>size || z>size) {
            
        }
    }
}
