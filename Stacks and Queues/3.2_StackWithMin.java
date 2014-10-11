/**
How would you design a stack which, in addition to push and pop, also has a
function min which returns the minimum element? Push, pop and min should all
operate in O(1) time.

create two stacks: one push into values, and the other keeps track of minimum
value in the current layer.

We need to modify push and pop methods.
Push: whenever we push value to stack, we use another stack to compare current
value to the minimum in the stack

Pop: compare the popped value with the value in the min stack.
**/

public class StackWithMin extends Stack<Integer>{
    Stack<Integer> s2;

    public StackWithMin(){
      s2 = new Stack<Integer>();
    }

    //min is always stacked on the top of the stack
    public int min(){
      if(s2 == null){
        return Integer.MAX_VALUE;
      }else{
        return s2.peek();
      }
    }

    public Integer pop(){
      int value = super.pop();
      if (value == min()){
          s2.pop();
      }
      return value;
    }

    public void push(int value){
      if (value <= min()){
          s2.push(value);
      }
      super.push(value);
    }

}
