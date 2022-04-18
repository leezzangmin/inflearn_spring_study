package hello.exception.servlet;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ServletExController {

    @GetMapping("/error-ex")
    public void errorEx() {
        throw new RuntimeException("예외1");
    }

    @GetMapping("/error-404")
    public void error404(HttpServletResponse r) throws IOException { //IOException은 메서드에 필요한 것...?
        r.sendError(404,"404오류");
    }
    @GetMapping("/error-400")
    public void error400(HttpServletResponse r) throws IOException { //IOException은 메서드에 필요한 것...?
        r.sendError(400,"400오류");
    }
}
