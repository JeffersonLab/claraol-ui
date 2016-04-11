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
 *
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface ServiceConfig {


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
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#broadcastDone
     */
     
    /**
     * Gets property value for the broadcastDone property.<p>
     * 
     * @return a value for the broadcastDone property.
     */
    boolean getBroadcastDone();

    /**
     * Checks if the class has a broadcastDone property value.<p>
     * 
     * @return true if there is a broadcastDone property value.
     */
    boolean hasBroadcastDone();

    /**
     * Adds a broadcastDone property value.<p>
     * 
     * @param newBroadcastDone the broadcastDone property value to be added
     */
    void setBroadcastDone(boolean newBroadcastDone);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#broadcastError
     */
     
    /**
     * Gets property value for the broadcastError property.<p>
     * 
     * @return a value for the broadcastError property.
     */
    boolean getBroadcastError();

    /**
     * Checks if the class has a broadcastError property value.<p>
     * 
     * @return true if there is a broadcastError property value.
     */
    boolean hasBroadcastError();

    /**
     * Adds a broadcastError property value.<p>
     * 
     * @param newBroadcastError the broadcastError property value to be added
     */
    void setBroadcastError(boolean newBroadcastError);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#broadcastWarning
     */
     
    /**
     * Gets property value for the broadcastWarning property.<p>
     * 
     * @return a value for the broadcastWarning property.
     */
    boolean getBroadcastWarning();

    /**
     * Checks if the class has a broadcastWarning property value.<p>
     * 
     * @return true if there is a broadcastWarning property value.
     */
    boolean hasBroadcastWarning();

    /**
     * Adds a broadcastWarning property value.<p>
     * 
     * @param newBroadcastWarning the broadcastWarning property value to be added
     */
    void setBroadcastWarning(boolean newBroadcastWarning);


    void delete();

}
