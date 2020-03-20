package com.zrq.gmall.pms;

import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class CodeTest {
    @Test
    public void test1() {
        System.out.println( System.getProperty("user.dir"));
    }

    @Test
    public void testHashMap() {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put(null,"hash");
    }
}
