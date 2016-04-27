package sample;


import gui.action.myAction;
import gui.backend.*;
import gui.service.myService;
import java.util.ArrayList;
import java.util.Collection;


public class myApplication implements gui.backend.Application {

    private myService selectedService = null;
    private myService eventSink       = null;
    private myService eventSource     = null;

    private Identity id             = null;

    private myAction skip             = null;
    private myAction start            = null;
    private myAction stop             = null;


    private ArrayList<myService> dropDown = null;

    private String comp             = null;

    @Override
    public myService getEventSink() {
        return this.eventSink;
    }

    @Override
    public boolean hasEventSink() {
        return eventSource != null;
    }

    @Override
    public void setEventSink(myService newHasEventSink) {
        this.eventSink = newHasEventSink;
    }

    @Override
    public myService getEventSource() {
        return this.eventSource;
    }

    @Override
    public boolean hasEventSource() {
        return this.eventSource != null;
    }

    @Override
    public void setEventSource(myService newHasEventSource) {
        this.eventSource = newHasEventSource;
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
    public Collection<? extends myService> getServices() {
        return this.dropDown;
    }

    @Override
    public boolean hasService() {
        return this.selectedService != null;
    }

    @Override
    public void addService(myService newHasService) {
        this.dropDown.add(newHasService);
    }

    @Override
    public void removeService(myService oldHasService) {
        this.dropDown.remove(oldHasService);
    }

    @Override
    public myAction getSkipAction() {
        return this.skip;
    }

    @Override
    public boolean hasSkipAction() {
        return this.skip != null;
    }

    @Override
    public void setSkipAction(myAction newHasSkipAction) {
        this.skip = newHasSkipAction;
    }

    @Override
    public myAction getStartAction() {
        return this.start;
    }

    @Override
    public boolean hasStartAction() {
        return this.start != null;
    }

    @Override
    public void setStartAction(myAction newHasStartAction) {
        this.start = newHasStartAction;
    }

    @Override
    public myAction getStopAction() {
        return this.stop;
    }

    @Override
    public boolean hasStopAction() {
        return this.stop != null;
    }

    @Override
    public void setStopAction(myAction newHasStopAction) {
        this.stop = newHasStopAction;
    }

    @Override
    public String getComposition() {
        return this.comp;
    }

    @Override
    public void setComposition(String newHasComposition) {
        this.comp = newHasComposition;
    }

    @Override
    public boolean hasComposition() {
        return this.comp != null;
    }

    @Override
    public void delete() {

        /*
            All I'm doing is deleting all of the content in this instantiation.
         */

        this.setComposition(null);
        this.setEventSink(null);
        this.setEventSource(null);
        this.setIdentity(null);
        this.setSkipAction(null);
        this.setStartAction(null);
        this.setStopAction(null);
    }
}
