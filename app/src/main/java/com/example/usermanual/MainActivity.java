package com.example.usermanual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CardView userManualBtn, troubleShootBtn, learningMaterialsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setUpButtons();
    }

    private void setUpButtons() {
        userManualBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, UserManual.class));});
        troubleShootBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, Troubleshooting.class));});
        learningMaterialsBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, LearningMaterials.class));});
    }

    private void initWidgets() {
        userManualBtn = findViewById(R.id.userManual_CardView);
        troubleShootBtn = findViewById(R.id.troubleshoot_CardView);
        learningMaterialsBtn = findViewById(R.id.learningMaterials_CardView);
    }
}