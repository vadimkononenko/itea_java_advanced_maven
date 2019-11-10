package com.itea.homeworks.task6.serialize;

import java.io.*;

public class SerializeUtils {
    public void serialize(Object object, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public Object deserialize(String path) {
        Object object = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            object = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }

        return object;
    }
}
