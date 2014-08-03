package com.malmstein.testingarchitecture.test;

import android.view.View;

import com.malmstein.testingarchitecture.MainActivity;
import com.malmstein.testingarchitecture.R;
import com.malmstein.testingarchitecture.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
public class MyAndroidClassTest {

    @Test
    public void testWhenActivityCreatedHelloTextViewIsVisible() throws Exception {
        MainActivity activity = new MainActivity();

        ActivityController.of(activity).attach().create();

        int visibility = activity.findViewById(R.id.tv_hello_world).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}