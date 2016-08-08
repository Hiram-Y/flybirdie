package utils;

import java.io.IOException;

public class JsonUtil {
//	
//
//    private static final Log LOG = Log.getLogger(JsonUtil.class);
//    private static final ObjectMapper mapper = new ObjectMapper();
//
//    static {
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);     // 序列化取出null值
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);  // 范序列化过滤多余字段
//    }
//
//    /**
//     * 将传入的实体类对象转换为JSON格式字符串对象。对需要转换的属性字段要提供get方法，否则该字段不被转换。如果转换过程出错，则返回""。
//     *
//     * @param o
//     * @return
//     */
//    public static String json2String(Object o) {
//        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//        try {
//            return ow.writeValueAsString(o);
//        } catch (IOException e) {
//            LOG.e("Error when converting a json object to a string. " + e.getMessage(), e);
//            return "";
//        }
//    }
//
//    /**
//     * 将传入的JSON字符串对象转换为{@link com.fasterxml.jackson.databind.JsonNode}对象。如果传入字符串格式不正确则返回null。
//     *
//     * @param s
//     * @return
//     */
//    public static JsonNode string2Json(String s) {
//        try {
//            ObjectReader or = mapper.reader();
//            return or.readTree(s);
//
//        } catch (IOException e) {
//            LOG.e("Error when converting a string to a json object. " + e.getMessage(), e);
//            return null;
//        }
//    }
//
//    /**
//     * 将传入的JSON字符串对象转换为对象。如果传入字符串格式不正确则返回null。
//     *
//     * @param s
//     * @return
//     */
//    public static <T> T string2Object(String s, Class<T> clazz) {
//        try {
//            return mapper.readValue(s.getBytes("utf-8"), clazz);
//        } catch (Exception e) {
//            LOG.e("Error when converting a string to a object. " + e.getMessage(), e);
//            return null;
//        }
//    }
//
//
}
