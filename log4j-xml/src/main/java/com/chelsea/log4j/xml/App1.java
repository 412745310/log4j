package com.chelsea.log4j.xml;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;

public class App1 {

    private static Log log = LogFactory.getLog(App1.class);

    public static void main(String[] args) {
        DOMConfigurator.configure(Thread.currentThread().getContextClassLoader().getResource("log4j.xml"));
        // 不可以打印日志到磁盘
        log.info("Hello World!");
    }
}
