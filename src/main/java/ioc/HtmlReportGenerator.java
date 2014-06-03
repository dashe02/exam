package ioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午5:22
 * To change this template use File | Settings | File Templates.
 */
public class HtmlReportGenerator implements ReportGenerator{

    @Override
    public void generate(String[] table) {
        System.out.println("Generate HTML report......");
    }
}
