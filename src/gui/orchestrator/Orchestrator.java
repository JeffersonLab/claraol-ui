package gui.orchestrator;

import gui.action.Action;
import gui.backend.*;

public class Orchestrator implements gui.backend.Orchestrator {

    private     String      name                    = null;
    private     Action      errorAction             = null;
    private     Action      warningAction           = null;
    private     DataSet     processedDataSet        = null;
    private     Application runApplication          = null;

    private     boolean     runsApplication         = false;
    private     boolean     doesProcessedDataSet    = false;

    private     boolean     hasError                = false;
    private     boolean     hasInfo                 = false;
    private     boolean     hasWarning              = false;


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
    public Action getActsOnError() {
        return this.errorAction;
    }

    @Override
    public boolean hasActsOnError() {
        return this.errorAction != null;
    }

    @Override
    public void setActsOnError(Action newActsOnError) {
        this.errorAction = newActsOnError;
    }

    @Override
    public Action getActsOnWarning() {
        return this.warningAction;
    }

    @Override
    public boolean hasActsOnWarning() {
        return this.warningAction != null;
    }

    @Override
    public void setActsOnWarning(Action newActsOnWarning) {
        this.warningAction = newActsOnWarning;
    }

    @Override
    public DataSet getProcessedDataSet() {
        return this.processedDataSet;
    }

    @Override
    public boolean doesProcessDataSet() {
        return this.doesProcessedDataSet;
    }

    @Override
    public void setDataSetToProcess(DataSet newProcesses) {
        this.processedDataSet = newProcesses;
    }

    @Override
    public Application getRunApplication() {
        return this.runApplication;
    }

    @Override
    public boolean runsApplication() {
        return this.runsApplication;
    }

    @Override
    public void setApplicationToRun(Application newRuns) {
        this.runApplication = newRuns;
    }

    @Override
    public boolean monitorsError() {
        return this.hasError;
    }

    @Override
    public void setMonitorsError(Boolean newMonitorsError) {
        this.hasError = newMonitorsError;
    }

    @Override
    public boolean monitorsInfo() {
        return this.hasInfo;
    }

    @Override
    public void setMonitorsInfo(Boolean newMonitorsInfo) {
        this.hasInfo = newMonitorsInfo;
    }

    @Override
    public boolean monitorsWarning() {
        return this.hasWarning;
    }

    @Override
    public void setMonitorsWarning(Boolean newMonitorsWarning) {
        this.hasWarning = newMonitorsWarning;
    }

    @Override
    public void delete() {

    }
}
