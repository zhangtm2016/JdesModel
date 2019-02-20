package simpleFactory;

/**
 * 解释: 静态工厂方法
 * Created by tianming.zhang on 2019/2/20.
 */
public class FriutGardener {
    public static Fruit factory(String which) throws BadFruitException{
        if(which.equalsIgnoreCase("apple")){
            return new Apple();
        } else if(which.equalsIgnoreCase("strawberry")){
            return new Strawberry();
        } else {
            throw new BadFruitException("Bad fruit request");
        }
    }
}
