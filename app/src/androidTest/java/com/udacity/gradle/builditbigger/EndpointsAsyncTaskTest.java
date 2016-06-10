package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import org.mockito.Mock;

/**
 * Created by Tarun on 10/06/2016.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    MainActivityFragment.EndpointsAsyncTask task;
    String result;
    @Mock
    Context mContext;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        result = null;
    }
}
