package gui.dataSet;

import gui.backend.DataSet;
import gui.backend.DataSource;

/**
 * @author dkroell
 * @version 4/27/2016.
 */
public class myDataSet implements DataSet {

    private String          name            = null;
    private DataSource      outputSource    = null;
    private DataSource      inputSource     = null;
    private String          filePrefix      = null;
    private String          fileSuffix      = null;

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
    public DataSource getInputSource() {
        return this.inputSource;
    }

    @Override
    public boolean hasInputSource() {
        return this.inputSource != null;
    }

    @Override
    public void setInputSource(DataSource newHasInputSource) {
        this.inputSource = newHasInputSource;
    }

    @Override
    public DataSource getOutputSource() {
        return this.outputSource;
    }

    @Override
    public boolean hasOutputSource() {
        return this.outputSource != null;
    }

    @Override
    public void setOutputSource(DataSource newHasOutputSource) {
        this.outputSource = newHasOutputSource;
    }

    @Override
    public String getOutputFilePrefix() {
        return this.filePrefix;
    }

    @Override
    public boolean hasOutputFilePrefix() {
        return this.filePrefix != null;
    }

    @Override
    public void setOutputFilePrefix(String newOutputFilePrefix) {
        this.filePrefix = newOutputFilePrefix;
    }

    @Override
    public String getOutputFileSuffix() {
        return this.fileSuffix;
    }

    @Override
    public boolean hasOutputFileSuffix() {
        return this.fileSuffix != null;
    }

    @Override
    public void setOutputFileSuffix(String newOutputFileSuffix) {
        this.fileSuffix = newOutputFileSuffix;
    }

    @Override
    public void delete() {

    }
}
