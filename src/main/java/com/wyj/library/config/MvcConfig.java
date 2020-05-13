package com.wyj.library.config;

import com.wyj.library.Interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //注册连接器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/main")
                .excludePathPatterns("/x-admin/**");
    }

//    //放行静态资源
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
//    }



    //    @Bean
//    public WebMvcConfigurer webMvcConfigurer(){
//        WebMvcConfigurer configurer = new WebMvcConfigurer() {
//            //注册连接器
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/loginForm","/404","/login");
//            }
//
//            //放行静态资源
//            @Override
//            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//            }
//
//        };
//        return configurer;
//    }

}
