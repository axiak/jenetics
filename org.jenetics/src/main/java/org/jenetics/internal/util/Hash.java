/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics.internal.util;

import org.jenetics.util.Seq;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version 1.6 &mdash; <em>$Date$</em>
 * @since 1.6
 */
public interface Hash {

	public abstract Hash and(final boolean value);

	/**
	 * Add hash code for an {@code boolean} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final boolean[] values);

	/**
	 * Add hash code for a {@code byte}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final byte value);

	/**
	 * Add hash code for an {@code byte} arrays.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final byte[] values);

	/**
	 * Add hash code for a {@code char}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final char value);

	/**
	 * Add hash code for an {@code char} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final char[] values);

	/**
	 * Add hash code for a {@code short}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final short value);

	/**
	 * Add hash code for an {@code short} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final short[] values);

	/**
	 * Add hash code for an {@code int}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final int value);

	/**
	 * Add hash code for an {@code int} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final int[] values);

	/**
	 * Add hash code for a {@code long}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final long value);

	/**
	 * Add hash code for an {@code long} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final long[] values);

	/**
	 * Add hash code for a {@code float}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final float value);

	/**
	 * Add hash code for an {@code float} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final float[] values);

	/**
	 * Add hash code for a {@code double}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final double value);

	/**
	 * Add hash code for an {@code double} array.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final double[] values);

	/**
	 * Add hash code for a {@code Object}.
	 *
	 * @param value the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final Object value);

	/**
	 * Add hash code for an {@code Object}.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final Object[] values);

	/**
	 * Add hash code for a {@code Seq}.
	 *
	 * @param values the value to add to the hash code.
	 * @return {@code this}
	 */
	public abstract Hash and(final Seq<?> values);

	/**
	 * Return the calculated hash value.
	 *
	 * @return the calculated hash value.
	 */
	public int value();
}