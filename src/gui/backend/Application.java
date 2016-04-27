/*
 *   Copyright (c) 2016.  Jefferson Lab (JLab). All rights reserved. Permission
 *   to use, copy, modify, and distribute  this software and its documentation for
 *   educational, research, and not-for-profit purposes, without fee and without a
 *   signed licensing agreement.
 *
 *   IN NO EVENT SHALL JLAB BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL
 *   INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS, ARISING
 *   OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF JLAB HAS
 *   BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   JLAB SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE. THE CLARA SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 *   PROVIDED HEREUNDER IS PROVIDED "AS IS". JLAB HAS NO OBLIGATION TO PROVIDE
 *   MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 *   This software was developed under the United States Government license.
 *   For more information contact author at gurjyan@jlab.org
 *   Department of Experimental Nuclear Physics, Jefferson Lab.
 */

package gui.backend;


import gui.action.myAction;
import gui.service.myService;

import java.util.Collection;

/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Application {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEventSink
     */
     
    /**
     * Gets property value for the hasEventSink property.<p>
     * 
     * @return a value for the hasEventSink property.
     */
    myService getEventSink();

    /**
     * Checks if the class has a hasEventSink property value.<p>
     * 
     * @return true if there is a hasEventSink property value.
     */
    boolean hasEventSink();

    /**
     * Adds a hasEventSink property value.<p>
     * 
     * @param newHasEventSink the hasEventSink property value to be added
     */
    void setEventSink(myService newHasEventSink);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEventSource
     */
     
    /**
     * Gets all property values for the hasEventSource property.<p>
     * 
     * @return a value for the hasEventSource property.
     */
    myService getEventSource();

    /**
     * Checks if the class has a hasEventSource property value.<p>
     * 
     * @return true if there is a hasEventSource property value.
     */
    boolean hasEventSource();

    /**
     * Adds a hasEventSource property value.<p>
     * 
     * @param newHasEventSource the hasEventSource property value to be added
     */
    void setEventSource(myService newHasEventSource);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets all property values for the hasIdentity property.<p>
     * 
     * @return a value for the hasIdentity property.
     */
    Identity getIdentity();

    /**
     * Checks if the class has a hasIdentity property value.<p>
     * 
     * @return true if there is a hasIdentity property value.
     */
    boolean hasIdentity();

    /**
     * Adds a hasIdentity property value.<p>
     * 
     * @param newHasIdentity the hasIdentity property value to be added
     */
    void setIdentity(Identity newHasIdentity);

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasService
     */
     
    /**
     * Gets all property values for the hasService property.<p>
     * 
     * @return a value for the hasService property.
     */
    Collection<? extends myService> getServices();

    /**
     * Checks if the class has a hasService property value.<p>
     * 
     * @return true if there is a hasService property value.
     */
    boolean hasService();

    /**
     * Adds a hasService property value.<p>
     * 
     * @param newHasService the hasService property value to be added
     */
    void addService(myService newHasService);

    /**
     * Removes a hasService property value.<p>
     * 
     * @param oldHasService the hasService property value to be removed.
     */
    void removeService(myService oldHasService);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasSkipAction
     */
     
    /**
     * Gets all property values for the hasSkipAction property.<p>
     * 
     * @return a value for the hasSkipAction property.
     */
    myAction getSkipAction();

    /**
     * Checks if the class has a hasSkipAction property value.<p>
     * 
     * @return true if there is a hasSkipAction property value.
     */
    boolean hasSkipAction();

    /**
     * Adds a hasSkipAction property value.<p>
     * 
     * @param newHasSkipAction the hasSkipAction property value to be added
     */
    void setSkipAction(myAction newHasSkipAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasStartAction
     */
     
    /**
     * Gets all property values for the hasStartAction property.<p>
     * 
     * @return a value for the hasStartAction property.
     */
    myAction getStartAction();

    /**
     * Checks if the class has a hasStartAction property value.<p>
     * 
     * @return true if there is a hasStartAction property value.
     */
    boolean hasStartAction();

    /**
     * Adds a hasStartAction property value.<p>
     * 
     * @param newHasStartAction the hasStartAction property value to be added
     */
    void setStartAction(myAction newHasStartAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasStopAction
     */
     
    /**
     * Gets all property values for the hasStopAction property.<p>
     * 
     * @return a value for the hasStopAction property.
     */
    myAction getStopAction();

    /**
     * Checks if the class has a hasStopAction property value.<p>
     * 
     * @return true if there is a hasStopAction property value.
     */
    boolean hasStopAction();

    /**
     * Adds a hasStopAction property value.<p>
     * 
     * @param newHasStopAction the hasStopAction property value to be added
     */
    void setStopAction(myAction newHasStopAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasComposition
     */
     
    /**
     * Gets all property values for the hasComposition property.<p>
     * 
     * @return a value for the hasComposition property.
     */
    String getComposition();

    /**
     * Checks if the class has a hasComposition property value.<p>
     * 
     * @return true if there is a hasComposition property value.
     */
    boolean hasComposition();

    /**
     * Adds a hasComposition property value.<p>
     * 
     * @param newHasComposition the hasComposition property value to be added
     */
    void setComposition(String newHasComposition);


    void delete();

}
