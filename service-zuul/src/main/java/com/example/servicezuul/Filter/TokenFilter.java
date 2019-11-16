package com.example.servicezuul.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter {
    //四种类型：pre,routing,error,post
    //pre：主要用在路由映射的阶段是寻找路由映射表的
    //routing:具体的路由转发过滤器是在routing路由器，具体的请求转发的时候会调用
    //error:一旦前面的过滤器出错了，会调用error过滤器。
    //post:当routing，error运行完后才会调用该过滤器，是在最后阶段的
    @Override
    public String filterType() {
        //fiterType,有pre、route、post、error四种类型，分别代表路由前、路由时
        //路由后以及异常时的过滤器
        return FilterConstants.PRE_TYPE;
    }

    ////排序，指定相同filterType时的执行顺序，越小越优先执行，这里指定顺序为路由过滤器的顺序-1，即在路由前执行
    @Override
    public int filterOrder() {
        return 0;
    }

    //控制过滤器生效不生效，可以在里面写一串逻辑来控制
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //执行过滤逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getHeader("X-Authentication");
        if (StringUtils.isEmpty(token)) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.setResponseBody("unAuthrized");

            return null;
        }
        //校验token正确性
        return null;
    }
}
