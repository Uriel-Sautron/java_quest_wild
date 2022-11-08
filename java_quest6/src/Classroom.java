public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Joe", true);
        Wilder wilder2 = new Wilder("Paul", true);
        Wilder wilder3 = new Wilder("Juju", false);
        Wilder wilder4 = new Wilder("Henry", true);
        Wilder wilder5 = new Wilder("Toto", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());
        System.out.println(wilder5.whoAmI());

    }
}
