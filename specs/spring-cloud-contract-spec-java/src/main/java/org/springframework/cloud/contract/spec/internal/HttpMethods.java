/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.contract.spec.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Contains Http Methods.
 *
 * @author Marcin Grzejszczak
 * @author Tim Ysewyn
 * @since 1.0.2
 */
public final class HttpMethods {

	private static final Log log = LogFactory.getLog(HttpMethods.class);

	public HttpMethods() {
		log.warn("WARNING: HttpMethods shouldn't be instantiated. Use its static methods instead.");
	}

	/**
	 * The HTTP {@code GET} method.
	 */
	public static String GET = "GET";

	/**
	 * The HTTP {@code HEAD} method.
	 */
	public static String HEAD = "HEAD";

	/**
	 * The HTTP {@code POST} method.
	 */
	public static String POST = "POST";

	/**
	 * The HTTP {@code PUT} method.
	 */
	public static String PUT = "PUT";

	/**
	 * The HTTP {@code PATCH} method.
	 */
	public static String PATCH = "PATCH";

	/**
	 * The HTTP {@code DELETE} method.
	 */
	public static String DELETE = "DELETE";

	/**
	 * The HTTP {@code OPTIONS} method.
	 */
	public static String OPTIONS = "OPTIONS";

	/**
	 * The HTTP {@code TRACE} method.
	 */
	public static String TRACE = "TRACE";

	/**
	 * @return {@code GET}.
	 * @deprecated Replaced by {@code HttpMethods.GET}.
	 */
	@Deprecated
	public HttpMethod GET() {
		return HttpMethod.GET;
	}

	/**
	 * @return {@code HEAD}.
	 * @deprecated Replaced by {@code HttpMethods.HEAD}.
	 */
	@Deprecated
	public HttpMethod HEAD() {
		return HttpMethod.HEAD;
	}

	/**
	 * @return {@code POST}.
	 * @deprecated Replaced by {@code HttpMethods.POST}.
	 */
	@Deprecated
	public HttpMethod POST() {
		return HttpMethod.POST;
	}

	/**
	 * @return {@code PUT}.
	 * @deprecated Replaced by {@code HttpMethods.PUT}.
	 */
	@Deprecated
	public HttpMethod PUT() {
		return HttpMethod.PUT;
	}

	/**
	 * @return {@code PATCH}.
	 * @deprecated Replaced by {@code HttpMethods.PATCH}.
	 */
	@Deprecated
	public HttpMethod PATCH() {
		return HttpMethod.PATCH;
	}

	/**
	 * @return {@code DELETE}.
	 * @deprecated Replaced by {@code HttpMethods.DELETE}.
	 */
	@Deprecated
	public HttpMethod DELETE() {
		return HttpMethod.DELETE;
	}

	/**
	 * @return {@code OPTIONS}.
	 * @deprecated Replaced by {@code HttpMethods.OPTIONS}.
	 */
	@Deprecated
	public HttpMethod OPTIONS() {
		return HttpMethod.OPTIONS;
	}

	/**
	 * @return {@code TRACE}.
	 * @deprecated Replaced by {@code HttpMethods.TRACE}.
	 */
	@Deprecated
	public HttpMethod TRACE() {
		return HttpMethod.TRACE;
	}

	public enum HttpMethod {

		GET(HttpMethods.GET), HEAD(HttpMethods.HEAD), POST(HttpMethods.POST), PUT(HttpMethods.PUT), PATCH(
				HttpMethods.PATCH), DELETE(HttpMethods.DELETE), OPTIONS(HttpMethods.OPTIONS), TRACE(HttpMethods.TRACE),;

		private final String methodName;

		HttpMethod(String methodName) {
			this.methodName = methodName;
		}

		public String getMethodName() {
			return methodName;
		}

	}

}
