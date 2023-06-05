public record PersonDto(String name, int age) {
    public static final String MESSAGE = "Hello World";

    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void printMessage() {
        System.out.println(MESSAGE);
    }
}
