package fila;

import entidades.Mensagem;

public class FilaMensagens {
    final int N = 3;
    Mensagem[] queue = new Mensagem[N];
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

    public void enqueue(Mensagem elem) {
        if (isFull()) {
            System.out.println("[FULL QUEUE]");
        } else {
            queue[tail] = elem;
            index++;

            tail = (tail + 1) % N;
        }
    }

    public Mensagem dequeue() {
        Mensagem elem = queue[head];
        index--;

        head = (head - 1) % N;
        return elem;
    }

    public Mensagem first () {

        return( queue[head]);
    }

}
