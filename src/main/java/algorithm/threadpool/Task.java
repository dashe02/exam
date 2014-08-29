package algorithm.threadpool;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-22
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public abstract class Task implements Runnable{

      private Date generateTime=null;
      //提交执行时间
      private Date submitTime=null;
      //开始执行时间
      private Date beginExecuteTime=null;
      //执行完成时间
      private Date finishTime=null;

      private long taskId;

    public Task(){
        this.generateTime=new Date();
    }
    public void run(){

    }
    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getBeginExecuteTime() {
        return beginExecuteTime;
    }

    public void setBeginExecuteTime(Date beginExecuteTime) {
        this.beginExecuteTime = beginExecuteTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public abstract Task[] taskCore() throws Exception;
    //是否用到数据库
    protected abstract boolean useDb();

    protected abstract boolean needExecuteImmediate();

    public abstract String info();










}
