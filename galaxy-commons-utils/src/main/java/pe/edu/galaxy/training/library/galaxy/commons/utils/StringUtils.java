package pe.edu.galaxy.training.library.galaxy.commons.utils;

import org.springframework.stereotype.Component;

@Component
public class StringUtils {

    public String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}
