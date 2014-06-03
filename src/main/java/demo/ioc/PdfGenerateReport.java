package demo.ioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午9:15
 * To change this template use File | Settings | File Templates.
 */
public class PdfGenerateReport implements GenerateReport{

    @Override
    public void generateReport(String[] table) {
        System.out.println("Generate Pdf Report");
    }
}
