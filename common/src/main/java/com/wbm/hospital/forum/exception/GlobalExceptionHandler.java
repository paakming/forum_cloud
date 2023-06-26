package com.wbm.hospital.forum.exception;


import com.wbm.hospital.forum.commom.Code;
import com.wbm.hospital.forum.commom.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MyServiceException.class)
    public Result serviceExceptionHandle(MyServiceException serviceException){

        return Result.error(serviceException.getCode(),serviceException.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result exceptionHandle(Exception e){

        return Result.error(Code.ERROR.getCode(),e.getMessage());
    }
}
