package com.epam.mjc.nio;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class FileReader {

    public Profile getDataFromFile(File file) {

        List<String> read = null;
        try {
            read = Files.readAllLines(file.toPath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        assert read != null;
        String name = read.get(0);
        String age = read.get(1);
        String email = read.get(2);
        String phone = read.get(3);


        String[] name1 = name.split(": ");
        String[] age1 = age.split(": ");
        String[] email1 = email.split(": ");
        String[] phone1 = phone.split(": ");

        return new Profile(name1[1], Integer.parseInt(age1[1]), email1[1], Long.parseLong(phone1[1]));

    }
}
