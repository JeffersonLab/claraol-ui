package gui.service;

import gui.backend.*;
import gui.identity.myIdentity;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class myService implements Service {


    private     ServiceConfig           currentConfig           = null;
    private     Engine                  currentEngine           = null;
    private     Identity                id                      = null;

    private     List<Condition>         conditionsList          = new ArrayList<>();
    private     List<Service>           linksList               = new ArrayList<>();
    private     List<State>             stateList               = new ArrayList<>();

    private     String                  container               = null;
    private     String                  dpe                     = null;
    private     Integer                 pool                    = null;


    /*
           When Full implementation comes around, you will add
           a constructor that will populate the ArrayLists.
     */

    public myService(String name, String author, String version, String Description) {
        id = new myIdentity(name, author, version, Description);
        this.setIdentity(id);
    }

    @Override
    public Collection<? extends Condition> getConditions() {
        return this.conditionsList;
    }

    @Override
    public boolean hasCondition() {
        return !this.conditionsList.isEmpty();
    }

    @Override
    public void addCondition(Condition newHasCondition) {
        conditionsList.add(newHasCondition);
    }

    @Override
    public void removeCondition(Condition oldHasCondition) {
        conditionsList.remove(oldHasCondition);
        oldHasCondition.delete();
    }

    @Override
    public ServiceConfig getConfig() {
        return this.currentConfig;
    }

    @Override
    public boolean hasConfig() {
        return this.currentConfig != null;
    }

    @Override
    public void setConfig(ServiceConfig newHasConfig) {
        this.currentConfig = newHasConfig;
    }

    @Override
    public Engine getEngine() {
        return this.currentEngine;
    }

    @Override
    public boolean hasEngine() {
        return this.currentEngine != null;
    }

    @Override
    public void setEngine(Engine newHasEngine) {
        this.currentEngine = newHasEngine;
    }

    @Override
    public Identity getIdentity() {
        return this.id;
    }

    @Override
    public boolean hasIdentity() {
        return this.id != null;
    }

    @Override
    public void setIdentity(Identity newHasIdentity) {
        this.id = newHasIdentity;
    }
    

    @Override
    public Collection<? extends Service> getLinks() {
        return linksList;
    }

    @Override
    public boolean hasLink() {
        return !linksList.isEmpty();
    }

    @Override
    public void addLink(Service newHasLink) {
        linksList.add(newHasLink);
    }

    @Override
    public void removeLink(Service oldHasLink) {
        linksList.remove(oldHasLink);

    }

    @Override
    public Collection<? extends State> getStates() {
        return this.stateList;
    }

    @Override
    public boolean hasState() {
        return !this.stateList.isEmpty();
    }

    @Override
    public void addState(State newHasState) {
        stateList.add(newHasState);
    }

    @Override
    public void removeState(State oldHasState) {
        stateList.remove(oldHasState);
        oldHasState.delete();
    }

    @Override
    public String getContainer() {
        return this.container;
    }

    @Override
    public boolean hasContainer() {
        return this.container != null;
    }

    @Override
    public void setContainer(String newHasContainer) {
        this.container = newHasContainer;
    }

    @Override
    public String getDpe() {
        return this.dpe;
    }

    @Override
    public boolean hasDpe() {
        return this.dpe != null;
    }

    @Override
    public void setDpe(String newHasDpe) {
        this.dpe = newHasDpe;
    }

    @Override
    public Integer getPoolSize() {
        return this.pool;
    }

    @Override
    public boolean hasPoolSize() {
        return this.pool != null;
    }

    @Override
    public void setPoolSize(Integer newHasPoolSize) {
        this.pool = newHasPoolSize;
    }

    @Override
    public void delete() {
        this.container = null;
        this.currentConfig = null;
        this.dpe = null;
        this.currentEngine = null;
    }
}
