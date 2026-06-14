package com.example.shortlink.admin.test;

public class UserTableShardingTest {

    public static final String SQL = "ALTER TABLE t_link_%d MODIFY COLUMN full_short_url varchar(128) COLLATE utf8mb4_general_ci;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }

}
