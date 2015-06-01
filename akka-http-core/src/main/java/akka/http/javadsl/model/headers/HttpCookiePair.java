/*
 * Copyright (C) 2009-2015 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.javadsl.model.headers;

/**
 * Represents a cookie pair as used in the `Cookie` header as specified in
 * http://tools.ietf.org/search/rfc6265#section-4.2.1
 */
public abstract class HttpCookiePair {
    public abstract String name();
    public abstract String value();

    /**
     * Converts this cookie pair into an HttpCookie to be used with the
     * `Set-Cookie` header.
     */
    public abstract HttpCookie toCookie();

    public static HttpCookiePair create(String name, String value) {
        return new akka.http.scaladsl.model.headers.HttpCookiePair(name, value);
    }
}
