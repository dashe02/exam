package jsonParse;


import jsonTool.JSONArray;
import jsonTool.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
public class JsonParse {
    public static void parse(String s){
        try{
            JSONObject dataJson=new JSONObject(s);
            JSONObject response=dataJson.getJSONObject("response");
            JSONArray data=response.getJSONArray("data");
            JSONObject info=data.getJSONObject(0);
            String province=info.getString("province");
            String city=info.getString("city");
            String district=info.getString("district");
            String address=info.getString("address");
            System.out.println(province+","+city+","+district+","+address);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String s="{\"response\":{\"data\":[{\"address\":\"南京市游乐园\",\"province\":\"江苏\",\"district\":\"玄武区\",\"city\":\"南京\"}]},\"status\":\"ok\"}";
        parse(s);
    }





}
