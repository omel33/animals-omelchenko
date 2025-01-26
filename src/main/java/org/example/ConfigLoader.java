package org.example;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigLoader {
    public  Config loadConfig(String filePath) throws IOException {
        Yaml yaml = new Yaml(new Constructor(Config.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("config.yml");
        return yaml.load(inputStream);
//        try (InputStream in = Files.newInputStream(Paths.get(filePath))) {
//            return yaml.loadAs(in, Config.class);
//        }
    }
}
