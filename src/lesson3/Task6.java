package lesson3;

public class Task6 {
    public static void main(String[] args) {
        String email = "john_smith@example.com";
        String domain = email.substring(email.indexOf("@")+1);
        String login = email.substring(0,email.indexOf("@"));
        String name = login.substring(0,login.indexOf("_"));
        String surName = login.substring(login.indexOf("_")+1);
        String firLetName = name.substring(0,1);
        String firLetSurname = surName.substring(0,1);
        firLetName = firLetName.toUpperCase();
        firLetSurname = firLetSurname.toUpperCase();
        name = firLetName + name.substring(1);
        surName = firLetSurname + surName.substring(1);
        login = name + " " +surName;
        System.out.println("login: " + login);
        System.out.println("domain: " + domain);
    }
}
