package com.example.capsy.object;

import android.os.Bundle;

import com.example.capsy.helpers.MLVideoHelperActivity;
import com.example.capsy.helpers.vision.drowsiness.FaceDrowsinessDetectorProcessor;
import com.example.capsy.helpers.vision.VisionBaseProcessor;

public class DriverDrowsinessDetectionActivity extends MLVideoHelperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected VisionBaseProcessor setProcessor() {
        return new FaceDrowsinessDetectorProcessor(graphicOverlay);
    }
}
