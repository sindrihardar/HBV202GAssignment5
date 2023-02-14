package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack= new IntStack();

        assertFalse(stack.isFull());
    }

    @Test

    public void testNewStackIsFull(){
        IntStack stack = new IntStack();

        for (int i = 0; i < stack.getCapacity(); i ++) {
            stack.push(1);
        }


        assertTrue(stack.isFull());
    }

    @Test

    public void testPopReturnsPushedValue(){
        IntStack stack = new IntStack();

        stack.push(2);
        int i = stack.pop();

        assertSame(2, i);
    }

}
