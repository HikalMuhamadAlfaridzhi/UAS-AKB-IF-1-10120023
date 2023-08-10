/**
 * NIM : 10120023
 * NAMA : Hikal Muhamad Alfaridzhi
 * KELAS : IF-1
 */
package com.uas.notes.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
