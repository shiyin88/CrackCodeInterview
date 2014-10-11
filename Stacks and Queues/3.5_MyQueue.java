/**
Implement a MyQueue class which implements a queue using two stacks

Using two stacks
One: push elements
The other one: loop the first one and get elements in reversed order
**/

public class MyQueue<T>{
  Stack<T> stackNewest, stackOldest;
  public MyQueue(){
    stackNewest = new Stack<T>();
    stackOldest = new Stack<T>();
  }

  public void add(T value){
    //push onto stackNewest, which always has the newest elements on top
    stackNewest.push(value);
  }

  private void shiftStacks(){
    //shift stackNewest and pushed into stackOldest in reversed order
    if (stackOldest.isEmpty()){
        while(!stackNewest.isEmpty()){
            stackOldest.push(stackNewest.pop());
        }
    }
  }

  public T peek(){
      shiftStacks();//ensure stackOldest has the current element.
      return stackOldest.peek();
  }

  public T remove(){
      shiftStacks();//ensure stackOldest has the current element.
      return stackOldest.pop();
  }
}
