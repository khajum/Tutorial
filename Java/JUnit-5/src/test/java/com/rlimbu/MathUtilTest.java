
package com.rlimbu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestReporter;

/**
 * @author Ram Limbu
 * @version 1.0
 * @since 2020-05-07
 */
@TestInstance(Lifecycle.PER_CLASS)
public class MathUtilTest {
    MathUtil mathUtil;
    TestInfo testInfo;
    TestReporter testReporter;
    
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        
        mathUtil = new MathUtil();
        testReporter.publishEntry("test");
    }

    @Test
    @Tag(value = "Math")
    @DisplayName("Test Addition")
    public void testAdd() {
       assertEquals(8, mathUtil.add(5, 3));
       
    }

    @Test
    public void testSubstract() {
        assertEquals(2, mathUtil.substract(5, 3));
    }
    
    @Test
    @Disabled
    public void testComputeCircleArea() {
        assertEquals(314.234, mathUtil.computeCircleArea(1));
    }
}

