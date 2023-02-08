package co.develhope.interceptorsmiddleware1.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String userAgent = request.getHeader("User-Agent");
        System.out.println("User-Agent " + userAgent);
        return true;
    }


}
