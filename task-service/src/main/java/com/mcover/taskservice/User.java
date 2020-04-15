package com.mcover.taskservice;

public class User {

    private final long id;
    private final String name;
    private final int passwordHash;

    public User(long id, String name, int passwordHash) {
        this.id = id;
        this.name = name;
        this.passwordHash = passwordHash;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean checkPasswordHash(int hash) {
        return this.passwordHash == hash;
    }

}
