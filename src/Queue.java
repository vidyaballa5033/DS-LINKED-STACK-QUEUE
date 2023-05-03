
public class Queue {
    int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public Queue(int queueSize){
        this.capacity = queueSize;
        queueArray = new int[capacity];
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue Is Full.");
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue.");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue Is Empty .");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Removed element: "+queueArray[front-1]);
                front = 0;
            } else {
                System.out.println("Removed element: "+queueArray[front-1]);
            }
            currentSize--;
        }
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public static void main(String args[]){
        Queue q=new Queue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
    }
}
        //It Will Shows The Elements Adding In Queue And Remove The Elements From The Queue

