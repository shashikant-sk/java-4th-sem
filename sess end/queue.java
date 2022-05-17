// Write a program in java to create a class Queue having data members- an array of 10 strings. It contains member functions Enqueue()- adding an element in the queue if there is space in the queue. Dequeue()- Removing elements from a queue if there are any elements in the queue Display()-to display all elements in the array.Make sure your queue class work like First In First out principle

class queue {
    
    String[] arr = new String[10];
    int front = -1;
    int rear = -1;
    int size = 0;
    
    public void enqueue(String s) {
        if(size == 10) {
            System.out.println("Queue is full");
        }
        else {
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % 10;
            arr[rear] = s;
            size++;
        }
    }
    
    public void dequeue() {
        if(size == 0) {
            System.out.println("Queue is empty");
        }
        else {
            front = (front + 1) % 10;
            size--;
        }
    }
    
    public void display() {
        if(size == 0) {
            System.out.println("Queue is empty");
        }
        else {
            for(int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}