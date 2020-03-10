/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class German3 extends Homework3 {
    public German3() {
        super();
    }

    public void type(int numPages) {
        setPages(numPages);
        setType("German");
    }

    public void doHomework(int readPages) {
        setPages(getPages() - readPages);
    }
}