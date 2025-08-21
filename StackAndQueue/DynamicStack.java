package StackAndQueue;

import StackAndQueue.StackException;
import StackAndQueue.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int ele) throws StackException {
        // this will take care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            // copy all the previous item in new data.
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        // at this point we know that array is not full hence we can inser the item
        // normally.
        // insert element
        return super.push(ele);
    }
}
