package com.totgor.config;

//import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getRootConfigClasses'");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getServletConfigClasses'");
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getServletMappings'");
        return new String[] {"/"};
    }
    
}
