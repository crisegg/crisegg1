package init;
import init.goods.goods;
import init.market.market;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public class changcount {
    public static void main(String... args)throws InvocationTargetException ,NoSuchFieldException,IllegalAccessException{
        market a=new market();
        goods b=a.getgoods1();
        Class c=goods.class;
        Field countField=c.getField("count");
        countField.set(b,(int)countField.get(b)-1);
    }
}
