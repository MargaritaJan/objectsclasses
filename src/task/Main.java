public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //tack1
        Author pushkin = new Author("Александр", "Пушкин");

        System.out.println(pushkin.getFirsName());
        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println(lermontov.getFirsName());
        Book borodino = new Book("Бородино", pushkin, 1837);
        Book onegin = new Book("Евгений Онегин", lermontov, 1831);
        borodino.setAgePublisher(1820);
        System.out.println(borodino.getAgePublisher());
        System.out.println(onegin.getNameBook() + " " + onegin.getNameAuthor() .getFirsName() + " " + onegin.getAgePublisher());

    }
}



