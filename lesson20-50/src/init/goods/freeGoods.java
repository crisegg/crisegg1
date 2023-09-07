package init.goods;

public enum freeGoods{面条("面条",2.00,10),
    牛奶("牛奶",5.00,5),鸡蛋("鸡蛋",1.0,100);

    private String N;
    private double soldprice;
    private int count;
 freeGoods(String N,double soldprice,int count){
     this.N=N;
     this.soldprice=soldprice;
     this.count=count;
 }
public String tostring(){
    return N+"售价为："+soldprice+"/n" +"共有"+count+"件";
}





}