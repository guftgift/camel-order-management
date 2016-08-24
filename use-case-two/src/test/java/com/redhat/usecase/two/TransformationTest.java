package com.redhat.usecase.two;

import java.io.FileInputStream;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransformationTest extends CamelSpringTestSupport {
    
    @EndpointInject(uri = "mock:CSVtoXML-test-output")
    private MockEndpoint resultEndpoint;
    
    @Produce(uri = "direct:CSVtoXML-test-input")
    private ProducerTemplate startEndpoint;
    
   
    @Test
    public void transform() throws Exception {
    	startEndpoint.sendBody("direct:CSVtoXML-test-input", readFile("src/test/resources/data/message1.csv"));
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("direct:CSVtoXML-test-input")
                    .log("Before transformation:\n ${body}")
                    .unmarshal("bindyDataformat")
                    .to("ref:CSVtoXML")
                    .log("After transformation:\n ${body}")
                    .to("mock:CSVtoXML-test-output");
            }
        };
    }
    
    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }
    
    private String readFile(String filePath) throws Exception {
        String content;
        FileInputStream fis = new FileInputStream(filePath);
        try {
             content = createCamelContext().getTypeConverter().convertTo(String.class, fis);
        } finally {
            fis.close();
        }
        return content;
    }
}
