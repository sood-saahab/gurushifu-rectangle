package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven(){
        Rectangle rt=new Rectangle(4,5);
        int area=rt.area();
        assertThat(area,equalTo(20));

    }
}
