package pers.xia.jpython.interpreter.statement;

import pers.xia.jpython.interpreter.ProgramState;
import pers.xia.jpython.interpreter.expression.Expression;
import pers.xia.jpython.object.PyObject;

public class AssignStatement implements Statement {
    private String variableName;
    private Expression expression;
    private String[] vari;

    public AssignStatement(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    public AssignStatement(Expression expression, String[] vari) {
        this.variableName = null;
        this.expression = expression;
        this.vari = vari;
    }

    @Override
    public void run(ProgramState programState) {
        if (variableName != null) {
            PyObject expressionValue = expression.eval(programState);
            programState.setVariable(variableName, expressionValue);
        } else {
            for (int i = 0; i < vari.length; i++) {
                PyObject expressionValue = expression.eval(programState);
                programState.setVariable(vari[i], expressionValue);
            }
        }
    }
}