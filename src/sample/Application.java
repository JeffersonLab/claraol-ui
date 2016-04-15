package sample;


import gui.backend.Action;
import gui.backend.Identity;
import gui.backend.Service;

import java.util.ArrayList;
import java.util.Collection;

public class Application implements gui.backend.Application {

    private Service selectedService = null;
    private Service eventSink       = null;
    private Service eventSource     = null;

    private Identity id             = null;

    private Action skip             = null;
    private Action start            = null;
    private Action stop             = null;


    private String comp             = null;

    @Override
    public Service getEventSink() {
        return this.eventSink;
    }

    @Override
    public boolean hasEventSink() {
        return eventSource != null;
    }

    @Override
    public void setEventSink(Service newHasEventSink) {
        this.eventSink = newHasEventSink;
    }

    @Override
    public Service getEventSource() {
        return this.eventSource;
    }

    @Override
    public boolean hasEventSource() {
        return this.eventSource != null;
    }

    @Override
    public void setEventSource(Service newHasEventSource) {
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
    public Collection<? extends Service> getServices() {


        /*

          So what I've don here is instantiate cfollection with an ArrayList
          that holds smaple services. In this case I'm using eventSource, and
          eventSink to do this.

         */

        Collection<Service> dropDown = new ArrayList<Service>();
        dropDown.add(eventSource);
        dropDown.add(eventSink);



        return dropDown;
    }

    @Override
    public boolean hasService() {
        return this.selectedService != null;
    }

    @Override
    public void addService(Service newHasService) {
        this.selectedService = newHasService;
    }

    @Override
    public void removeService(Service oldHasService) {
        this.selectedService.delete();
    }

    @Override
    public Action getSkipAction() {
        return this.skip;
    }

    @Override
    public boolean hasSkipAction() {
        return this.skip != null;
    }

    @Override
    public void setSkipAction(Action newHasSkipAction) {
        this.skip = newHasSkipAction;
    }

    @Override
    public Action getStartAction() {
        return this.start;
    }

    @Override
    public boolean hasStartAction() {
        return this.start != null;
    }

    @Override
    public void setStartAction(Action newHasStartAction) {
        this.start = newHasStartAction;
    }

    @Override
    public Action getStopAction() {
        return this.stop;
    }

    @Override
    public boolean hasStopAction() {
        return this.stop != null;
    }

    @Override
    public void setStopAction(Action newHasStopAction) {
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
