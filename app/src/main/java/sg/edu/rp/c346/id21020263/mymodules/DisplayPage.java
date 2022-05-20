package sg.edu.rp.c346.id21020263.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayPage extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);

        tvDisplay = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String information = intentReceived.getStringExtra("modules");
        tvDisplay.setText(information);
    }
}