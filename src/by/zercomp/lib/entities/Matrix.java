package by.zercomp.lib.entities;

import java.util.Arrays;

public class Matrix {

    /**
     * Constant value for creating matrices
     * via the constructor without parameters.
     */
    private static final int DEFAULT = 3;

    /**
     * Two-dimensional array that
     * stores integer values of the matrix.
     */
    private int[][] array2d;

    /**
     * Default constructor without parameters.
     * Using constant DEFAULT for creating
     * default matrices.
     */
    public Matrix() {
        array2d = new int[DEFAULT][DEFAULT];
    }

    /**
     * Constructor with one parameter
     * that creating square Matrix.
     * @param size - requested size for creating
     *             [Size X Size] Matrix
     */
    public Matrix(final int size) {
        array2d = new int[size][size];
    }

    /**
     * Constructor that create matrices of size MxN.
     * @param sizeA - M size of created matrix.
     * @param sizeB - N size of created matrix.
     */
    public Matrix(final int sizeA, final int sizeB) {
        array2d = new int[sizeA][sizeB];
    }

    /**
     * Overriding basic method
     * for transforming main information
     * from class to string that User[coder]
     * can read [human-readable style].
     * @return string of array2d;
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Matrix").append(String.format(" size[%d,%d]", array2d.length, array2d[0].length));
        sb.append("===========================\n");
        for (final int[] i: array2d) {
            sb.append(Arrays.toString(i)).append("\n");
        }
        sb.append("===========================\n");
        return sb.toString();
    }

}
