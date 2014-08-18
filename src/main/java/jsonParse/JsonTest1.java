package jsonParse;

import jsonTool.JSONArray;
import jsonTool.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 */
public class JsonTest1 {
    public static void parse(String s){
        try{
        JSONObject jsonObject=new JSONObject(s);
        JSONObject response=jsonObject.getJSONObject("response");
        JSONArray data=response.getJSONArray("data");
        JSONObject info=data.getJSONObject(0);
        String address=info.getString("address");
        String province=info.getString("province");
        String district=info.getString("district");
        String city=info.getString("city");
        System.out.println(address+","+province+","+district+","+city);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String data="{\"response\":{\"data\":[{\"address\":\"南京游乐场\",\"province\":\"江苏\",\"district\":\"玄武区\",\"city\":\"南京\"}]},\"status\":\"ok\"}";
        parse(data);
    }
}
