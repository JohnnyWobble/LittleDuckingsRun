/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class English4 extends Homework4 {
    public English4() {
        super();
    }

    public void type(int numPages) {
        setPages(numPages);
        setType("English");
    }

    public void doHomework(int readPages) {
        setPages(getPages() - readPages);
    }
}