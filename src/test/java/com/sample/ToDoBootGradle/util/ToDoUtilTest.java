package com.sample.ToDoBootGradle.util;

import com.sample.ToDoBootGradle.properties.ToDoApplicationProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ToDoUtilTest {
    @Mock
    ToDoApplicationProperties toDoApplicationProperties;

//    @Before
//    public void setup(){
//
//    }

   // @Test
    public void test_isCompletedTest(){
      //  given(toDoApplicationProperties.isShowCompletedTasks()).willReturn(null);
        ToDoUtil toDoUtil = new ToDoUtil(toDoApplicationProperties);
        assertThat(toDoUtil.isShowCompletedTasks()).isEqualTo(true);
    }

    @Test
    public void test_getApiKey(){
        given(toDoApplicationProperties.getApiKey()).willReturn(null);
        ToDoUtil toDoUtil = new ToDoUtil(toDoApplicationProperties);
        assertThat(toDoUtil.getApiKey()).isEqualTo(null);
    }
}
