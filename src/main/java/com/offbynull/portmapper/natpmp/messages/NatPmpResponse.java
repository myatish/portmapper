/*
 * Copyright (c) 2013-2015, Kasra Faghihi, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.offbynull.portmapper.natpmp.messages;

/**
 * Represents a NAT-PMP response.
 * @author Kasra Faghihi
 */
public interface NatPmpResponse extends NatPmpMessage {
    /**
     * Get the result code for the request this message is a response to.
     * @return result code
     */
    int getResultCode();
    
    /**
     * Get the number of seconds since the device's port mapping table was initialized on startup, or reset for any other reason.
     * @return number of seconds the device's port mapping table has been up (up to {@code 0xFFFFFFFF))
     */
    long getSecondsSinceStartOfEpoch();
}