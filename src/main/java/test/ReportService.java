package test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午9:19
 * To change this template use File | Settings | File Templates.
 */
public class ReportService {
    private GenerateReport generateReport;

    public void setGenerateReport(GenerateReport generateReport) {
        this.generateReport = generateReport;
    }
    public void  generateAnnualReport(int year){
        String[] statistic=null;
        generateReport.generateReport(statistic);
    }
    public void generateMonthlyReport(int year,int month){
        String[] statistic=null;
        generateReport.generateReport(statistic);
    }
    public void generateDailyReport(int year,int month,int day){
        String[] statistic=null;
        generateReport.generateReport(statistic);
    }
}
