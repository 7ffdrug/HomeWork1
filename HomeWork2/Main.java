package DZ2;

public class Main {
    public static void main(String[] args) throws Exception {

        // ----- DRY -----
        Logger logger = new Logger();
        logger.log("Ошибка при загрузке", LogLevel.ERROR);
        logger.log("Предупреждение", LogLevel.WARNING);
        logger.log("Информация", LogLevel.INFO);

        DatabaseService dbService = new DatabaseService();
        dbService.connect();

        LoggingService loggingService = new LoggingService();
        loggingService.log("Сообщение в лог");


        // ----- KISS -----
        int[] numbers = { -3, 0, 4, 10, -1, 5 };

        System.out.println("\nKISS ProcessNumbers:");
        new Main().processNumbers(numbers);

        System.out.println("\nKISS PrintPositiveNumbers:");
        new Main().printPositiveNumbers(numbers);

        System.out.println("\nKISS Divide:");
        System.out.println("10 / 2 = " + new Main().divide(10, 2));
        System.out.println("10 / 0 = " + new Main().divide(10, 0));


        // ----- YAGNI -----
        User user = new User();
        user.setName("John");
        user.setEmail("john@mail.com");

        System.out.println("\nUser data:");
        System.out.println(user.getName());
        System.out.println(user.getEmail());

        FileReader reader = new FileReader();
        // Проверка чтения файла (создай file.txt в корне проекта)
        // System.out.println(reader.readFile("file.txt"));

        ReportGenerator report = new ReportGenerator();
        report.generatePdfReport();
    }


    // Методы KISS:

    public void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return;

        for (int number : numbers) {
            if (number > 0)
                System.out.println(number);
        }
    }

    public void printPositiveNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number > 0)
                System.out.println(number);
        }
    }

    public int divide(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;
    }
}
