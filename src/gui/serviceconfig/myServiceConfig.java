package gui.serviceconfig;

import gui.backend.*;

public class myServiceConfig implements ServiceConfig {

    private String      name                    = null;
    private boolean     broadcastDone           = false;
    private boolean     broadcastError          = false;
    private boolean     broadcastWarning        = false;

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
    public boolean getBroadcastDone() {
        return this.broadcastDone;
    }

    @Override
    public boolean hasBroadcastDone() {
        return this.broadcastDone;
    }

    @Override
    public void setBroadcastDone(boolean newBroadcastDone) {
        this.broadcastDone = newBroadcastDone;
    }

    @Override
    public boolean getBroadcastError() {
        return this.broadcastError;
    }

    @Override
    public boolean hasBroadcastError() {
        return this.broadcastError;
    }

    @Override
    public void setBroadcastError(boolean newBroadcastError) {
        this.broadcastError = newBroadcastError;
    }

    @Override
    public boolean getBroadcastWarning() {
        return this.broadcastWarning;
    }

    @Override
    public boolean hasBroadcastWarning() {
        return this.broadcastWarning;
    }

    @Override
    public void setBroadcastWarning(boolean newBroadcastWarning) {
        this.broadcastWarning = newBroadcastWarning;
    }

    @Override
    public void delete() { }
}
