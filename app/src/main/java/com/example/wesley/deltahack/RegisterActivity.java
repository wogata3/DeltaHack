package com.example.wesley.deltahack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button save = (Button) findViewById(R.id.Register);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveButtonPressed(view);
            }
        });
    }

    private void saveButtonPressed(View view) {
        LoginActivity.users.add(new User(((EditText)findViewById(R.id.Username)).getText().toString(),((EditText)findViewById(R.id.Password)).getText().toString()));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
