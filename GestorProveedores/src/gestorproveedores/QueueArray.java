/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorproveedores;

//ArrayQueue class
//CONSTRUCTION: with no initializer 
//******************PUBLIC OPERATIONS*********************
//void enqueue( x )
//AnyType getFront( )
//AnyType dequeue( )
//boolean isEmpty( )
//void makeEmpty( ) 
//******************ERRORS******************************** 
//getFront or dequeue on empty queue

public final class QueueArray<AnyType> 
{
    /**
    * Construct the queue.
    */
    
    AnyType[] theArray;
    int currentSize;
    int front;
    private int back;

    private static final int DEFAULT_CAPACITY = 10;

    public QueueArray()
    {
        theArray = (AnyType[]) new Object[ DEFAULT_CAPACITY ];
        makeEmpty();
    } 

 
    /**
    * Test if the queue is logically empty.
    * @return true if empty, false otherwise.
    */

    public boolean isEmpty()
    {
        return currentSize == 0;
    }


    /**
    * Make the queue logically empty.
    */

    public void makeEmpty()
    {
        currentSize = 0;
        front = 0;
        back = -1;
    }

    /**
    * Return and remove the least recently inserted item
    * from the queue.
    * @return the least recently inserted item in the queue.
    * @throws UnderflowException if the queue is empty.
    */

    public AnyType dequeue()
    {
        if (isEmpty())
            throw new UnderflowException( "ArrayQueue dequeue" );
        currentSize--;

        AnyType returnValue = theArray[ front ];
        front = increment ( front );
        return returnValue;
    }

    /**
    * Get the least recently inserted item in the queue.
    * Does not alter the queue.
    * @return the least recently inserted item in the queue.
    * @throws UnderflowException if the queue is empty.
    */

    public AnyType getFront()
    {
        if(isEmpty())
            throw new UnderflowException( "ArrayQueue getFront" );
        return theArray [front];
    }
    
    /**
    * Internal method to expand theArray.
    */

    private void doubleQueue()
    {
        AnyType [] newArray;
        newArray = (AnyType[]) new Object[theArray.length*2];
        
        // Copy elements that are logically in the queue

        for (int i = 0; i < currentSize; i++, front = increment ( front ) )
            newArray[i] = theArray[front];

        theArray = newArray;
        front = 0;
        back = currentSize - 1;
    }

    /**
    * Insert a new item into the queue.
    * @param x the item to insert.
    */

    public void enqueue(AnyType x)
    {
        if(currentSize == theArray.length)
            doubleQueue();
        back = increment( back );
        theArray[back] = x;
        currentSize++;
    }
   
    /**
    * Internal method to increment with wraparound.
    * @param x any index in theArray's range.
    * @return x+1, or 0 if x is at the end of theArray.
    */

    private int increment(int x)
    {
        if(++x == theArray.length)
            x = 0;
        return x;
    } 
}