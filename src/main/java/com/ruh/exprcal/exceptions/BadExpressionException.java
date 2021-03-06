package com.ruh.exprcal.exceptions;

/**
 *
 * @author Rupanjan Hari
 */
public class BadExpressionException extends Exception {

    /**
     * Creates a new instance of <code>BadExpressionException</code> without
     * detail message.
     */
    public BadExpressionException() {
        System.err.println("The expression is bad resulting erronious output.");
    }

    /**
     * Constructs an instance of <code>BadExpressionException</code> with the
     * specified detail message with the expression.
     *
     * @param msg the detail message.
     * @param exp the Expression
     */
    public BadExpressionException(String msg, String exp) {
        super(msg);
        System.err.println("The expression is bad.\nExpression: " + exp);
    }

}
