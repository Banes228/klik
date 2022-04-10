package com.example.click;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetUI();
    }
    private void resetUI() {
        ((TextView) findViewById(R.id.krug)).setText(counter.toString());
    }
    public void onClickBtnAddCakes(View view) {
        counter++;
        TextView counterView = findViewById(R.id.krug);
        counterView.setText(counter.toString());

    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Counter", counter);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Counter");
        resetUI();
    }

}