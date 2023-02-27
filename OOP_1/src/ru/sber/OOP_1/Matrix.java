package ru.sber.OOP_1;

public class Matrix {
    private final double[][] matrix;

    public final int rowCount;

    public final int columnCount;

    public Matrix(int rowCount, int columnCount) throws IllegalArgumentException {
        if (rowCount < 0) {
            throw new IllegalArgumentException(String.format("Невалидное количество строк: %d", rowCount));
        }

        if (columnCount < 0) {
            throw new IllegalArgumentException(String.format("Невалидное количество столбцов: %d", columnCount));
        }

        this.matrix = new double[rowCount][columnCount];
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }


    public Matrix setValue(int row, int column, double value) {
        if (row >= rowCount || row < 0) {
            return this;
        }

        if (column >= columnCount || column < 0) {
            return this;
        }

        matrix[row][column] = value;
        return this;
    }

    public Matrix add(Matrix otherMatrix) {
        int row = Math.min(rowCount, otherMatrix.rowCount);
        int column = Math.min(columnCount, otherMatrix.columnCount);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] += otherMatrix.matrix[i][j];
            }
        }

        return this;
    }


    public Matrix multiply(double modifier) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= modifier;
            }
        }

        return this;
    }


    public Matrix multiply(Matrix otherMatrix) {
        int row = Math.min(rowCount, otherMatrix.rowCount);
        int column = Math.min(columnCount, otherMatrix.columnCount);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] *= otherMatrix.matrix[i][j];
            }
        }

        return this;
    }


    public Matrix print() {
        System.out.format("%s\n", this);

        return this;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(2 * rowCount * columnCount + rowCount);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                builder.append(matrix[i][j]).append(' ');
            }

            builder.append('\n');
        }

        return builder.toString();
    }
}
