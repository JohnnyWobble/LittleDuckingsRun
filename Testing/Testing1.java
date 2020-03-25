/**
 * <desciption>
 * 
 * @author Max Gordon
 * @version 12/13/2019
 */

public class Testing1 implements TestingInterface{
    public Testing1() {

    }

    @Override
    public void ok() {
        System.out.println("ok");
    }

    @Override
    public void test() {
        System.out.println("test");
    }

    public void other() {
        System.out.println("other");
    }
}