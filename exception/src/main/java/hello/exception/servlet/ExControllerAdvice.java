package hello.exception.servlet;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity catchException() {

        return new ResponseEntity("bad", HttpStatus.BAD_REQUEST);
    }

}
