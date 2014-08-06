package responsechain;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandler extends Handler{

    @Override
    public void handlerRequest() {

        if(getSuccessor()!=null){
            System.out.println("放过请求");
            getSuccessor().handlerRequest();
        }else {
            System.out.println("处理请求");
        }

    }
}
