package init.market;
import init.goods.goods;
import java.util.Scanner;
import init.goods.freeGoods;
import init.changcount;
public class market {
    public goods nuddle;
    public goods milk;
    public goods egg;
    public market()
    {
        nuddle =new goods(10);
        milk=new goods(5);
        egg=new goods(100);
    }
    public goods getgoods1()

    {return nuddle;}

    

    public  void getFreeGood (goods x, int n){

      if(x.caculateProfit()*n>10) {
            System.out.println("可以获得赠品,请输入赠品（输入其他放弃赠品）：");
            for (freeGoods a : freeGoods.values()) {
                System.out.println(a.tostring());

            }
            boolean t = true;
            while (t) {
                Scanner a = new Scanner(System.in);
                if ("面条".equals(a.next())) {

                    if (nuddle.getcount()>0) {
                        System.out.println("获得赠品成功");
                        t = false;
                        new changcount();
                    } else {
                        System.out.println("赠品不足，重新选择输入");
                    }
                }
                 else if ("鸡蛋".equals(a.next())) {

                     if (egg.getcount()>= 0) {

                         System.out.println("获得赠品成功");

                                t = false;
                            } else {
                                System.out.println("赠品不足，重新选择输入");

                        }}
                 else if ("牛奶".equals(a.next())) {

                            if (milk.getcount() >= 0) {
                                System.out.println("获得赠品成功");
                                t = false;
                            } else {
                                System.out.println("赠品不足，重新选择输入");
                            }
                        }
                  else{System.out.println("放弃赠品");
                        break;
                  }


                    }

                }
            }
}



