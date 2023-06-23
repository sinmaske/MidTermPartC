/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Maskeen Singh
 */
import java.util.Scanner;

public class TestUserprofile {
    private String userName;
    private String userFavoriteGenre; // code from NetBeans

    public TestUserprofile(String name, String favoriteGenre) {
        userName = name;
        userFavoriteGenre = favoriteGenre;
    }

    public void displayUserProfile() {
        System.out.println("User Profile:");
        System.out.println("Name: " + userName);
        System.out.println("Favorite Genre: " + userFavoriteGenre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] genres = { "Action", "Adventure", "Comedy", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Sci-Fi" };

        System.out.println("Choose your favorite genre:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();
        scanner.close();

        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice.");
        } else {
            String favoriteGenre = genres[genreChoice - 1];
            TestUserprofile userProfile = new TestUserprofile(name, favoriteGenre);
            userProfile.displayUserProfile();
        }
    }
}
