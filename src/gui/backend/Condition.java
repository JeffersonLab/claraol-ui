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


/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Condition  {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#executionState
     */
     
    /**
     * Gets property value for the executionState property.<p>
     * 
     * @return a value for the executionState property.
     */
    State getExecutionState();

    /**
     * Checks if the class has a executionState property value.<p>
     * 
     * @return true if there is a executionState property value.
     */
    boolean hasExecutionState();

    /**
     * Adds a executionState property value.<p>
     * 
     * @param newExecutionState the executionState property value to be added
     */
    void setExecutionState(State newExecutionState);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#ifFalseSend
     */
     
    /**
     * Gets all property values for the ifFalseSend property.<p>
     * 
     * @return a value for the ifFalseSend property.
     */
    Service getIfFalseSend();

    /**
     * Checks if the class has a ifFalseSend property value.<p>
     * 
     * @return true if there is a ifFalseSend property value.
     */
    boolean hasIfFalseSend();

    /**
     * Adds a ifFalseSend property value.<p>
     * 
     * @param newIfFalseSend the ifFalseSend property value to be added
     */
    void setIfFalseSend(Service newIfFalseSend);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#ifTrueSend
     */
     
    /**
     * Gets all property values for the ifTrueSend property.<p>
     * 
     * @return a value for the ifTrueSend property.
     */
    Service getIfTrueSend();

    /**
     * Checks if the class has a ifTrueSend property value.<p>
     * 
     * @return true if there is a ifTrueSend property value.
     */
    boolean hasIfTrueSend();

    /**
     * Adds a ifTrueSend property value.<p>
     * 
     * @param newIfTrueSend the ifTrueSend property value to be added
     */
    void setIfTrueSend(Service newIfTrueSend);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#receivedState
     */
     
    /**
     * Gets all property values for the receivedState property.<p>
     * 
     * @return a value for the receivedState property.
     */
    State getReceivedState();

    /**
     * Checks if the class has a receivedState property value.<p>
     * 
     * @return true if there is a receivedState property value.
     */
    boolean hasReceivedState();

    /**
     * Adds a receivedState property value.<p>
     * 
     * @param newReceivedState the receivedState property value to be added
     */
    void setReceivedState(State newReceivedState);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#logicalRelationship
     */
     
    /**
     * Gets all property values for the logicalRelationship property.<p>
     * 
     * @return a value for the logicalRelationship property.
     */
    String getLogicalRelationship();

    /**
     * Checks if the class has a logicalRelationship property value.<p>
     * 
     * @return true if there is a logicalRelationship property value.
     */
    boolean hasLogicalRelationship();

    /**
     * Adds a logicalRelationship property value.<p>
     * 
     * @param newLogicalRelationship the logicalRelationship property value to be added
     */
    void setLogicalRelationship(String newLogicalRelationship);


    void delete();

}
