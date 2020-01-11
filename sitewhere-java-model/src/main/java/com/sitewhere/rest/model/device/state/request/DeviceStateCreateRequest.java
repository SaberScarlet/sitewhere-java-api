/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.device.state.request;

import java.util.Date;
import java.util.UUID;

import com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest;

/**
 * Model object for information required to create device state.
 */
public class DeviceStateCreateRequest implements IDeviceStateCreateRequest {

    /** Serial version UID */
    private static final long serialVersionUID = 1259694248695000941L;

    /** Device id */
    private UUID deviceId;

    /** Device type id */
    private UUID deviceTypeId;

    /** Device assignment id */
    private UUID deviceAssignmentId;

    /** Customer id */
    private UUID customerId;

    /** Area id */
    private UUID areaId;

    /** Asset id */
    private UUID assetId;

    /** Date of last interaction with assignment */
    private Date lastInteractionDate;

    /** Date presence was determined to be missing */
    private Date presenceMissingDate;

    /*
     * @see
     * com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#getDeviceId(
     * )
     */
    @Override
    public UUID getDeviceId() {
	return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
	this.deviceId = deviceId;
    }

    /*
     * @see com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#
     * getDeviceTypeId()
     */
    @Override
    public UUID getDeviceTypeId() {
	return deviceTypeId;
    }

    public void setDeviceTypeId(UUID deviceTypeId) {
	this.deviceTypeId = deviceTypeId;
    }

    /*
     * @see com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#
     * getDeviceAssignmentId()
     */
    @Override
    public UUID getDeviceAssignmentId() {
	return deviceAssignmentId;
    }

    public void setDeviceAssignmentId(UUID deviceAssignmentId) {
	this.deviceAssignmentId = deviceAssignmentId;
    }

    /*
     * @see com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#
     * getCustomerId()
     */
    @Override
    public UUID getCustomerId() {
	return customerId;
    }

    public void setCustomerId(UUID customerId) {
	this.customerId = customerId;
    }

    /*
     * @see
     * com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#getAreaId()
     */
    @Override
    public UUID getAreaId() {
	return areaId;
    }

    public void setAreaId(UUID areaId) {
	this.areaId = areaId;
    }

    /*
     * @see
     * com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#getAssetId()
     */
    @Override
    public UUID getAssetId() {
	return assetId;
    }

    public void setAssetId(UUID assetId) {
	this.assetId = assetId;
    }

    /*
     * @see com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#
     * getLastInteractionDate()
     */
    @Override
    public Date getLastInteractionDate() {
	return lastInteractionDate;
    }

    public void setLastInteractionDate(Date lastInteractionDate) {
	this.lastInteractionDate = lastInteractionDate;
    }

    /*
     * @see com.sitewhere.spi.device.state.request.IDeviceStateCreateRequest#
     * getPresenceMissingDate()
     */
    @Override
    public Date getPresenceMissingDate() {
	return presenceMissingDate;
    }

    public void setPresenceMissingDate(Date presenceMissingDate) {
	this.presenceMissingDate = presenceMissingDate;
    }
}