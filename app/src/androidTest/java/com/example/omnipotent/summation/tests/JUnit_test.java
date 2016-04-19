package com.example.omnipotent.summation.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.omnipotent.summation.MainActivity;
import com.example.omnipotent.summation.R;

/**
 * Created by Omnipotent on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        int n1 , n2, sum;

        EditText text1 = (EditText) mainActivity.findViewById(R.id.num1);
        EditText text2 = (EditText) mainActivity.findViewById(R.id.num2);
        TextView textSum = (TextView) mainActivity.findViewById(R.id.sum);

        n1 = Integer.parseInt(text1.toString());
        n2 = Integer.parseInt(text2.toString());

        sum = Integer.parseInt(textSum.toString());
        assertEquals(n1+n2,sum);
    }

}