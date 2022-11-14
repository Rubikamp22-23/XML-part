package info.sanaebadi.rubikamp_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppCompatButton appCompatButton = findViewById(R.id.button_login);
        appCompatButton.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
        });
    }
}