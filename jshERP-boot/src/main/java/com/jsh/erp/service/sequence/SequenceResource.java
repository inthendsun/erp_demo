package com.jsh.erp.service.sequence;

import com.jsh.erp.service.ResourceInfo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description
 *
 * @Author: jishenghua
 * @Date: 2021/3/16 16:33
 */
@ResourceInfo(value = "sequence")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SequenceResource {
}
