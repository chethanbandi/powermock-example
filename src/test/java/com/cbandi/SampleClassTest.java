package com.cbandi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SampleClass.class)
public class SampleClassTest {

    @Test
    public void testStaticMock() throws Exception {
        mockStatic(SampleClass.class);
        when(SampleClass.method3(anyLong(), anyInt())).thenReturn(20);
        //when(SampleClass.class, "method3", anyLong(), anyInt()).thenCallRealMethod();
        when(SampleClass.class, "method1").thenCallRealMethod();
        when(SampleClass.class, "method2").thenCallRealMethod();
        SampleClass.method1();
    }
}