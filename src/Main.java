public class Main {
    public static void main(String[] args) {
        final var person = new Person("Matheus", 26);
        final var personDto = new PersonDto("Matheus", 26);
        System.out.println(person);
        System.out.println(personDto);
        System.out.println(personDto.name());
        System.out.println(personDto.age());
        personDto.printName();
        PersonDto.printMessage();
    }
}
