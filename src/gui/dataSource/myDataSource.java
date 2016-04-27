package gui.dataSource;


import gui.backend.DataSource;
import gui.backend.Identity;

/**
 * @author dkroell
 * @version 4/27/2016.
 */
public class myDataSource implements DataSource {

    private Identity    identity    = null;
    private String      type        = null;
    private String      value       = null;
    private boolean     file        = false;
    private boolean     isDir       = false;

    @Override
    public Identity getIdentity() {
        return this.identity;
    }

    @Override
    public boolean hasHasIdentity() {
        return this.identity != null;
    }

    @Override
    public void setHasIdentity(Identity newHasIdentity) {
        this.identity = newHasIdentity;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public boolean hasType() {
        return this.type != null;
    }

    @Override
    public void setType(String newHasType) {
        this.type = newHasType;
            }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean hasValue() {
        return this.value != null;
    }

    @Override
    public void setValue(String newHasValue) {
        this.value = newHasValue;
    }

    @Override
    public boolean isDirectory() {
        return this.isDir;
    }

    @Override
    public void setIsDirectory(Boolean newIsDirectory) {
        this.isDir = newIsDirectory;
    }

    @Override
    public boolean isFile() {
        return this.file;
    }

    @Override
    public void setIsFile(Boolean newIsFile) {
        this.file = newIsFile;
    }

    @Override
    public void delete() {

    }
}
