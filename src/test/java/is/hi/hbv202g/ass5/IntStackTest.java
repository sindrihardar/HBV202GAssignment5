package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    IntStack stack;

    @Before
    public void createEmptyStack(){
        stack = new IntStack();
    }


    @Test
    public void testNewStackIsNotFull() {

        assertFalse(stack.isFull());
    }

    @Test

    public void testNewStackIsFull(){

        for (int i = 0; i < stack.getCapacity(); i ++) {
            stack.push(1);
        }


        assertTrue(stack.isFull());
    }

    @Test

    public void testPopReturnsPushedValue(){

        stack.push(2);
        int i = stack.pop();

        assertEquals(2, i);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testPopArrayOutOfBounds(){


        stack.pop();

    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testPushArrayOutOfBounds(){

        for (int i = 0; i < (stack.getCapacity()+1); i ++) {
            stack.push(1);
        }



    }

}
