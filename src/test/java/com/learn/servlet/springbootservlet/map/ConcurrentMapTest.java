
/*
 * <p>文件名称: ConcurrentMapTest</p>
 * <p>项目描述: KOCA 金证云原生平台 V1.0.0</p>
 * <p>公司名称: 深圳市金证科技股份有限公司</p>
 * <p>版权所有: 版权所有(C)2019-2020</p>
 */

package com.learn.servlet.springbootservlet.map;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * <p>一句话功能简述.</p>
 * <p>功能详细描述</p>
 *
 * @author zhangchao2
 * @version 1.0.0
 * @since 1.0.0, 2019/10/21
 */
public class ConcurrentMapTest {
    private Map<String, CopyOnWriteArraySet<String>> principals = new ConcurrentHashMap<>();

    @Test
    public void testPutIfAbsent(){
        Set<String> sessionsUsedByPrincipal = principals.computeIfAbsent("aa", key -> new CopyOnWriteArraySet<>());
        System.out.println(sessionsUsedByPrincipal);

        CopyOnWriteArraySet testSet = new CopyOnWriteArraySet<>();
        testSet.add("cc");
        principals.put("bb", testSet);
        Set<String> sessionsUsedByPrincipal2 = principals.computeIfAbsent("bb", key -> new CopyOnWriteArraySet<>());
        System.out.println(sessionsUsedByPrincipal2);

    }
}
