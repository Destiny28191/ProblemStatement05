package sg.edu.rp.c346.id20022098.problemstatement05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowModuleActivity extends AppCompatActivity {

    TextView value, value1, value2, value3, value4, value5, value6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_module);

        value1 = findViewById(R.id.textView1);
        value2 = findViewById(R.id.textView2);
        value3 = findViewById(R.id.textView3);
        value4 = findViewById(R.id.textView4);
        value5 = findViewById(R.id.textView5);
        value6 = findViewById(R.id.textView6);

        Intent intentReceived = getIntent();
        String valueCode = intentReceived.getStringExtra("Code");
        value1.setText(valueCode);

        String valueName = intentReceived.getStringExtra("Name");
        value2.setText(valueName);

        String valueYear = intentReceived.getStringExtra("Year");
        value3.setText(valueYear);

        String valueSemester = intentReceived.getStringExtra("Semester");
        value4.setText(valueSemester);

        String valueCredit = intentReceived.getStringExtra("Credit");
        value5.setText(valueCredit);

        String valueVenue = intentReceived.getStringExtra("Venue");
        value6.setText(valueVenue);


    }
}