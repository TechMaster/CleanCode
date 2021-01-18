package todolist.error;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof ServiceRuntimeException) {
            return handleServiceRuntimeException(response, (ServiceRuntimeException) ex);
        }
        return new ModelAndView();
    }

    private ModelAndView handleServiceRuntimeException(HttpServletResponse response, ServiceRuntimeException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(new MappingJackson2JsonView());
        modelAndView.addObject("errorCode", ex.getErrorCode());
        modelAndView.addObject("errorMessage", ex.getMessage());
        response.setStatus(ex.getHttpStatus().value());
        return modelAndView;
    }

}
