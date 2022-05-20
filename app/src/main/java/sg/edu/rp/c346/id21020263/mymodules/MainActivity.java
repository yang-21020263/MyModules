package sg.edu.rp.c346.id21020263.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView m1;
    TextView m2;
    TextView m3;
    TextView m4;
    TextView m5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = findViewById(R.id.module1);
        m2 = findViewById(R.id.module2);
        m3 = findViewById(R.id.module3);
        m4 = findViewById(R.id.module4);
        m5 = findViewById(R.id.module5);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayPage.class);
                intent.putExtra("modules", "Module Code: C203\nModule Name: Web AppIn Development in php\nAcademic Year: 2022\nSemester: 1\nModule Credit: 4\nVenue: W65H");
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayPage.class);
                intent.putExtra("modules", "Module Code: C235\nModule Name: IT Security and Management\nAcademic Year: 2022\nSemester: 1\nModule Credit: 4\nVenue: W65G");
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayPage.class);
                intent.putExtra("modules", "Module Code: C218\nModule Name: UI/UX Design for Apps\nAcademic Year: 2022\nSemester: 1\nModule Credit: 4\nVenue: E66B");
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayPage.class);
                intent.putExtra("modules", "Module Code: C206\nModule Name: Software Development Process\nAcademic Year: 2022\nSemester: 1\nModule Credit: 4\nVenue: E66K");
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayPage.class);
                intent.putExtra("modules", "Module Code: C346\nModule Name: Mobile App Development\nAcademic Year: 2022\nSemester: 1\nModule Credit: 4\nVenue: E62E");
                startActivity(intent);
            }
        });
    }
}