package com.pay.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

public class JsonToMapUtils {
	/** 日志文件生成器 */
	private static Logger log = Logger.getLogger(JsonToMapUtils.class);
	@SuppressWarnings("unchecked")
	public static Map<String, Object> parseJsonToMap(String jsonStr){
	    Map<String, Object> map = new HashMap<String, Object>();
	    //最外层解析
	    JSONObject json = JSONObject.fromObject(jsonStr);
	    for(Object k : json.keySet()){
		      Object v = json.get(k); 
		      //如果内层还是数组的话，继续解析
		      if(v instanceof JSONArray){
					List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
					Iterator<JSONObject> it = ((JSONArray)v).iterator();
					while(it.hasNext()){
					  JSONObject json2 = it.next();
					  list.add(parseJsonToMap(json2.toString()));
					}
					map.put(k.toString(), list);
					log.info("k.toString()="+k.toString()+"list="+list);
		      } else {
		    	  map.put(k.toString(), v);
		    	  log.info("k.toString()="+k.toString()+"v="+v);
		      }
	    }
	    return map;
	}
	
    public static String mapToJson(Map<String, String> map) {
        Set<String> keys = map.keySet();
        String key = "";
        String value = "";
        StringBuffer jsonBuffer = new StringBuffer();
        jsonBuffer.append("{");
        for (Iterator<String> it = keys.iterator(); it.hasNext();) {
            key = (String) it.next();
            value = map.get(key);
            jsonBuffer.append(key + ":" +"\""+ value+"\"");
            if (it.hasNext()) {
                jsonBuffer.append(",");
            }
        }
        jsonBuffer.append("}");
        return jsonBuffer.toString();
    }
}
