/********************************************************************************
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.jifa.worker.vo.heapdump.thread;

import lombok.Data;

@Data
public class StackFrame {

    private String stack;

    private boolean hasLocal;

    private boolean firstNonNativeFrame;

    public StackFrame(String stack, boolean hasLocal) {
        this.stack = stack;
        this.hasLocal = hasLocal;
    }
}
