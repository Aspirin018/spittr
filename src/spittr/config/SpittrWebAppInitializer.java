package spittr.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Created by liyu on 2017/7/25.
 * ��չAbstractAnnotationConfigDispatcherServletInitializer������Զ�����DispatcherServlet��springӦ��������
 * ����չAbstractAnnotationConfigDispatcherServletInitializer���ಿ������ʱ���������Զ���������������������servlet������
 * ��DispathcherServlet������Servlet������
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override//���ط�web����������м������ݲ�
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class};
    }

    @Override//������web��ص���������������������ӳ�䣬��ͼ��������
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    @Override//��·��ӳ�䵽dispatcherServlet
    protected String[] getServletMappings() {//��·��ӳ�䵽DispatcherServlet��
        return new String[]{"/"};
    }
}
