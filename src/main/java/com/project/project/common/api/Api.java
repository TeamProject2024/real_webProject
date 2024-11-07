package org.project.project.common.api;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.project.project.common.error.ErrorCodeIfs;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Api <T>{  // result, body 안에 들어가는 데이터 -> 제네릭 타입
    //{ result{} body{} } 괄호 -> Api
    private Result result;

    @Valid
    private T body;

    public static <T> Api<T> OK(T data){
        var api = new Api<T>();
        api.result = Result.OK();
        api.body =data;
        return api;
    }

    public static Api<Object> ERORR(Result result){
        var api = new Api<Object>();
        api.result = result;
        return api;
    }

    public static Api<Object> ERORR(ErrorCodeIfs errorCodeIfs){
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeIfs);
        return api;
    }

    public static Api<Object> ERORR(ErrorCodeIfs errorCodeIfs, Throwable tx){
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeIfs, tx);
        return api;
    }

    public static Api<Object> ERORR(ErrorCodeIfs errorCodeIfs, String descrpition){
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeIfs, descrpition);
        return api;
    }

}
