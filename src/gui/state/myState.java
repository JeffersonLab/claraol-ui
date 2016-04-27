package gui.state;

/**
 * @author dkroell
 * @version 4/26/2016.
 */

public class myState implements gui.backend.State{

    private String name = null;
    private String severity = null;
    private Integer severityID = null;
    private String stateName = null;

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
    public String getSeverity() {
        return this.severity;
    }

    @Override
    public boolean hasSeverity() {
        return this.severity != null;
    }

    @Override
    public void setSeverity(String newHasSeverity) {
        this.severity = newHasSeverity;
    }

    @Override
    public Integer getSeverityID() {
        return this.severityID;
    }

    @Override
    public boolean hasSeverityID() {
        return this.severityID != null;
    }

    @Override
    public void setSeverityID(Integer newHasSeverityID) {
        this.severityID = newHasSeverityID;
    }

    @Override
    public String getStateName() {
        return this.stateName;
    }

    @Override
    public boolean hasStateName() {
        return this.stateName != null;
    }

    @Override
    public void setStateName(String newHasStateName) {
        this.stateName = newHasStateName;
    }

    @Override
    public void delete() {

    }
}
