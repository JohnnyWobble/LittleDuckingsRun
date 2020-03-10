/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class German4 extends Homework4 {
    public German4() {
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