package com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.function;

import javax.annotation.Generated;

/**
 * @author dnebinger
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}