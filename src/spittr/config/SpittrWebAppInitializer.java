package spittr.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Created by liyu on 2017/7/25.
 * 扩展AbstractAnnotationConfigDispatcherServletInitializer的类会自动配置DispatcherServlet和spring应用上下文
 * 当扩展AbstractAnnotationConfigDispatcherServletInitializer的类部署到容器时，容器会自动发现它，并用它来配置servlet上下文
 * 将DispathcherServlet配置在Servlet容器中
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override//加载非web的组件，如中间层和数据层
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class};
    }

    @Override//加载与web相关的组件，如控制器，处理器映射，视图解析器等
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    @Override//将路径映射到dispatcherServlet
    protected String[] getServletMappings() {//将路径映射到DispatcherServlet上
        return new String[]{"/"};
    }
}
