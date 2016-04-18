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
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Service {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasCondition
     */
     
    /**
     * Gets all property values for the hasCondition property.<p>
     * 
     * @return a collection of values for the hasCondition property.
     */
    Collection<? extends Condition> getConditions();

    /**
     * Checks if the class has a hasCondition property value.<p>
     * 
     * @return true if there is a hasCondition property value.
     */
    boolean hasCondition();

    /**
     * Adds a hasCondition property value.<p>
     * 
     * @param newHasCondition the hasCondition property value to be added
     */
    void addCondition(Condition newHasCondition);

    /**
     * Removes a hasCondition property value.<p>
     * 
     * @param oldHasCondition the hasCondition property value to be removed.
     */
    void removeCondition(Condition oldHasCondition);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasConfig
     */
     
    /**
     * Gets value for the hasConfig property.<p>
     * 
     * @return a value for the hasConfig property.
     */
    ServiceConfig getConfig();

    /**
     * Checks if the class has a hasConfig property value.<p>
     * 
     * @return true if there is a hasConfig property value.
     */
    boolean hasConfig();

    /**
     * Adds a hasConfig property value.<p>
     * 
     * @param newHasConfig the hasConfig property value to be added
     */
    void setConfig(ServiceConfig newHasConfig);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEngine
     */
     
    /**
     * Gets value for the hasEngine property.<p>
     * 
     * @return a value for the hasEngine property.
     */
    Engine getEngine();

    /**
     * Checks if the class has a hasEngine property value.<p>
     * 
     * @return true if there is a hasEngine property value.
     */
    boolean hasEngine();

    /**
     * Adds a hasEngine property value.<p>
     * 
     * @param newHasEngine the hasEngine property value to be added
     */
    void setEngine(Engine newHasEngine);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets value for the hasIdentity property.<p>
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
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLink
     */
     
    /**
     * Gets all property values for the hasLink property.<p>
     * 
     * @return a collection of values for the hasLink property.
     */
    Collection<? extends Service> getLinks();

    /**
     * Checks if the class has a hasLink property value.<p>
     * 
     * @return true if there is a hasLink property value.
     */
    boolean hasLink();

    /**
     * Adds a hasLink property value.<p>
     * 
     * @param newHasLink the hasLink property value to be added
     */
    void addLink(gui.service.Service newHasLink);

    /**
     * Removes a hasLink property value.<p>
     * 
     * @param oldHasLink the hasLink property value to be removed.
     */
    void removeLink(gui.service.Service oldHasLink);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasState
     */
     
    /**
     * Gets all property values for the hasState property.<p>
     * 
     * @return a collection of values for the hasState property.
     */
    Collection<? extends State> getStates();

    /**
     * Checks if the class has a hasState property value.<p>
     * 
     * @return true if there is a hasState property value.
     */
    boolean hasState();

    /**
     * Adds a hasState property value.<p>
     * 
     * @param newHasState the hasState property value to be added
     */
    void addState(State newHasState);

    /**
     * Removes a hasState property value.<p>
     * 
     * @param oldHasState the hasState property value to be removed.
     */
    void removeState(State oldHasState);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasContainer
     */
     
    /**
     * Gets value for the hasContainer property.<p>
     * 
     * @return a value for the hasContainer property.
     */
    String getContainer();

    /**
     * Checks if the class has a hasContainer property value.<p>
     * 
     * @return true if there is a hasContainer property value.
     */
    boolean hasContainer();

    /**
     * Adds a hasContainer property value.<p>
     * 
     * @param newHasContainer the hasContainer property value to be added
     */
    void setContainer(String newHasContainer);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasDpe
     */
     
    /**
     * Gets value for the hasDpe property.<p>
     * 
     * @return a value for the hasDpe property.
     */
    String getDpe();

    /**
     * Checks if the class has a hasDpe property value.<p>
     * 
     * @return true if there is a hasDpe property value.
     */
    boolean hasDpe();

    /**
     * Adds a hasDpe property value.<p>
     * 
     * @param newHasDpe the hasDpe property value to be added
     */
    void setDpe(String newHasDpe);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasPoolSize
     */
     
    /**
     * Gets property value for the hasPoolSize property.<p>
     * 
     * @return a value for the hasPoolSize property.
     */
    Integer getPoolSize();

    /**
     * Checks if the class has a hasPoolSize property value.<p>
     * 
     * @return true if there is a hasPoolSize property value.
     */
    boolean hasPoolSize();

    /**
     * Adds a hasPoolSize property value.<p>
     * 
     * @param newHasPoolSize the hasPoolSize property value to be added
     */
    void setPoolSize(Integer newHasPoolSize);

    void delete();

}
