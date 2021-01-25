package com.jihan.javastudycode.week9;

import java.io.Serializable;

public interface ErrorCode extends Serializable {

    /**
     * 에러 코드를 돌려준다.
     * @return
     */
    String getCode();

    /**
     * 다국어 메세지 코드를 돌려준다.
     * @return
     */
    String getMsgCode();

    boolean isEqual(String code);

    boolean isEqual(ErrorCode errorCode);

}
