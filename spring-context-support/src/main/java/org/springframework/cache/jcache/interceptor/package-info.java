/**
 * AOP-based solution for declarative caching demarcation using JSR-107 annotations.
 *
 * <p>Strongly based on the infrastructure in org.springframework.cache.interceptor
 * that deals with Spring's caching annotations.
 *
 * <p>Builds on the AOP infrastructure in org.springframework.aop.framework.
 * Any POJO can be cache-advised with Spring.
 */
@NullMarked
package org.springframework.cache.jcache.interceptor;

import org.jspecify.annotations.NullMarked;
