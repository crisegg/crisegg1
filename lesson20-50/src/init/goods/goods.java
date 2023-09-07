package init.goods;

public class goods {
    public  String name;
    public int id;
    public int count;
    public double purchasePrice;
    public double soldPrice;

    public final static goods [] m=new goods[100];

    public goods(){}
    public goods(int count)
    {this.count=count;}

    static{
        for(int i=0;i<100;i++) {
            m[i] = new goods();
            m[i].purchasePrice = Math.random() * 100 * Math.random();
            m[i].soldPrice = m[i].purchasePrice + Math.random() * 10;
            m[i].count = (int) (Math.random() * 10+1);
        }

    }

    public int getcount(){
        return count;
    }


    public void describe() {
        System.out.println("商品名:" + name + "序列号：" + id + "数量：" + count + "销售价：" + soldPrice);
    }
    public double caculateProfit() {

        double profit = soldPrice - purchasePrice;
        return profit;
    }





}