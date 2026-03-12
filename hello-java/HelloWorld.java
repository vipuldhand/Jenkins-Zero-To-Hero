public class HelloWorld {
    public static void main(String[] args) {
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
        String reset = "\u001B[0m";
        String message = "Hello, World!";
        
        System.out.println("\n" + "╔" + "═".repeat(message.length() + 4) + "╗");
        System.out.print("║  ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(colors[i % colors.length] + message.charAt(i) + reset);
        }
        System.out.println("  ║");
        System.out.println("╚" + "═".repeat(message.length() + 4) + "╝\n");
    }
}
