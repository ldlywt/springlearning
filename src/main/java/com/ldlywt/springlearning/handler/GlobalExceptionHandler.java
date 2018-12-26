package com.ldlywt.springlearning.handler;

import com.ldlywt.springlearning.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理类
 * 
 * @author xiangze
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result<Object> exceptionHandler(HttpServletRequest req, Exception e) throws Exception {
		return Result.FailedResult(e.getMessage());
	}

}