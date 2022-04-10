package com.noah;

import java.util.ArrayList;

public class Datapack {
    String name;
    ArrayList<MCFile> files;

    public Datapack(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void getVars(String filepath) {
        MCFile file = new MCFile(filepath);
        if (file.containsVars())
            this.files.add(file);
    }

    public boolean containsFile(String filepath) {
        return filepath.contains(this.name);
    }

    @Override
    public String toString() {
        StringBuilder allVars = new StringBuilder();
        for (MCFile f : this.files) {
            allVars.append(f.toString());
        }
        return "Datapack [" + this.name + "] = {\n" +
                allVars +
                "}";
    }
}