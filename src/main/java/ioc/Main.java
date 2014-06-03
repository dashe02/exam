package ioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午6:33
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Container container=new Container();
        ReportService reportService=(ReportService)container.getComponent("reportService");
        reportService.generateAnnualReport(2009);
    }
}
