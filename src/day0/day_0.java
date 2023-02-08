package day0;
import java.util.*;
//202. 快乐数
//        简单
//        1.2K
//        相关企业
//        编写一个算法来判断一个数 n 是不是快乐数。
//
//        「快乐数」 定义为：
//
//        对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
//        然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//        如果这个过程 结果为 1，那么这个数就是快乐数。
//        如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
public class day_0 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        boolean a = isHappy(n);
        System.out.println(a);
    }
    public static boolean isHappy(int n) {
       List<Integer>mList = new ArrayList<>();
        while(n!=1&&!mList.contains(n)){
            mList.add(n);
            n =change(n);
            System.out.println(n);
        }
        return n==1;
    }
    public static int change(int n){
        int sum = 0;
        while(n>0){
            int sum_0 = n%10;
            n/=10;
            sum +=sum_0*sum_0;

        }
        return sum;
    }
}
