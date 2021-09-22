package com.taou.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SongShengLin
 * @date 2021/9/22 1:47 下午
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private String userName;
    private String department;
    // 0-男，1-女
    private Integer sex;
    private Integer birthTime;
    private Boolean hireTime;
    private String level;
//    private Boolean isOldWorker;
}
