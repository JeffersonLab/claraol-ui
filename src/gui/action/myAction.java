package gui.action;

import gui.backend.*;
import gui.service.myService;

import java.util.ArrayList;
import java.util.Collection;

public class myAction implements gui.backend.Action {

    private     String                  name            = null;
    private     ArrayList <DataSource>  dataSourceList  = new ArrayList<DataSource>();
    private     ArrayList <myService>     serviceList     = new ArrayList<myService>();

    /*
         When full backend implementation comes around
         You will adda constructor that populates the containers.
     */

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
    public Collection<? extends DataSource> getSendsData() {
        return this.dataSourceList;
    }

    @Override
    public boolean hasSendsData() {
        return !this.dataSourceList.isEmpty();
    }

    @Override
    public void addSendsData(DataSource newSendsData) {
        this.dataSourceList.add(newSendsData);
    }

    @Override
    public void removeSendsData(DataSource oldSendsData) {
        this.dataSourceList.remove(oldSendsData);
    }

    @Override
    public Collection<? extends myService> getSendsTo() {
        return this.serviceList;
    }

    @Override
    public boolean hasSendsTo() {
        return !this.serviceList.isEmpty();
    }

    @Override
    public void addSendsTo(myService newSendsTo) {
        this.serviceList.add(newSendsTo);
    }

    @Override
    public void removeSendsTo(myService oldSendsTo) {
        this.serviceList.remove(oldSendsTo);
    }

    @Override
    public void delete() {
        this.serviceList = null;
        this.dataSourceList = null;
        this.name = null;

    }
}
