public class App {
    public static void main(String[] args) {
        User Aerold = new User.UserBuilder()
                .addFirstName("Aerold")
                .addLastName("Torregoza")
                .addEmail("aerold.torregoza@neu.edu.ph")
                .addAge(20)
                .addPhone("09164701247")
                .addAddress("20 Vitex Court,Sydney, Australia,")
                .build();

        User Frank = new User.UserBuilder()
                .addFirstName("Frank")
                .addLastName("Ocean")
                .addEmail("frank.ocean@hotmail.com")
                .addAge(29)
                .addPhone("888-576-2205")
                .addAddress("19 Beryl Court,Darwin, 4300, Australia")
                .build();

        User Daniel = new User.UserBuilder()
                .addFirstName("Daniel")
                .addLastName("Caesar")
                .addEmail("daniel.caesar@hotmail.com")
                .addAge(25)
                .addPhone("1(800)274-0380")
                .addAddress("3 NE Adrian Court, Bend,or, 93301  United States")
                .build();

        System.out.println(Aerold);
        System.out.println(Frank);
        System.out.println(Daniel);
    }
}
