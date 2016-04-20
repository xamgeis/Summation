package com.example.omnipotent.summation.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
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

    EditText text1, text2;
    TextView textSum;
    public void test_first() {
        mainActivity = getActivity();
        int n1 , n2, sum;



        text1 = (EditText) mainActivity.findViewById(R.id.num1);
        text2 = (EditText) mainActivity.findViewById(R.id.num2);
        textSum = (TextView) mainActivity.findViewById(R.id.sum);

        //text1.setText("1",TextView.BufferType.EDITABLE);
        //text2.setText("2",TextView.BufferType.EDITABLE);

        n1 = Integer.parseInt(text1.getText().toString());
        n2 = Integer.parseInt(text2.getText().toString());

//        textSum.setText("3");
        sum = Integer.parseInt(textSum.getText().toString());

        assertEquals( sum, mainActivity.sum(n1,n2));
    }

}