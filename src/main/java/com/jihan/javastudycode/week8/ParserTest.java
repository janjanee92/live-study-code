package com.jihan.javastudycode.week8;

interface Parseable {
    void parse(String fileName);
}

class XMLParser implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "-XML parsing");
    }
}

class HTMLParser implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing");
    }
}

class ParserManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
