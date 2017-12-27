package app.model;

import app.entities.User;

import java.util.List;
import java.util.ArrayList;

public class Model {

    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<User>();
    }

    public void add(User user) {
        model.add(user);
    }

}

