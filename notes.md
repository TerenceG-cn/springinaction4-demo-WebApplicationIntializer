### DispatcherServlet 
前端控制器 front controller，它的任务是把请求发送给SpringMVC控制器。

### ContextLoaderListener

### WebApplicationInitializer
可以看做是Web.xml的替代，它是一个接口。通过实现WebApplicationInitializer，在其中可以添加servlet，listener等，在加载Web项目的时候会加载这个接口实现类，从而起到web.xml相同的作用。

### javax.servlet.ServletRegistration.Dynamic
```java
public interface ServletRegistration extends Registration {

    public Set<String> addMapping(String... urlPatterns);

    public Collection<String> getMappings();

    public String getRunAsRole();

    public static interface Dynamic
    extends ServletRegistration, Registration.Dynamic {
        public void setLoadOnStartup(int loadOnStartup);
        public Set<String> setServletSecurity(ServletSecurityElement constraint);
        public void setMultipartConfig(MultipartConfigElement multipartConfig);
        public void setRunAsRole(String roleName);
    }
}
```