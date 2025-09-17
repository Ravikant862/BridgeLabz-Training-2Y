public class Q11 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;        // Year of the century
        int J = y / 100;        // Zero-based century


        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        // Convert h to 0=Sunday, 1=Monday, ...
        int dayOfWeek = ((h + 6) % 7);

        System.out.println(dayOfWeek);
    }
}
