package com.jerome.jeromeplatform.system.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    /**
     * 创建人
     */
    @Column
    private Integer createdBy;

    /**
     * 创建时间
     */
    @Column
    private LocalDateTime createdTime;

    /**
     * 修改人
     */
    @Column
    private Integer updatedBy;

    /**
     * 修改时间
     */
    @Column
    private LocalDateTime updatedTime;

    /**
     * 逻辑删除字段 0-未删除 1-已删除
     */
    @Column
    private Integer isDeleted;

    /**
     * 备注
     */
    @Column
    private String remark;
}
