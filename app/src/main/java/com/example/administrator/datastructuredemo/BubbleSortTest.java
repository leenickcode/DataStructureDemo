package com.example.administrator.datastructuredemo;

/**
 * Created by Administrator on 2019/3/7.
 *
 * @author Administrator
 */
public class BubbleSortTest  {
    private static int sa[] = {72, 20, 35, 88, 36, 91, 52, 64};
    public static void main(String[] args) {
        bubbleSort();
        for (int i = 0; i <sa.length ; i++) {
            System.out.println(sa[i]);
        }
    }

    /**
     * 冒泡排序 从小到大
     */
  static   void bubbleSort(){
      for (int i = 0; i <sa.length ; i++) {
          for (int j = 1; j < sa.length; j++) {
                if (sa[j]<sa[j-1]){
                    int temp=sa[j];
                    sa[j]=sa[j-1];
                    sa[j-1]=temp;
                }
          }
      }
    }
}
