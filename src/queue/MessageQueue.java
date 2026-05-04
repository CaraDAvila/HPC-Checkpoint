package queue;

import entities.Message;

public class MessageQueue {
    final int N = 3;
    Message[] queue = new Message[N];
    int head, tail, index;

    public void init() {
        index = tail = 0;
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public boolean isFull() {
        return (index == N);
    }

    public void enqueue(Message elem) {
        if (isFull()) {
            System.out.println("[FULL QUEUE]");
        } else {
            queue[tail] = elem;
            index++;

            tail = (tail + 1) % N;
        }
    }

    public Message dequeue() {
        Message elem = queue[head];
        index--;

        head = (head - 1) % N;
        return elem;
    }

    public Message first () {

        return( queue[head]);
    }

}
