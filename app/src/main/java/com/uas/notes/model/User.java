/**
 * NIM : 10120023
 * NAMA : Hikal Muhamad Alfaridzhi
 * KELAS : IF-1
 */
package com.uas.notes.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
