package hippo.example.hst.mock.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="hstmockproject:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("hstmockproject:title");
    }
    
    public String getSummary() {
        return getProperty("hstmockproject:summary");
    }
    
    public Calendar getDate() {
        return getProperty("hstmockproject:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("hstmockproject:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("hstmockproject:image", HippoGalleryImageSetBean.class);
    }


}
