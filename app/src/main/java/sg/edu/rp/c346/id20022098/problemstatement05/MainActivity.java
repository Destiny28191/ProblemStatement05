package sg.edu.rp.c346.id20022098.problemstatement05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnC346, btnC218, btnC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC346 = findViewById(R.id.buttonC346);
        btnC218 = findViewById(R.id.buttonC218);
        btnC235 = findViewById(R.id.buttonC235);

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModuleActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });

        btnC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModuleActivity.class);
                intent.putExtra("Code", "C218");
                intent.putExtra("Name", "UI/UX Design for Apps");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W64G");
                startActivity(intent);

            }
        });

        btnC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModuleActivity.class);
                intent.putExtra("Code", "C235");
                intent.putExtra("Name", "IT Security And Management");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W67L");
                startActivity(intent);

            }
        });
    }
}