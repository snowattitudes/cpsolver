package net.sf.cpsolver.ifs.util;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Only used for backward compatibility.
 * 
 * Use {@link java.util.HashSet} whenever possible as this class will go away in future.
 * 
 * @version IFS 1.2 (Iterative Forward Search)<br>
 *          Copyright (C) 2006 - 2010 Tomas Muller<br>
 *          <a href="mailto:muller@unitime.org">muller@unitime.org</a><br>
 *          Lazenska 391, 76314 Zlin, Czech Republic<br>
 * <br>
 *          This library is free software; you can redistribute it and/or modify
 *          it under the terms of the GNU Lesser General Public License as
 *          published by the Free Software Foundation; either version 2.1 of the
 *          License, or (at your option) any later version. <br>
 * <br>
 *          This library is distributed in the hope that it will be useful, but
 *          WITHOUT ANY WARRANTY; without even the implied warranty of
 *          MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *          Lesser General Public License for more details. <br>
 * <br>
 *          You should have received a copy of the GNU Lesser General Public
 *          License along with this library; if not, write to the Free Software
 *          Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *          02110-1301 USA
 */
public class HashSet<E> extends java.util.HashSet<E> implements Collection<E> {
    private static final long serialVersionUID = -598578098308528933L;

    @Override
    @Deprecated
    public Enumeration<E> elements() {
        return new Enumeration<E>() {
            Iterator<E> iterator = iterator();

            @Override
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }
            
            @Override
            public E nextElement() {
                return iterator.next();
            }
        };
    }
}
