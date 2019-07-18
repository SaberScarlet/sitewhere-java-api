/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.device.marshaling;

import java.util.List;

import com.sitewhere.rest.model.area.Area;
import com.sitewhere.rest.model.area.AreaType;
import com.sitewhere.rest.model.area.Zone;
import com.sitewhere.rest.model.device.DeviceAssignment;

/**
 * Extends {@link Area} to support fields that can be included on REST calls.
 */
public class MarshaledArea extends Area {

    /** Serial version UID */
    private static final long serialVersionUID = 129857679204159756L;

    /** Area type */
    private AreaType areaType;

    /** Parent area information */
    private Area parentArea;

    /** List of assignments for area */
    private List<DeviceAssignment> deviceAssignments;

    /** List of zones for site */
    private List<Zone> zones;

    public AreaType getAreaType() {
	return areaType;
    }

    public void setAreaType(AreaType areaType) {
	this.areaType = areaType;
    }

    public Area getParentArea() {
	return parentArea;
    }

    public void setParentArea(Area parentArea) {
	this.parentArea = parentArea;
    }

    public List<DeviceAssignment> getDeviceAssignments() {
	return deviceAssignments;
    }

    public void setDeviceAssignments(List<DeviceAssignment> deviceAssignments) {
	this.deviceAssignments = deviceAssignments;
    }

    public List<Zone> getZones() {
	return zones;
    }

    public void setZones(List<Zone> zones) {
	this.zones = zones;
    }
}