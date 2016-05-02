package gui.identity;

import gui.backend.*;

/**
 * @author dkroell
 * @version 4/27/2016.
 */

public class myIdentity implements Identity {

    private String      author           = null;
    private String      Description      = null;
    private String      name             = null;
    private String      version          = null;

    public myIdentity(String name,      String author,
                      String version,   String Description) {

        this.author = author;
        this.name = name;
        this.version = version;
        this.Description = Description;

    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean hasAuthor() {
        return this.author != null;
    }

    @Override
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public String getDescription() {
        return this.Description;
    }

    @Override
    public boolean hasDescription() {
        return this.Description != null;
    }

    @Override
    public void setDescription(String newDescription) {
        this.Description = newDescription;
    }

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
    public String getVersion() {
        return this.version;
    }

    @Override
    public boolean hasVersion() {
        return this.version != null;
    }

    @Override
    public void setVersion(String newVersion) {
        this.version = newVersion;
    }

    @Override
    public void delete() {

    }
}
