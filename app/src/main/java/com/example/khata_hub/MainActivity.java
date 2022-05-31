package com.example.khata_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add,withdraw;
    private TextView amount,total_amt,Enter_amt,note;
    private EditText enter_amt,note_add;
    public static int value_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        withdraw = findViewById(R.id.withdraw);
        amount = findViewById(R.id.amount);
        total_amt = findViewById(R.id.total_amt);
        Enter_amt = findViewById(R.id.Enter_amt);
        note = findViewById(R.id.note);
        enter_amt = findViewById(R.id.enter_amt);
        note_add = findViewById(R.id.note_add);


        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Thanks for Adding the Money", Toast.LENGTH_SHORT).show();
                String s = enter_amt.getText().toString().trim();
                int value_add = Integer.parseInt(s);
                int tot = 0;
                tot = tot + value_add;
                amount.setText(""+tot);
            }
        });

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Money Have been Deducted", Toast.LENGTH_SHORT).show();
                String s = enter_amt.getText().toString().trim();
                int value_dedc = Integer.parseInt(s);
                int value_addon = value_dedc - value_add ;;
                amount.setText(""+value_addon);

            }
        });
    }
}
