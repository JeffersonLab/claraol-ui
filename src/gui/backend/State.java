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

public interface State {

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
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasSeverity
     */
     
    /**
     * Gets property value for the hasSeverity property.<p>
     * 
     * @return a value for the hasSeverity property.
     */
    String getSeverity();

    /**
     * Checks if the class has a hasSeverity property value.<p>
     * 
     * @return true if there is a hasSeverity property value.
     */
    boolean hasSeverity();

    /**
     * Adds a hasSeverity property value.<p>
     * 
     * @param newHasSeverity the hasSeverity property value to be added
     */
    void setSeverity(String newHasSeverity);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasSeverityID
     */
     
    /**
     * Gets property value for the hasSeverityID property.<p>
     * 
     * @return a value for the hasSeverityID property.
     */
    Integer getSeverityID();

    /**
     * Checks if the class has a hasSeverityID property value.<p>
     * 
     * @return true if there is a hasSeverityID property value.
     */
    boolean hasSeverityID();

    /**
     * Adds a hasSeverityID property value.<p>
     * 
     * @param newHasSeverityID the hasSeverityID property value to be added
     */
    void setSeverityID(Integer newHasSeverityID);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasStateName
     */
     
    /**
     * Gets property value for the hasStateName property.<p>
     * 
     * @return a value for the hasStateName property.
     */
    String getStateName();

    /**
     * Checks if the class has a hasStateName property value.<p>
     * 
     * @return true if there is a hasStateName property value.
     */
    boolean hasStateName();

    /**
     * Adds a hasStateName property value.<p>
     * 
     * @param newHasStateName the hasStateName property value to be added
     */
    void setStateName(String newHasStateName);


    void delete();

}
