package com.jsh.erp.common.log;

import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author sunzhenghao
 */
public class WebTraceHandlerInterceptor extends HandlerInterceptorAdapter {

    public static final String TRACE_ID = "X-TraceId";

    public static Random random = new Random();


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        MDC.put(TRACE_ID, Long.toHexString(random.nextLong()));
        return true;
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);

        MDC.remove(TRACE_ID);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        MDC.remove(TRACE_ID);
    }
}
