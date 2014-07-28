package hippo.example.hst.mock.components;

import hippo.example.hst.mock.components.stubs.HstResponseStatusCodeStub;
import hippo.example.hst.mock.components.stubs.ResolvedSiteMapItemStub;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.hippoecm.hst.core.request.ResolvedSiteMapItem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

/**
 * Test class for {@link hippo.example.hst.mock.components.Detail}
 */
@RunWith(MockitoJUnitRunner.class)
public class DetailTest {
    /**
     * Why using a spy - partial mocking  ?
     *
     * The request attribute is set, which is a void setter. If you not use a spy, you have to mock
     * the request.setAttribute("document", doc) method. By using a spy, the "REAL" method is called on the partial mock
     * which allows you to ignore implementation details of the object under test.
     *
     *
     * See
     * - http://stackoverflow.com/questions/14689348/mocking-a-spy-method-with-mockito?rq=1
     * - http://docs.mockito.googlecode.com/hg/org/mockito/Mockito.html#13
     * - http://blog.james-carr.org/2010/04/22/mockito-spy-annotation/
     * - http://tutorials.jenkov.com/java-unit-testing/servlet-testing.html
     * - http://monkeyisland.pl/2009/01/13/subclass-and-override-vs-partial-mocking-vs-refactoring/
     */

    @Spy
    private Detail component = new Detail();

    @Mock
    private Detail mockComponent = new Detail();

    @Mock
    private HstRequest request;

    @Mock
    private HstRequestContext hstRequestContext;

    @Mock
    private HstResponse response;

    @Mock
    private HippoBean hippoBean;

    @Mock
    private ResolvedSiteMapItem resolvedSiteMapItem;

    private ResolvedSiteMapItemStub resolvedSiteMapItemStub;

    private  HstResponseStatusCodeStub hstResponseStatusCodeStub;

    @Before
    public void setUp() throws Exception {
        doReturn(hstRequestContext).when(request).getRequestContext();
        resolvedSiteMapItemStub = new ResolvedSiteMapItemStub("test");
        hstResponseStatusCodeStub = new HstResponseStatusCodeStub();
    }

    /**
     *
     * If the content bean is found, the bean is set on the request attribute "document".
     *
     * If you use the spy, you do not need to set the request attribute, because the real method is called.
     * This test will fail if you change the in the doBeforeRender method the name of attribute "document"
     * into another value (for example "document2").
     *
     * @throws Exception
     */
    @Test
    public void doBeforeRenderFoundBeanUseSpy() throws Exception {
        doReturn(hippoBean).when(hstRequestContext).getContentBean();
        component.doBeforeRender(request, response);
        verify(request).setAttribute("document", hippoBean);
    }


    /**
     *
     * If the content bean is found, the bean is set on the request attribute "document".
     * If you use the mock, you have to set the request attribute.
     *
     * This test is obsolete because it will always be succesfull,
     * even if you change the in the doBeforeRender the name of attribute "document" into "document2".
     *
     * @throws Exception
     */
    @Test
    public void doBeforeRenderFoundBeanUseMock() throws Exception {
        doReturn(hippoBean).when(hstRequestContext).getContentBean();
        request.setAttribute("document", hippoBean);
        mockComponent.doBeforeRender(request, response);
        verify(request).setAttribute("document", hippoBean);
    }

    /**
     *
     * If the content bean is null, the request attribute "document" is null.
     *
     * You cannot verify the response status, because the HstResponse interface does not has a public method
     * for retrieving the response status
     *
     * @throws Exception
     */
    @Test
    public void doBeforeRenderMissingBeanSpy() throws Exception {
        doReturn(null).when(hstRequestContext).getContentBean();
        doReturn(resolvedSiteMapItem).when(hstRequestContext).getResolvedSiteMapItem();
        doReturn("news").when(resolvedSiteMapItem).getRelativeContentPath();
        component.doBeforeRender(request, response);
        doReturn("news").when(resolvedSiteMapItem).getPathInfo();
        assertNull(request.getAttribute("document"));
    }
    /**
     *
     * If the content bean is null, the request attribute "document" is null.
     *
     * If you use a stub for the resolvedSiteMapItem, you do not need to mock the
     * relativeContentPath and pathInfo methods.
     *
     * If you inject a stub of the response, you can check the response status.
     * The stub has a getter of the response status
     *
     * @throws Exception
     */
    @Test
    public void doBeforRenderMissingBeanStubResponse() throws Exception {
        doReturn(null).when(hstRequestContext).getContentBean();
        doReturn(resolvedSiteMapItemStub).when(hstRequestContext).getResolvedSiteMapItem();
        component.doBeforeRender(request, hstResponseStatusCodeStub);
        assertNull(request.getAttribute("document"));
        assertEquals(hstResponseStatusCodeStub.getStatus(),HttpServletResponse.SC_NOT_FOUND);
    }

}
