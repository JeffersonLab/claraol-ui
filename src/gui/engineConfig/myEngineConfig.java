package gui.engineConfig;

import gui.backend.*;

/**
 * @author dkroell
 * @version 4/27/2016.
 */

public class myEngineConfig implements EngineConfig {

    private String      name        = null;
    private DataSource  inputData   = null;
    private DataSource  outputData  = null;

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
    public DataSource getInputData() {
        return this.inputData;
    }

    @Override
    public boolean hasInputData() {
        return this.inputData != null;
    }

    @Override
    public void setInputData(DataSource newHasInputData) {
        this.inputData = newHasInputData;
    }

    @Override
    public DataSource getOutputData() {
        return this.outputData;
    }

    @Override
    public boolean hasOutputData() {
        return this.outputData != null;
    }

    @Override
    public void setOutputData(DataSource newHasOutputData) {
        this.outputData = newHasOutputData;
    }

    @Override
    public void delete() {

    }
}
