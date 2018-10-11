package edu.fullerton.christine.transfertimecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double netSpeed;
    private double bps;
    private double fileSize;
    private double bytes;
    private double timeSeconds;
    private TextView time = (TextView) findViewById(R.id.labelTranTime);
/*    public void calcTime(View view){
        netSpeed = String.toDouble(speed.getText());
        bps = netSpeed * 1000000;
        fileSize = String.toDouble(size.getText());
        bytes = fileSize * 8 * Math.pow(2,20);
        timeSeconds = bytes / bps;
        time.setText(Double.toString(timeSeconds) + "Sec");
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText speed = findViewById(R.id.editSpeed);
        speed.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                netSpeed = Double.parseDouble(speed.getText().toString());
                bps = netSpeed * 1000000;
                timeSeconds = bytes / bps;
                time.setText(Double.toString(timeSeconds) + "Sec");
            }
        });

        final EditText size = findViewById(R.id.editFile);
        size.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                fileSize = Double.parseDouble(size.getText().toString());
                bytes = fileSize * 8 * Math.pow(2,20);
                timeSeconds = bytes / bps;
                time.setText(Double.toString(timeSeconds) + "Sec");
            }
        });
    }
}

