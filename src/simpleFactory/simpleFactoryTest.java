package simpleFactory;

/**
 * 解释:简单工厂模式测试
 * Created by tianming.zhang on 2019/2/20.
 */


public class simpleFactoryTest {

    public static void main(String args[]){

        try{
            Fruit apple01 = FriutGardener.factory("apple");

            apple01.grow();
        }catch (Exception e){
            System.out.print(e);
        }


    }
}
