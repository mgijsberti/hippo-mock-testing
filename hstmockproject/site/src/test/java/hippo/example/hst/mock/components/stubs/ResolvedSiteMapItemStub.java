package hippo.example.hst.mock.components.stubs;

import org.hippoecm.hst.configuration.components.HstComponentConfiguration;
import org.hippoecm.hst.configuration.sitemap.HstSiteMapItem;
import org.hippoecm.hst.core.request.ResolvedMount;
import org.hippoecm.hst.core.request.ResolvedSiteMapItem;

import java.util.Properties;
import java.util.Set;


public class ResolvedSiteMapItemStub implements ResolvedSiteMapItem {
    private String stubValue;

    public ResolvedSiteMapItemStub(String stubValue) {
        this.stubValue = stubValue;
    }

    @Override
    public ResolvedMount getResolvedMount() {
        return null;
    }

    @Override
    public String getRelativeContentPath() {
        return stubValue;
    }

    @Override
    public String getPathInfo() {
        return stubValue;
    }

    @Override
    public String getPageTitle() {
        return null;
    }

    @Override
    public String getParameter(String name) {
        return null;
    }

    @Override
    public String getLocalParameter(String name) {
        return null;
    }

    @Override
    public Properties getParameters() {
        return null;
    }

    @Override
    public Properties getLocalParameters() {
        return null;
    }

    @Override
    public HstSiteMapItem getHstSiteMapItem() {
        return null;
    }

    @Override
    public String getNamedPipeline() {
        return null;
    }

    @Override
    public int getStatusCode() {
        return 0;
    }

    @Override
    public int getErrorCode() {
        return 0;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public Set<String> getRoles() {
        return null;
    }

    @Override
    public Set<String> getUsers() {
        return null;
    }

    @Override
    public HstComponentConfiguration getHstComponentConfiguration() {
        return null;
    }
}
