package com.example.flic; // Replace this with your actual package name if different

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private int[] imageArray = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7};  // Add your images here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFlic = findViewById(R.id.button_flic);
        imageView = findViewById(R.id.imageView);

        buttonFlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the imageView and display a random image
                imageView.setVisibility(View.VISIBLE);

                // Pick a random image from the array
                Random random = new Random();
                int randomImage = imageArray[random.nextInt(imageArray.length)];

                // Set the image to imageView
                imageView.setImageResource(randomImage);
            }
        });
    }
}
