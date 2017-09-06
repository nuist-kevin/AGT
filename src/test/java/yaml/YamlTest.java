package yaml;

import com.caiwen.web.domain.page.Page;
import com.caiwen.web.domain.page.PageElement;
import com.caiwen.web.domain.testcase.Step;
import com.caiwen.web.domain.testcase.TestCase;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.IOException;
import java.util.Comparator;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class YamlTest {

  @Test
  public void test() throws Exception {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    JavaType pageElementList = mapper.getTypeFactory()
        .constructCollectionType(List.class, PageElement.class);

    Page loginpage = mapper
        .readValue(new File("D:\\IdeaProjects\\awgt\\src\\test\\resources\\login.yaml"),
            Page.class);

    System.out.println(loginpage.getName());
    System.out.println(loginpage.getUrl());

    loginpage.getPageElements().stream().forEach(
        pageElement -> {
          Arrays.stream(PageElement.class.getDeclaredMethods()).filter(
              method -> method.getName().startsWith("get")).
              filter(method -> {
                Object result = null;
                try {
                  result = method.invoke(pageElement);
                } catch (IllegalAccessException e) {
                  e.printStackTrace();
                } catch (InvocationTargetException e) {
                  e.printStackTrace();
                }
                return result != null;
              }).
              forEach(method -> {
                try {
                  System.out.println(method.getName() + ": " + method.invoke(pageElement));
                } catch (IllegalAccessException e) {
                  e.printStackTrace();
                } catch (InvocationTargetException e) {
                  e.printStackTrace();
                }
              });
        }
    );


       /* Arrays.stream(PageElement.class.getDeclaredMethods()).filter(method -> method.getName().startsWith("get")).
                filter(method -> {
                    Object result = null;
                    try {
                        result = method.invoke(username);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return result != null;
                }).
                forEach(method -> {
            try {
                System.out.println(method.invoke(username));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });*/
  }

  @Test
  public void testLoginTest() throws IOException {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    TestCase testCase = mapper
        .readValue(new File("D:\\TESTCASE\\AGT\\src\\test\\resources\\loginTest.yaml"),
            TestCase.class);
    testCase.getSteps().stream()
        .sorted(Comparator.comparingInt(Step::getSequence))
        .forEach(step -> System.out
            .println(step.getSequence() + ": " + step.getOperation()));
    testCase.getExpects().stream().forEach(
        expect -> {
          System.out.println(expect.getPredication() + ": ---------");
          Arrays.stream(expect.getArguments()).forEach(System.out::println);
        }
    );
  }
}
