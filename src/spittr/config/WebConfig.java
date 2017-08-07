package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by liyu on 2017/7/25.
 */
@Configuration
@EnableWebMvc //启用spring mvc
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter{
    @Bean //配置视图解析器
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override //对静态资源的请求转发到默认的servlet,而不是DispatcherServlet
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();;
    }
}
