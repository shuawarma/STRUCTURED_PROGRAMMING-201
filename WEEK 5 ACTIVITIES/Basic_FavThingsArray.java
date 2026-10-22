/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basic_favthingsarray;

/**
 *
 * @author joshua
 */
public class Basic_FavThingsArray {

    public static void main(String[] args) {

        String[] favorites = {
            "Volleyball",
            "Mobile Legends",
            "Roblox",
            "Music",
            "Mcdo"
        };

        System.out.println("=== MY FAVORITE THINGS ===");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        
        System.out.println("Total Favorites: " + favorites.length);
    }
}  
