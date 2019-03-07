package com.example.administrator.datastructuredemo;

/**
 * Created by Administrator on 2019/3/6.
 * 快速排序
 * @author Administrator
 */
public class QuitSortTest {
    private static int sa[] = {72, 20, 35, 88, 36, 91, 52, 64};
    public static void main(String[] args) {
        quickSort(sa, 0, sa.length - 1);
        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]);
        }
    }

    //快速排序  从小到大
    public static void quickSort(int s[], int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int x = s[i];//作为基数用来，目的实现比基数小的都放左边，大的放右边
            while (i < j) {
                //从右向左 找比基数小的数
                while (i < j && s[j] >= x) {
                    --j;
                }
                s[i] = s[j];
                //从左向右 找比基数大的数。
                while (i < j && s[i] <= x) {
                    //没找到 +1
                    ++i;
                }
                s[j] = s[i];
            }
            s[i] = x;
            quickSort(s, 0, i - 1);//左半部分继续排序
            quickSort(s, i + 1, right);//右半部分继续排序
        }
    }
}
