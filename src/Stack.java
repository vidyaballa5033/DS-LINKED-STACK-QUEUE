
    public class Stack {
        int arr[];
        int top;
        int capacity;

        Stack(int size){
            arr =new int[size];
            top=-1;
            capacity=size;
        }
        public void push(int x){

            if (isFull()){
                System.out.println("Stack overflow");
                System.exit(1);
            }

            arr[++top] = x;

        }

        public int pop (){
            if (isEmpty()){
                System.out.println("Stack is empty");
                System.exit(1);
            }
            System.out.println("Element popped");
            return arr[top--];
        }

        private boolean isEmpty() {
            return top == -1;
        }

        private boolean isFull() {
            return top == capacity-1;
        }

        public void display(){
            for(int i = 0; i<= top ; i++){
                System.out.println(arr[i] + " ; ");
            }
        }

        public static void main(String[] args) {
            Stack s = new Stack(7);
            System.out.println("Element inserted");
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.display();
            s.pop();
        }
    }



