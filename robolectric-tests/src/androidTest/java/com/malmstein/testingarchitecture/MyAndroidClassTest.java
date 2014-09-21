package com.malmstein.testingarchitecture;

import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;

@Config(emulateSdk = 18)
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