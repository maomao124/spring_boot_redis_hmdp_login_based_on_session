package mao.spring_boot_redis_hmdp.config;

import mao.spring_boot_redis_hmdp.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Project name(项目名称)：spring_boot_redis_hmdp_login_based_on_session
 * Package(包名): mao.spring_boot_redis_hmdp.config
 * Class(类名): SpringMvcConfiguration
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/12
 * Time(创建时间)： 21:27
 * Version(版本): 1.0
 * Description(描述)： spring mvc拦截器配置
 */

@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //添加拦截器
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
        // 添加配置可以放行哪些路径
        interceptorRegistration.excludePathPatterns(
                "/shop/**",
                "/voucher/**",
                "/shop-type/**",
                "/upload/**",
                "/blog/hot",
                "/user/code",
                "/user/login"
        );
    }
}



