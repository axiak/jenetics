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

import org.jenetics.util.HashCodeBuilder;
import org.jenetics.util.Seq;

/**
 * Interface for building hash codes. The HashCodeBuilder is created via a
 * factory method in the {@link org.jenetics.util.object} class.
 * <p/>
 * Example for calculating the hash code for a given class:
 * [code]
 * \@Override
 * public int hashCode() {
 *     return object.hashCodeOf(getClass())
 *                  .and(_prop1)
 *                  .and(_prop2).value();
 * }
 * [/code]
 *
 * @see org.jenetics.util.object#hashCodeOf(Class)
 *
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version 1.6 &mdash; <em>$Date$</em>
 * @since 1.6
 */
public abstract class HashBuilder {

	public static Hash of(final Class<?> type) {
		return new DefaultHashCodeBuilder(type);
	}

}
