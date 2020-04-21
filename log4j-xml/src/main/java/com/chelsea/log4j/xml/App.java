package com.chelsea.log4j.xml;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

public class App {

    private static Log log = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        DOMConfigurator.configure(Thread.currentThread().getContextClassLoader().getResource("log4j.xml"));
        // 可以打印日志到磁盘
        log.info("Hello World!");
    }
}
