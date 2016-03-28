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

public interface EngineConfig {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasInputData
     */
     
    /**
     * Gets all property values for the hasInputData property.<p>
     * 
     * @return a collection of values for the hasInputData property.
     */
    Collection<? extends DataSource> getHasInputData();

    /**
     * Checks if the class has a hasInputData property value.<p>
     * 
     * @return true if there is a hasInputData property value.
     */
    boolean hasHasInputData();

    /**
     * Adds a hasInputData property value.<p>
     * 
     * @param newHasInputData the hasInputData property value to be added
     */
    void addHasInputData(DataSource newHasInputData);

    /**
     * Removes a hasInputData property value.<p>
     * 
     * @param oldHasInputData the hasInputData property value to be removed.
     */
    void removeHasInputData(DataSource oldHasInputData);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasOutputData
     */
     
    /**
     * Gets all property values for the hasOutputData property.<p>
     * 
     * @return a collection of values for the hasOutputData property.
     */
    Collection<? extends DataSource> getHasOutputData();

    /**
     * Checks if the class has a hasOutputData property value.<p>
     * 
     * @return true if there is a hasOutputData property value.
     */
    boolean hasHasOutputData();

    /**
     * Adds a hasOutputData property value.<p>
     * 
     * @param newHasOutputData the hasOutputData property value to be added
     */
    void addHasOutputData(DataSource newHasOutputData);

    /**
     * Removes a hasOutputData property value.<p>
     * 
     * @param oldHasOutputData the hasOutputData property value to be removed.
     */
    void removeHasOutputData(DataSource oldHasOutputData);


    void delete();

}
