package sample;


import gui.action.myAction;
import gui.backend.Application;
import gui.service.myService;
import gui.identity.myIdentity;
import java.util.ArrayList;
import java.util.Collection;


public class myApplication implements gui.backend.Application {

    private myService selectedService;
    private myService eventSink;
    private myService eventSource;

    private myIdentity id;

    private myAction skip;
    private myAction start;
    private myAction stop;

    private ArrayList<myService> dropDown = null;
    private String comp             = null;

    public myApplication() {
        this.selectedService = null;
        this.eventSink = null;
        this.eventSource = null;

        this.id = null;

        this.start = null;
        this.skip = null;
        this.stop = null;

        this.dropDown = new ArrayList<myService>();
        myService new_service = new myService(  "New Service", "System",
                                                "0.0",
                                                "Place Holder to" +
                                                " select a new Service");
        dropDown.add(new_service);
    }

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
    public myIdentity getIdentity() {
        return this.id;
    }

    @Override
    public boolean hasIdentity() {
        return this.id != null;
    }

    @Override
    public void setIdentity(myIdentity newHasIdentity) {
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
