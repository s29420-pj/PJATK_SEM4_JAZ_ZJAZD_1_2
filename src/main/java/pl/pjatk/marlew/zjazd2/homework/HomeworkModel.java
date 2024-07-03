package pl.pjatk.marlew.zjazd2.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

public class HomeworkModel {
    private String name;

    public HomeworkModel() {
    }

    public HomeworkModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
