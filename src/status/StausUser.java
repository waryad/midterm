/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
public class StausUser 
{
 
public enum Value {ZERO,ONE,TWO,THREE,};
private Value value;


public void Value(Value value) {
this.value = value;
}
public Value getValue() {
return value;
}

public void setValue(Value value) {
this.value = value;
}
}