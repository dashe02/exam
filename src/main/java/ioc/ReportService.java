package ioc;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 */
public class ReportService {
    private ReportGenerator reportGenerator;

    /*
     采用setter注入
     */
    public void setReportGenerator(ReportGenerator reportGenerator) {
            this.reportGenerator=reportGenerator;
    }
    public void generateAnnualReport(int year){
        String[] statistics=null;
        reportGenerator.generate(statistics);
    }
    public void generateMonthlyReport(int year,int month){
        String[] statistic=null;
        reportGenerator.generate(statistic);
    }
    public void generateDailyReport(int year,int month,int day){
        String[] statistic=null;
        reportGenerator.generate(statistic);
    }
}
