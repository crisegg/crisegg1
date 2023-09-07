package init.goods;
import java.util.Scanner;
import init.market.market;
import init.changcount;

public class Custmor {
    public static void main(String[] args) {
        market a=new market();
        boolean i=true;

        while(i) {
            System.out.println("请输入要购买的商品id:"+"(0~99)");
            int j=new Scanner(System.in).nextInt();
            if(0<=j&j<=99){
                while (true){
            System.out.println("请输入需要购买商品的数量：");
            int n=new Scanner(System.in).nextInt();
            if(0<n&n<= init.goods.goods.m[j].count){
            a.getFreeGood(init.goods.goods.m[j],n);
            System.out.println("请付款"+ init.goods.goods.m[j].soldPrice*n+"元");
            i=false;
            break;
            }
            else{System.out.println("库存不足");}}
    }
        else{System.out.println("请输入正确的商品id");}
    }



    }
}
