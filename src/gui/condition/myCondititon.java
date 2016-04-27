package gui.condition;

import gui.backend.Condition;
import gui.backend.Service;
import gui.backend.State;

/**
 * @author dkroell
 * @version 4/27/2016.
 */
public class myCondititon implements Condition {

    private String      name                    = null;
    private State       executionState          = null;
    private Service     ifFalseSend             = null;
    private Service     ifTrueSane              = null;
    private State       receivedSate = null;
    private String      logicalRelationship     = null;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean hasName() {
        return this.name != null;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public State getExecutionState() {
        return this.executionState;
    }

    @Override
    public boolean hasExecutionState() {
        return this.executionState != null;
    }

    @Override
    public void setExecutionState(State newExecutionState) {
        this.executionState = newExecutionState;
    }

    @Override
    public Service getIfFalseSend() {
        return this.ifFalseSend;
    }

    @Override
    public boolean hasIfFalseSend() {
        return this.ifFalseSend != null;
    }

    @Override
    public void setIfFalseSend(Service newIfFalseSend) {
        this.ifFalseSend = newIfFalseSend;
    }

    @Override
    public Service getIfTrueSend() {
        return this.ifTrueSane;
    }

    @Override
    public boolean hasIfTrueSend() {
        return this.ifFalseSend != null;
    }

    @Override
    public void setIfTrueSend(Service newIfTrueSend) {
        this.ifTrueSane = newIfTrueSend;
    }

    @Override
    public State getReceivedState() {
        return this.receivedSate;
    }

    @Override
    public boolean hasReceivedState() {
        return this.receivedSate != null;
    }

    @Override
    public void setReceivedState(State newReceivedState) {
        this.receivedSate = newReceivedState;
    }

    @Override
    public String getLogicalRelationship() {
        return this.logicalRelationship;
    }

    @Override
    public boolean hasLogicalRelationship() {
        return this.logicalRelationship != null;
    }

    @Override
    public void setLogicalRelationship(String newLogicalRelationship) {
        this.logicalRelationship = newLogicalRelationship;
    }

    @Override
    public void delete() {

    }
}
