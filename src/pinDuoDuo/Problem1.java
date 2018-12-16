//package pinDuoDuo;
/*
     Author:Mason
     2018/12/15 16:47
     1、Alice、Bob、Cathy、Dave四个人排队喝可乐，喝完一个人变两个，接着继续到队尾排队，问第N个人喝可乐的人是谁

如：N=8： ABCDAABB，第八个人是B

1.复制可乐，有4个人排队从自动售货机买复制可乐，买完就复制自己（复制对复制品有效），比如A买一轮有2个A，买两轮有4个A。。。。问在可乐数目给定情况下，最后买到可乐的人的名字。

买可乐的4个人：Alice，Bob，Cathy，David

输入：N

输出：名字

分析：通过每次减去被买走的可乐之道获得最后一轮的可乐数目m，此时（m-1）/2^k）即为所求。
*/

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = {"Alice", "Bob", "Cathy", "David"};
        int curr = 0;
        int copy = 1;
        while (true) {
            int judge = 0;
            for (String aName : name) {
                curr += copy;
                if (curr >= n) {
                    System.out.println(aName);
                    judge = 1;
                    break;
                }
            }
            if (judge == 1) {
                break;
            }
            copy *= 2;
        }
    }
}
