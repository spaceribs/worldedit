// $Id$
/*
 * WorldEditLibrary
 * Copyright (C) 2010 sk89q <http://www.sk89q.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.filtering;

import java.awt.image.Kernel;

/**
 * A linear Kernel generator (all cells weight the same)
 * 
 * @author Grum
 */

public class LinearKernel extends Kernel {

    public LinearKernel(int radius) {
        super(radius * 2 + 1, radius * 2 + 1, createKernel(radius));
    }

    private static float[] createKernel(int radius) {
        int diameter = radius * 2 + 1;
        float[] data = new float[diameter * diameter];

        for (int i = 0; i < data.length; data[i++] = 1.0f / data.length) ;

        return data;
    }
}