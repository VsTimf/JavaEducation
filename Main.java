

public class Main {
    public static void main (String[] args)
    {
        Movie [] movies = new Movie[4];
        movies[0] = new Movie("Русалочка", Movie.CHILDRENS);
        movies[1] = new Movie("Побег из Шоушенка", Movie.REGULAR);
        movies[2] = new Movie("Пчеловод", Movie.NEW_RELEASE);

        movies[3] = new Movie("Король Лев", Movie.CHILDRENS);

        Customer [] customers = new Customer[3];
        customers[0] = new Customer("Димыч");
        customers[1] = new Customer("Егорыч");
        customers[2] = new Customer("Геннадич");

        customers[0].addRental(new Rental(movies[0], 3));
        customers[0].addRental(new Rental(movies[3], 4));

        customers[2].addRental(new Rental(movies[1], 3));
        customers[1].addRental(new Rental(movies[2], 3));

        System.out.println(customers[0].statement());
        System.out.println(customers[1].statement());
        System.out.println(customers[2].statement());

    }
}
