/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.mina.core.write;

import java.util.Collection;

/**
 * An exception which is thrown when one or more write requests resulted
 * in no actual write operation.
 * 
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public class NothingWrittenException extends WriteException {

    private static final long serialVersionUID = -6331979307737691005L;

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param requests The {@link WriteRequest}s that haven't been written
     * @param message The error message
     * @param cause The original exception
     */
    public NothingWrittenException(Collection<WriteRequest> requests, String message, Throwable cause) {
        super(requests, message, cause);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param requests The {@link WriteRequest}s that haven't been written
     * @param message The error message
     */
    public NothingWrittenException(Collection<WriteRequest> requests, String message) {
        super(requests, message);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param requests The {@link WriteRequest} that haven't been written
     * @param cause The original exception
     */
    public NothingWrittenException(Collection<WriteRequest> requests, Throwable cause) {
        super(requests, cause);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param requests The {@link WriteRequest} that haven't been written
     */
    public NothingWrittenException(Collection<WriteRequest> requests) {
        super(requests);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param request The {@link WriteRequest} that hasn't been written
     * @param message The error message
     * @param cause The original exception
     */
    public NothingWrittenException(WriteRequest request, String message, Throwable cause) {
        super(request, message, cause);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param request The {@link WriteRequest} that hasn't been written
     * @param message The error message
     */
    public NothingWrittenException(WriteRequest request, String message) {
        super(request, message);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param request The {@link WriteRequest} that hasn't been written
     * @param cause The original exception
     */
    public NothingWrittenException(WriteRequest request, Throwable cause) {
        super(request, cause);
    }

    /**
     * Create a new NothingWrittenException instance
     * 
     * @param request The {@link WriteRequest} that hasn't been written
     */
    public NothingWrittenException(WriteRequest request) {
        super(request);
    }
}