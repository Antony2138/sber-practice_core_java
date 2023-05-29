package ru.sber.Annatation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DataContainer {
    private String specification;

    private int precedence;

    private double period;

}