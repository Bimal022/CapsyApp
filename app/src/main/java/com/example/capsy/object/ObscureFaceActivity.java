package com.example.capsy.object;

import androidx.camera.core.CameraSelector;

import com.example.capsy.helpers.MLVideoHelperActivity;
import com.example.capsy.helpers.vision.VisionBaseProcessor;
import com.example.capsy.helpers.vision.obscure.ObscureFaceProcessor;
import com.example.capsy.helpers.vision.obscure.ObscureType;

public class ObscureFaceActivity extends MLVideoHelperActivity {

    private ObscureFaceProcessor obscureFaceProcessor;

    @Override
    protected VisionBaseProcessor setProcessor() {
        obscureFaceProcessor = new ObscureFaceProcessor(graphicOverlay);
        obscureFaceProcessor.setObscureType(ObscureType.TRANSLUCENT);
        return obscureFaceProcessor;
    }

    @Override
    protected int getLensFacing() {
        return CameraSelector.LENS_FACING_FRONT;
    }
}
