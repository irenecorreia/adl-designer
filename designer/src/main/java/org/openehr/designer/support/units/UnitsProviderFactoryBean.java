/*
 * ADL2-tools
 * Copyright (c) 2013-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of ADL2-tools.
 *
 * ADL2-tools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.openehr.designer.support.units;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author markopi
 */
public class UnitsProviderFactoryBean implements FactoryBean<UnitsProvider> {
    @Override
    public UnitsProvider getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return UnitsProvider.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
