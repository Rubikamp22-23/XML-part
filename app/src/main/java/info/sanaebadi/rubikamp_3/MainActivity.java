package info.sanaebadi.rubikamp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button= findViewById(R.id.button_test);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(MainActivity.this, "HEY RUBIKAMNPPPP!!", Toast.LENGTH_SHORT).show();
          }
      });
    }
}