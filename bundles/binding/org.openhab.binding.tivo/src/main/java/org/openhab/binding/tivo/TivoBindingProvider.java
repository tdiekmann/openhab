/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tivo;

import org.openhab.core.binding.BindingProvider;

/**
 * @author Jonathan Giles (http://www.jonathangiles.net)
 * @since 1.4.0
 */
public interface TivoBindingProvider extends BindingProvider {

    public String getTivoCommand(String itemName);

}
