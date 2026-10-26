package com.example.logowanie;


import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = findViewById(R.id.login);
        EditText haslo = findViewById(R.id.haslo);
        CheckBox zapamietaj = findViewById(R.id.zapamietaj);
        Button przycisk = findViewById(R.id.przycisk);

        przycisk.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Login: " + login.getText().toString()
                            + "\nZapamiętaj: " + zapamietaj.isChecked(),
                    Toast.LENGTH_LONG).show();
        });
    }
}
