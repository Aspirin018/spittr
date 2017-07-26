package spittr.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Created by liyu on 2017/7/25.
 * 扩展AbstractAnnotationConfigDispatcherServletInitializer的类会自动配置DispathcerServlet和spring应用上下文
 * 将DispathcherServlet配置在Servlet容器中
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {//将路径映射到DispatcherServlet上
        return new String[]{"/"};
    }
}
