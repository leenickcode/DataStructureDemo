package com.example.administrator.datastructuredemo;

/**
 * Created by Administrator on 2019/3/7.
 *  数组实现 队列
 * @author Administrator
 */
public class ArrayQueue {
    String[] items;
    int size;
    int head;
    int tail;
    public ArrayQueue(int size) {
        this.size = size;
        items=new String[size];

    }

    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue(10);
        queue.inQueue("1");
        queue.inQueue("2");
        queue.inQueue("3");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        for (int i = queue.head; i <queue.tail ; i++) {
            System.out.println(queue.items[i]);
        }
    }

    /**
     * 进队
     * @param item
     */
    void inQueue(String item){
        items[tail]=item;
        ++tail;
    }

    /**
     * 出队
     */
    String deQueue(){
        String string=items[head];
        ++head;
        return string;
    }
}
