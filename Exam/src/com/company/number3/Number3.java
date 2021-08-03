package com.company.number3;


import java.io.File;

public class Number3 {
    Exception FileAlreadyExistsException;

    public void createFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (file.exists()) {
            throw FileAlreadyExistsException;
        } else {
            file.createNewFile();

        }

    }
}
