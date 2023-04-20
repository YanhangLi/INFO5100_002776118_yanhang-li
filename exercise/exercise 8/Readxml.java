package com;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

public class Readxml {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new File("/Users/liyanhang/IdeaProjects/DemoMaven/src/main/java/com/data.xml"));
            Element rootElement = document.getRootElement();
            Iterator<Element> iterator = rootElement.elementIterator();
            while (iterator.hasNext()) {
                Element next = iterator.next();
                System.out.println(next.getName() + ":" + next.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
