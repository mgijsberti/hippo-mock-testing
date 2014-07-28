package hippo.example.hst.mock.components.stubs;

import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.component.HstURL;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class HstResponseStatusCodeStub implements HstResponse {

    private int status;

    @Override
    public HstURL createRenderURL() {
        return null;
    }

    @Override
    public HstURL createNavigationalURL(String pathInfo) {
        return null;
    }

    @Override
    public HstURL createActionURL() {
        return null;
    }

    @Override
    public HstURL createResourceURL() {
        return null;
    }

    @Override
    public HstURL createResourceURL(String referenceNamespace) {
        return null;
    }

    @Override
    public HstURL createComponentRenderingURL() {
        return null;
    }

    @Override
    public String getNamespace() {
        return null;
    }

    @Override
    public void setRenderParameter(String key, String value) {

    }

    @Override
    public void setRenderParameter(String key, String[] values) {

    }

    @Override
    public void setRenderParameters(Map<String, String[]> parameters) {

    }

    @Override
    public Element createElement(String tagName) {
        return null;
    }

    @Override
    public Comment createComment(String comment) {
        return null;
    }

    @Override
    public void addHeadElement(Element element, String keyHint) {

    }

    @Override
    public List<Element> getHeadElements() {
        return null;
    }

    @Override
    public boolean containsHeadElement(String keyHint) {
        return false;
    }

    @Override
    public void setRenderPath(String renderPath) {

    }

    @Override
    public void setServeResourcePath(String serveResourcePath) {

    }

    @Override
    public void flushChildContent(String name) throws IOException {

    }

    @Override
    public List<String> getChildContentNames() {
        return null;
    }

    @Override
    public void sendRedirect(String location) throws IOException {

    }

    @Override
    public void sendError(int sc, String msg) throws IOException {

    }

    @Override
    public void sendError(int sc) throws IOException {

    }

    @Override
    public void setStatus(int sc) {
         this.status = sc;
    }

    public int getStatus(){
        return status;
    }

    @Override
    public void forward(String pathInfo) throws IOException {

    }

    @Override
    public void addCookie(Cookie cookie) {

    }

    @Override
    public void setWrapperElement(Element element) {

    }

    @Override
    public Element getWrapperElement() {
        return null;
    }

    @Override
    public void addPreamble(Comment comment) {

    }

    @Override
    public void addPreamble(Element element) {

    }

    @Override
    public boolean isRendererSkipped() {
        return false;
    }

    @Override
    public boolean containsHeader(String name) {
        return false;
    }

    @Override
    public String encodeURL(String url) {
        return null;
    }

    @Override
    public String encodeRedirectURL(String url) {
        return null;
    }

    @Override
    public String encodeUrl(String url) {
        return null;
    }

    @Override
    public String encodeRedirectUrl(String url) {
        return null;
    }

    @Override
    public void setDateHeader(String name, long date) {

    }

    @Override
    public void addDateHeader(String name, long date) {

    }

    @Override
    public void setHeader(String name, String value) {

    }

    @Override
    public void addHeader(String name, String value) {

    }

    @Override
    public void setIntHeader(String name, int value) {

    }

    @Override
    public void addIntHeader(String name, int value) {

    }

    @Override
    public void setStatus(int sc, String sm) {

    }

    @Override
    public String getCharacterEncoding() {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        return null;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return null;
    }

    @Override
    public void setCharacterEncoding(String charset) {

    }

    @Override
    public void setContentLength(int len) {

    }

    @Override
    public void setContentType(String type) {

    }

    @Override
    public void setBufferSize(int size) {

    }

    @Override
    public int getBufferSize() {
        return 0;
    }

    @Override
    public void flushBuffer() throws IOException {

    }

    @Override
    public void resetBuffer() {

    }

    @Override
    public boolean isCommitted() {
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void setLocale(Locale loc) {

    }

    @Override
    public Locale getLocale() {
        return null;
    }
}
