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


import java.util.Collection;

/**
 * 
 * <p>
 * @version generated on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Application {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEventSink
     */
     
    /**
     * Gets all property values for the hasEventSink property.<p>
     * 
     * @return a collection of values for the hasEventSink property.
     */
    Collection<? extends Service> getHasEventSink();

    /**
     * Checks if the class has a hasEventSink property value.<p>
     * 
     * @return true if there is a hasEventSink property value.
     */
    boolean hasHasEventSink();

    /**
     * Adds a hasEventSink property value.<p>
     * 
     * @param newHasEventSink the hasEventSink property value to be added
     */
    void addHasEventSink(Service newHasEventSink);

    /**
     * Removes a hasEventSink property value.<p>
     * 
     * @param oldHasEventSink the hasEventSink property value to be removed.
     */
    void removeHasEventSink(Service oldHasEventSink);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEventSource
     */
     
    /**
     * Gets all property values for the hasEventSource property.<p>
     * 
     * @return a collection of values for the hasEventSource property.
     */
    Collection<? extends Service> getHasEventSource();

    /**
     * Checks if the class has a hasEventSource property value.<p>
     * 
     * @return true if there is a hasEventSource property value.
     */
    boolean hasHasEventSource();

    /**
     * Adds a hasEventSource property value.<p>
     * 
     * @param newHasEventSource the hasEventSource property value to be added
     */
    void addHasEventSource(Service newHasEventSource);

    /**
     * Removes a hasEventSource property value.<p>
     * 
     * @param oldHasEventSource the hasEventSource property value to be removed.
     */
    void removeHasEventSource(Service oldHasEventSource);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets all property values for the hasIdentity property.<p>
     * 
     * @return a collection of values for the hasIdentity property.
     */
    Collection<? extends Identity> getHasIdentity();

    /**
     * Checks if the class has a hasIdentity property value.<p>
     * 
     * @return true if there is a hasIdentity property value.
     */
    boolean hasHasIdentity();

    /**
     * Adds a hasIdentity property value.<p>
     * 
     * @param newHasIdentity the hasIdentity property value to be added
     */
    void addHasIdentity(Identity newHasIdentity);

    /**
     * Removes a hasIdentity property value.<p>
     * 
     * @param oldHasIdentity the hasIdentity property value to be removed.
     */
    void removeHasIdentity(Identity oldHasIdentity);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasService
     */
     
    /**
     * Gets all property values for the hasService property.<p>
     * 
     * @return a collection of values for the hasService property.
     */
    Collection<? extends Service> getHasService();

    /**
     * Checks if the class has a hasService property value.<p>
     * 
     * @return true if there is a hasService property value.
     */
    boolean hasHasService();

    /**
     * Adds a hasService property value.<p>
     * 
     * @param newHasService the hasService property value to be added
     */
    void addHasService(Service newHasService);

    /**
     * Removes a hasService property value.<p>
     * 
     * @param oldHasService the hasService property value to be removed.
     */
    void removeHasService(Service oldHasService);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasSkipAction
     */
     
    /**
     * Gets all property values for the hasSkipAction property.<p>
     * 
     * @return a collection of values for the hasSkipAction property.
     */
    Collection<? extends Action> getHasSkipAction();

    /**
     * Checks if the class has a hasSkipAction property value.<p>
     * 
     * @return true if there is a hasSkipAction property value.
     */
    boolean hasHasSkipAction();

    /**
     * Adds a hasSkipAction property value.<p>
     * 
     * @param newHasSkipAction the hasSkipAction property value to be added
     */
    void addHasSkipAction(Action newHasSkipAction);

    /**
     * Removes a hasSkipAction property value.<p>
     * 
     * @param oldHasSkipAction the hasSkipAction property value to be removed.
     */
    void removeHasSkipAction(Action oldHasSkipAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasStartAction
     */
     
    /**
     * Gets all property values for the hasStartAction property.<p>
     * 
     * @return a collection of values for the hasStartAction property.
     */
    Collection<? extends Action> getHasStartAction();

    /**
     * Checks if the class has a hasStartAction property value.<p>
     * 
     * @return true if there is a hasStartAction property value.
     */
    boolean hasHasStartAction();

    /**
     * Adds a hasStartAction property value.<p>
     * 
     * @param newHasStartAction the hasStartAction property value to be added
     */
    void addHasStartAction(Action newHasStartAction);

    /**
     * Removes a hasStartAction property value.<p>
     * 
     * @param oldHasStartAction the hasStartAction property value to be removed.
     */
    void removeHasStartAction(Action oldHasStartAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasStopAction
     */
     
    /**
     * Gets all property values for the hasStopAction property.<p>
     * 
     * @return a collection of values for the hasStopAction property.
     */
    Collection<? extends Action> getHasStopAction();

    /**
     * Checks if the class has a hasStopAction property value.<p>
     * 
     * @return true if there is a hasStopAction property value.
     */
    boolean hasHasStopAction();

    /**
     * Adds a hasStopAction property value.<p>
     * 
     * @param newHasStopAction the hasStopAction property value to be added
     */
    void addHasStopAction(Action newHasStopAction);

    /**
     * Removes a hasStopAction property value.<p>
     * 
     * @param oldHasStopAction the hasStopAction property value to be removed.
     */
    void removeHasStopAction(Action oldHasStopAction);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasComposition
     */
     
    /**
     * Gets all property values for the hasComposition property.<p>
     * 
     * @return a collection of values for the hasComposition property.
     */
    Collection<? extends String> getHasComposition();

    /**
     * Checks if the class has a hasComposition property value.<p>
     * 
     * @return true if there is a hasComposition property value.
     */
    boolean hasHasComposition();

    /**
     * Adds a hasComposition property value.<p>
     * 
     * @param newHasComposition the hasComposition property value to be added
     */
    void addHasComposition(String newHasComposition);

    /**
     * Removes a hasComposition property value.<p>
     * 
     * @param oldHasComposition the hasComposition property value to be removed.
     */
    void removeHasComposition(String oldHasComposition);

    void delete();

}
