package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tarun on 10/06/2016.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    EndpointsAsyncTask task;
    String result;
    @Mock
    Context mContext;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        result = null;

        task = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String s) {
                //
            }
        };
    }

    public void testAsyncReturnType() {
        try {
            task.execute(mContext);
            result = task.get(10, TimeUnit.SECONDS);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Timed out!");
        }
    }
}
