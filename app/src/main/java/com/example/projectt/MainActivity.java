package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.projectt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'projectt' library on application startup.
    static {
        System.loadLibrary("projectt");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method


    }

    /**
     * A native method that is implemented by the 'projectt' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}