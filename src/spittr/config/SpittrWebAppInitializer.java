package spittr.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Created by liyu on 2017/7/25.
 * ��չAbstractAnnotationConfigDispatcherServletInitializer������Զ�����DispathcerServlet��springӦ��������
 * ��DispathcherServlet������Servlet������
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
    protected String[] getServletMappings() {//��·��ӳ�䵽DispatcherServlet��
        return new String[]{"/"};
    }
}
