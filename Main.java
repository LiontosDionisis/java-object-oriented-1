package gr.aueb.cf.oop;

public class Main {

    public static void main(String[] args) {
        User jacob = new User(1, "Jacob", "Williams");
        User prince = new User(2, "Prince", "Royals");
        UserCredentials jacobCreds = new UserCredentials(1, "Jacob123", "225287");
        UserCredentials princeCreds = new UserCredentials(2, "PrinceRoyals5543", "5783495438");

        System.out.printf("User ID: %d\t Firstname: %s\t Lastname: %s\t Username: %s\t Password: %s", jacob.getId(), jacob.getFirstname(), jacob.getLastname(),
                            jacobCreds.getUsername(), jacobCreds.getPassword());
        System.out.println();
        System.out.printf("User ID: %d\t Firstname: %s\t Lastname: %s\t Username: %s\t Password: %s", prince.getId(), prince.getFirstname(), prince.getLastname(),
                            princeCreds.getUsername(), princeCreds.getPassword());
    }
}
