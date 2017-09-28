package com.test.bu.utils;

import com.test.bu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> validate(User user) {
        List<String> result = new ArrayList<>();
        if (user.getUsername().length() < 4) {
            result.add("Erro1");
        }
        result.add("Erro2");
        return result;
    }
}
