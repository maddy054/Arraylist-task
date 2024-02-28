package tester;

import java.util.logging.*;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());

    public static void main(String[] args) {
        try {
            // Create a FileHandler that writes log messages to a file
            FileHandler fileHandler = new FileHandler("logfile.log",true);

            // Configure the format of the log messages
            XMLFormatter formatter = new XMLFormatter ();
            fileHandler.setFormatter(formatter);

            // Attach the FileHandler to the logger
            logger.addHandler(fileHandler);

            // Log some messages
            logger.info("This is an informational message.");
            logger.warning("This is a warning message.");
            logger.severe("This is a severe error message.");
        } catch (Exception e) {
            // Handle any exceptions that may occur during logging configuration
            e.printStackTrace();
        }
    }
}
