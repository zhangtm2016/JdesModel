package simpleFactory;

/**
 * 解释: 接口 水果
 * Created by tianming.zhang on 2019/2/20.
 */
public interface Fruit {
    /*生长*/
    abstract public void grow();

    /*收获*/
    abstract public void harvest();

    /*种植*/
    abstract public void plant();
}
