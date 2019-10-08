package id.ac.poliban.mi.maya.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pasang event Listener dan Handler
        //Hubungkan masing2 view yang ingin dimanipulasi
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBisma);
        Button btBasudewa = findViewById(R.id.btBasudewa);

        //Pasang event Listener dan Handler
        //menggunaan kelas anonim yang menginplementasikan interface
        //View.OnclickListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Krisna, Advisor of Arjuna ", Toast.LENGTH_SHORT).show();
            }
        });

        btBisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Bisma dewa Bharata,the godfath of Hastina", Toast.LENGTH_SHORT).show();
            }
        });

        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Brother Of Krisna", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
