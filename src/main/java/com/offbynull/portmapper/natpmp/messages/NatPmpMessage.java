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
 * Represents a NAT-PMP message.
 * @author Kasra Faghihi
 */
public interface NatPmpMessage {
    /**
     * Dump out the NAT-PMP message in to a byte array. Suitable for generating packets to be sent to NAT-PMP devices/routers.
     * @return NAT-PMP packet
     */
    byte[] dump();
}
