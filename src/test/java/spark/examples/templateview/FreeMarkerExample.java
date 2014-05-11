//package spark.examples.templateview;
//
//import static spark.Spark.get;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import spark.ModelAndView;
//import spark.Request;
//import spark.Response;
//import spark.TemplateEngine;
//import spark.TemplateViewRoute;
//
//public class FreeMarkerExample {
//
//    public static void main(String args[]) {
//
//        new TemplateViewRoute() {
//            @Override
//            public Object handle(Request request, Response response, TemplateEngine engine) {
//                return null;
//            }
//        };
//
//        get(new FreeMarkerTemplateView("/hello") {
//            @Override
//            public ModelAndView handle(Request request, Response response) {
//                Map<String, Object> attributes = new HashMap<>();
//                attributes.put("message", "Hello World");
//
//                // The hello.ftl file is located in directory:
//                // src/test/resources/spark/examples/templateview/freemarker
//                return new ModelAndView(attributes, "hello.ftl");
//            }
//        });
//
//    }
//
//}