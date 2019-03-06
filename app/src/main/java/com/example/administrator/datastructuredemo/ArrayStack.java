package com.example.administrator.datastructuredemo;

/**
 * Created by Administrator on 2019/3/6.
 * 数组实现一个栈
 * @author Administrator
 */
public class ArrayStack {
    String[] items;
    int count;//栈内元素个数
    int n;//栈大小

    public ArrayStack(int n) {
       items=new String[10];
        this.n = n;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack(5);
        arrayStack.insert("aa");
        arrayStack.insert("bb");
        arrayStack.insert("cc");
        arrayStack.remove();
        for (int i = 0; i <arrayStack.count ; i++) {
            System.out.println(arrayStack.items[i]);

        }
    }

    /**
     * 入栈操作
     * @param item
     */
    void insert(String item){
        if (count!=n){
            items[count]=item;
            count++;
        }
    }

    /**
     * 出栈操作
     * @return
     */
    String remove(){
        String item=items[count];
        count--;
        return item;
    }

}
