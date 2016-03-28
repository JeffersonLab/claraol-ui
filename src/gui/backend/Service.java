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

public interface Service {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasCondition
     */
     
    /**
     * Gets all property values for the hasCondition property.<p>
     * 
     * @return a collection of values for the hasCondition property.
     */
    Collection<? extends Condition> getHasCondition();

    /**
     * Checks if the class has a hasCondition property value.<p>
     * 
     * @return true if there is a hasCondition property value.
     */
    boolean hasHasCondition();

    /**
     * Adds a hasCondition property value.<p>
     * 
     * @param newHasCondition the hasCondition property value to be added
     */
    void addHasCondition(Condition newHasCondition);

    /**
     * Removes a hasCondition property value.<p>
     * 
     * @param oldHasCondition the hasCondition property value to be removed.
     */
    void removeHasCondition(Condition oldHasCondition);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasConfig
     */
     
    /**
     * Gets all property values for the hasConfig property.<p>
     * 
     * @return a collection of values for the hasConfig property.
     */
    Collection<? extends ServiceConfig> getHasConfig();

    /**
     * Checks if the class has a hasConfig property value.<p>
     * 
     * @return true if there is a hasConfig property value.
     */
    boolean hasHasConfig();

    /**
     * Adds a hasConfig property value.<p>
     * 
     * @param newHasConfig the hasConfig property value to be added
     */
    void addHasConfig(ServiceConfig newHasConfig);

    /**
     * Removes a hasConfig property value.<p>
     * 
     * @param oldHasConfig the hasConfig property value to be removed.
     */
    void removeHasConfig(ServiceConfig oldHasConfig);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasEngine
     */
     
    /**
     * Gets all property values for the hasEngine property.<p>
     * 
     * @return a collection of values for the hasEngine property.
     */
    Collection<? extends Engine> getHasEngine();

    /**
     * Checks if the class has a hasEngine property value.<p>
     * 
     * @return true if there is a hasEngine property value.
     */
    boolean hasHasEngine();

    /**
     * Adds a hasEngine property value.<p>
     * 
     * @param newHasEngine the hasEngine property value to be added
     */
    void addHasEngine(Engine newHasEngine);

    /**
     * Removes a hasEngine property value.<p>
     * 
     * @param oldHasEngine the hasEngine property value to be removed.
     */
    void removeHasEngine(Engine oldHasEngine);


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
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLink
     */
     
    /**
     * Gets all property values for the hasLink property.<p>
     * 
     * @return a collection of values for the hasLink property.
     */
    Collection<? extends Service> getHasLink();

    /**
     * Checks if the class has a hasLink property value.<p>
     * 
     * @return true if there is a hasLink property value.
     */
    boolean hasHasLink();

    /**
     * Adds a hasLink property value.<p>
     * 
     * @param newHasLink the hasLink property value to be added
     */
    void addHasLink(Service newHasLink);

    /**
     * Removes a hasLink property value.<p>
     * 
     * @param oldHasLink the hasLink property value to be removed.
     */
    void removeHasLink(Service oldHasLink);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasState
     */
     
    /**
     * Gets all property values for the hasState property.<p>
     * 
     * @return a collection of values for the hasState property.
     */
    Collection<? extends State> getHasState();

    /**
     * Checks if the class has a hasState property value.<p>
     * 
     * @return true if there is a hasState property value.
     */
    boolean hasHasState();

    /**
     * Adds a hasState property value.<p>
     * 
     * @param newHasState the hasState property value to be added
     */
    void addHasState(State newHasState);

    /**
     * Removes a hasState property value.<p>
     * 
     * @param oldHasState the hasState property value to be removed.
     */
    void removeHasState(State oldHasState);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasContainer
     */
     
    /**
     * Gets all property values for the hasContainer property.<p>
     * 
     * @return a collection of values for the hasContainer property.
     */
    Collection<? extends String> getHasContainer();

    /**
     * Checks if the class has a hasContainer property value.<p>
     * 
     * @return true if there is a hasContainer property value.
     */
    boolean hasHasContainer();

    /**
     * Adds a hasContainer property value.<p>
     * 
     * @param newHasContainer the hasContainer property value to be added
     */
    void addHasContainer(String newHasContainer);

    /**
     * Removes a hasContainer property value.<p>
     * 
     * @param oldHasContainer the hasContainer property value to be removed.
     */
    void removeHasContainer(String oldHasContainer);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasDpe
     */
     
    /**
     * Gets all property values for the hasDpe property.<p>
     * 
     * @return a collection of values for the hasDpe property.
     */
    Collection<? extends String> getHasDpe();

    /**
     * Checks if the class has a hasDpe property value.<p>
     * 
     * @return true if there is a hasDpe property value.
     */
    boolean hasHasDpe();

    /**
     * Adds a hasDpe property value.<p>
     * 
     * @param newHasDpe the hasDpe property value to be added
     */
    void addHasDpe(String newHasDpe);

    /**
     * Removes a hasDpe property value.<p>
     * 
     * @param oldHasDpe the hasDpe property value to be removed.
     */
    void removeHasDpe(String oldHasDpe);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasPoolSize
     */
     
    /**
     * Gets all property values for the hasPoolSize property.<p>
     * 
     * @return a collection of values for the hasPoolSize property.
     */
    Collection<? extends Integer> getHasPoolSize();

    /**
     * Checks if the class has a hasPoolSize property value.<p>
     * 
     * @return true if there is a hasPoolSize property value.
     */
    boolean hasHasPoolSize();

    /**
     * Adds a hasPoolSize property value.<p>
     * 
     * @param newHasPoolSize the hasPoolSize property value to be added
     */
    void addHasPoolSize(Integer newHasPoolSize);

    /**
     * Removes a hasPoolSize property value.<p>
     * 
     * @param oldHasPoolSize the hasPoolSize property value to be removed.
     */
    void removeHasPoolSize(Integer oldHasPoolSize);

    void delete();

}
