package sh.vitex.web.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * PageController to render page in server side.
 *
 * @since 1.0
 */
public interface PageController extends Controller {

    /**
     * @param request  HTTP request
     * @param response HTTP response
     * @return view path
     * @throws Throwable exception occurred
     */
    String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
