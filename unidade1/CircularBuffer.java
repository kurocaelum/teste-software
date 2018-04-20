package filacirculartdd;

public class CircularBuffer {
    private int[] buffer;
    private int in;
    
    public CircularBuffer() {
        this.buffer = new int[10];
        this.in = 0;
    }

    public boolean isEmpty(){
        return true;
    }
    
    public boolean isFull(){
        return false;
    }
    
    public void put(int val){
        this.buffer[this.in] = val;
    }
}
