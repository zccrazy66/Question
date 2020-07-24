//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import lombok.Data;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 测试
// *
// * @author zzg
// *
// */
//public class Test {
//    public static void main(String[] args) {
//        String data = "{\"results\":[{\"statement_id\":0,\"series\":[{\"name\":\"cpu_load_short\",\"columns\":[\"time\",\"value\"],\"values\":[[\"2015-01-29T21:55:43.702900257Z\",2],[\"2015-01-29T21:55:43.702900257Z\",0.55],[\"2015-06-11T20:46:02Z\",0.64]]}]},{\"statement_id\":1,\"series\":[{\"name\":\"cpu_load_short\",\"columns\":[\"time\",\"count\"],\"values\":[[\"1970-01-01T00:00:00Z\",3]]}]}]}\n";
//        JSONObject dataJSON = JSONObject.parseObject(data);
//        JSONArray results = dataJSON.getJSONArray("results");
//        results.forEach(result -> {
//            Map<String,List<Object>> column2ValueList = getColumn2ValueList((JSONObject) result);
//            System.out.println(column2ValueList);
//        });
//    }
//
//    /**
//     * 根据result结果生成column为key 多条value为结果的Map
//     *
//     * @param result influxDB返回结果result
//     * @return column为key 多条value为结果的Map
//     */
//    private static Map<String,List<Object>> getColumn2ValueList(JSONObject result) {
//        HashMap<String, List<Object>> column2valueList = new HashMap<>();
//        Result myObject = JSONObject.toJavaObject(result, Result.class);
//        myObject.getSeries().forEach(sery -> {
//            for (int i = 0; i < sery.getColumns().size(); i++) {
//                String column = sery.getColumns().get(i);
//                ArrayList<Object> valueList = new ArrayList<>();
//                column2valueList.put(column, valueList);
//                final int index = i;
//                sery.getValues().forEach(value -> {
//                    Object object = value.get(index);
//                    valueList.add(object);
//                });
//            }
//        });
//        return column2valueList;
//    }
//
//
//}
//
//@Data
//class Result {
//    private String statement_id;
//    private List<Series> series;
//}
//
//@Data
//class Series {
//    private String name;
//    private List<String> columns;
//    private List<List<Object>> values;
//}