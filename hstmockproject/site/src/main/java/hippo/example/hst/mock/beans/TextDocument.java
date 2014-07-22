package hippo.example.hst.mock.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="hstmockproject:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("hstmockproject:title");
    }

    public String getSummary() {
        return getProperty("hstmockproject:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("hstmockproject:body");    
    }

}
