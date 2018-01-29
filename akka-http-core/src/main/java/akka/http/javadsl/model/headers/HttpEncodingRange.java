/*
 * Copyright (C) 2009-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.javadsl.model.headers;

import akka.http.scaladsl.model.headers.HttpEncodingRange$;

/**
 * @see HttpEncodingRanges for convenience access to often used values.
 */
public abstract class HttpEncodingRange {
    public abstract float qValue();
    public abstract boolean matches(HttpEncoding encoding);

    public abstract HttpEncodingRange withQValue(float qValue);

    public static HttpEncodingRange create(HttpEncoding encoding) {
        return HttpEncodingRange$.MODULE$.apply((akka.http.scaladsl.model.headers.HttpEncoding) encoding);
    }

    /**
     * @deprecated because of troublesome initialisation order (with regards to scaladsl class implementing this class).
     *             In some edge cases this field could end up containing a null value.
     *             Will be removed in Akka HTTP 11.x, use {@link HttpEncodingRanges#ALL} instead.
     */
    @Deprecated
    public static final HttpEncodingRange ALL = akka.http.scaladsl.model.headers.HttpEncodingRange.$times$.MODULE$;
}
