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

public interface Identity {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#author
     */
     
    /**
     * Gets all property values for the author property.<p>
     * 
     * @return a collection of values for the author property.
     */
    Collection<? extends String> getAuthor();

    /**
     * Checks if the class has a author property value.<p>
     * 
     * @return true if there is a author property value.
     */
    boolean hasAuthor();

    /**
     * Adds a author property value.<p>
     * 
     * @param newAuthor the author property value to be added
     */
    void addAuthor(String newAuthor);

    /**
     * Removes a author property value.<p>
     * 
     * @param oldAuthor the author property value to be removed.
     */
    void removeAuthor(String oldAuthor);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#description
     */
     
    /**
     * Gets all property values for the description property.<p>
     * 
     * @return a collection of values for the description property.
     */
    Collection<? extends String> getDescription();

    /**
     * Checks if the class has a description property value.<p>
     * 
     * @return true if there is a description property value.
     */
    boolean hasDescription();

    /**
     * Adds a description property value.<p>
     * 
     * @param newDescription the description property value to be added
     */
    void addDescription(String newDescription);

    /**
     * Removes a description property value.<p>
     * 
     * @param oldDescription the description property value to be removed.
     */
    void removeDescription(String oldDescription);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#name
     */
     
    /**
     * Gets all property values for the name property.<p>
     * 
     * @return a collection of values for the name property.
     */
    Collection<? extends String> getName();

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
    void addName(String newName);

    /**
     * Removes a name property value.<p>
     * 
     * @param oldName the name property value to be removed.
     */
    void removeName(String oldName);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#version
     */
     
    /**
     * Gets all property values for the version property.<p>
     * 
     * @return a collection of values for the version property.
     */
    Collection<? extends String> getVersion();

    /**
     * Checks if the class has a version property value.<p>
     * 
     * @return true if there is a version property value.
     */
    boolean hasVersion();

    /**
     * Adds a version property value.<p>
     * 
     * @param newVersion the version property value to be added
     */
    void addVersion(String newVersion);

    /**
     * Removes a version property value.<p>
     * 
     * @param oldVersion the version property value to be removed.
     */
    void removeVersion(String oldVersion);

    void delete();

}
