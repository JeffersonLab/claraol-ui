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

import gui.service.myService;

import java.util.Collection;

/**
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 *
 */

public interface Action {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#name
     */

    /**
     * Gets property value for the name property.<p>
     *
     * @return a value for the name property.
     */
    String getName();

    /**
     * Checks if the class has a name property value.<p>
     *
     * @return true if there is a name property value.
     */
    boolean hasName();

    /**
     * Adds a name property value.<p>
     *
     * @param newName the name property value to be added
     */
    void setName(String newName);

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#sendsData
     */
     
    /**
     * Gets all property values for the sendsData property.<p>
     * 
     * @return a collection of values for the sendsData property.
     */
    Collection<? extends DataSource> getSendsData();

    /**
     * Checks if the class has a sendsData property value.<p>
     * 
     * @return true if there is a sendsData property value.
     */
    boolean hasSendsData();

    /**
     * Adds a sendsData property value.<p>
     * 
     * @param newSendsData the sendsData property value to be added
     */
    void addSendsData(DataSource newSendsData);

    /**
     * Removes a sendsData property value.<p>
     * 
     * @param oldSendsData the sendsData property value to be removed.
     */
    void removeSendsData(DataSource oldSendsData);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#sendsTo
     */
     
    /**
     * Gets all property values for the sendsTo property.<p>
     * 
     * @return a collection of values for the sendsTo property.
     */
    Collection<? extends myService> getSendsTo();

    /**
     * Checks if the class has a sendsTo property value.<p>
     * 
     * @return true if there is a sendsTo property value.
     */
    boolean hasSendsTo();

    /**
     * Adds a sendsTo property value.<p>
     * 
     * @param newSendsTo the sendsTo property value to be added
     */
    void addSendsTo(myService newSendsTo);

    /**
     * Removes a sendsTo property value.<p>
     * 
     * @param oldSendsTo the sendsTo property value to be removed.
     */
    void removeSendsTo(myService oldSendsTo);


    void delete();

}
