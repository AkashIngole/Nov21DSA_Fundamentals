package dailyproblems.Assignment18Nov2021;

class Stack
	{
	    private int arr[];
	    private int top;
	    private int capacity;
	    private int maxArr[];
	    private int[] totalSum;
	    private double avgArr[];
	 
	    Stack(int size)
	    {
	        arr = new int[size];
	        capacity = size;
	        top = -1;
	        maxArr = new int[size];
	        totalSum = new int[size];
	        avgArr = new double[size];
	    }
	 
	    public void push(int x)
	    {
	        if (isFull())
	        {
	            System.out.println("Overflow\nProgram Terminated\n");
	            System.exit(1);
	        }
	 
	        System.out.println("Inserting " + x);
	        top++;
	        arr[top] = x;
	        if(top == 0) {
	        	maxArr[top] = x;
	        	avgArr[top] = x;
	        	totalSum[top] = x;
	        } else {
	        	maxArr[top] = Math.max(maxArr[top - 1], x);
	        	totalSum[top] = totalSum[top - 1] + x;
	        	avgArr[top] = totalSum[top] / top;
	        }
	    }
	 
	    public int pop()
	    {
	        if (isEmpty())
	        {
	            System.out.println("Underflow\nProgram Terminated");
	            System.exit(1);
	        }
	 
	        System.out.println("Removing " + peek());
	 
	        return arr[top--];
	    }
	
	    public int peek()
	    {
	        if (!isEmpty()) {
	            return arr[top];
	        }
	 
	        return -1;
	    }
	 
	    public int getMax()
	    {
	        if (!isEmpty()) {
	            return maxArr[top];
	        }
	 
	        return -1;
	    }
	    
	    public double getAvg()
	    {
	        if (!isEmpty()) {
	            return avgArr[top];
	        }
	 
	        return -1.0;
	    }

	    public int size() {
	        return top + 1;
	    }

	    public Boolean isEmpty()
	    {
	        return top == -1;             
	    }
	 

	    public Boolean isFull() {
	        return top == capacity - 1;   
	    }
	}
	 
	class CustomStack
	{
	    public static void main (String[] args)
	    {
	        Stack stack = new Stack(3);
	 
	        stack.push(1);    
	        stack.push(2);    
	 
	        stack.pop();      
	        stack.pop();      
	 
	        stack.push(3);    
	 
	        System.out.println("The top element is " + stack.peek());
	        System.out.println("The stack size is " + stack.size());
	 
	        stack.pop();
	        
	        if (stack.isEmpty()) {
	            System.out.println("The stack is empty");
	        }
	        else {
	        	 System.out.println("The stack is not empty");
	        }
	    }
	}
