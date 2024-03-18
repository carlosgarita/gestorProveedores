/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorproveedores;

/**
 *
 * @author HP
 * @param <AnyType>
 */
// ArrayStack class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void push(x)--> Insert x
// void pop ( )--> Remove most recently inserted item
// AnyType top( )--> Return most recently inserted item
// AnyType topAndPop ( )--> Return and remove most recent item
// boolean isEmpty )--> Return true if empty; else false
// void makeEmpty ( )--> Remove all items
// ******************ERRORS******************
// top, pop, or topAndPop on empty stack

public class StackArray<AnyType>
{
    private void doubleArray ()
    {
        AnyType[] newArray = (AnyType[]) new Object[theArray.length*2];
        System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        theArray = newArray; 
    }
    
    private AnyType[] theArray;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;
    
    /**
     * Construct the stack. 
     */
    
    public StackArray() 
    {
       theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
       topOfStack = -1;
    }
    
    /**
     * Test if the stack is logically empty.
     * @return true if empty. 
    */

    public boolean isEmpty()
    { 
        return topOfStack == -1;
    }

    /**
     * Make the stack logically empty.
    */

    public void makeEmpty()
    {
        topOfStack = -1; 
    }

    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty
    */

    public AnyType top()
    {
        if(isEmpty())
            throw new UnderflowException( "ArrayStack top" );
        return theArray[ topOfStack ];
    } 

    /**
     * Remove the most recently inserted item from the stack.
     * @throws UnderflowException if the stack is empty.
    */

    public void pop()
    {
        if(isEmpty())
            throw new UnderflowException( "ArrayStack pop" );
        topOfStack--;
    } 

    /**
     * Return and remove the most recently inserted item from the stack.
     * @return 
     * @returns the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
    */

    public AnyType topAndPop()
    {
        if(isEmpty())
            throw new UnderflowException( "ArrayStack topAndPop" );
        return theArray[topOfStack--];
    } 

    /**
     * Return and remove the most recently inserted item from the stack.
     * @param x
     * @returns the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
    */

    public void push(AnyType x)
    {
        if(topOfStack + 1 == theArray.length) 
            doubleArray();
        theArray[++topOfStack] = x;
    }
}
