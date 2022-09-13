package com.felixwc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.Map;

/**
 * in order to learn java!
 * created at 2022/9/6 22:32
 *
 * @author felixwc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResultVo {
    private Map<String, Object> data;
    private Integer code;
    private String message;
    private Date date;

    public static ResultVo success() {
        return new ResultVo()
                .setCode(0)
                .setMessage(Message.OK.getMessage())
                .setDate(new Date());
    }

    @AllArgsConstructor
    @Getter
    public static enum Message {
        OK("ok");
        private String message;
    }
}
