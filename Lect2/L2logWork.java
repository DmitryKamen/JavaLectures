package Lect2;


import java.util.logging.Logger;
import java.util.logging.*;
import java.io.IOException;


public class L2logWork {
    
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(L2logWork.class.getName());
        // logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(sFormat);
        // ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");

    }
}
