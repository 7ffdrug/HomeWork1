package DZ2;

public class Logger {
    public void log(String message, LogLevel level) {
        System.out.println(level.name() + ": " + message);
    }
}
