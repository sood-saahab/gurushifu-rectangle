package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven(){
        Rectangle rt=new Rectangle(4.0,5.0);
        double area=rt.area();
        assertThat(area,is(closeTo(20.0,0.01)));

    }
}
