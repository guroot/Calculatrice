package com.example.fletch.calculatrice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fletch.calculatrice2.model.Calculateur;

public class MainActivity extends AppCompatActivity {

    private int[] buttons = {R.id.button_0,R.id.button_1,R.id.button_2,R.id.button_3,
            R.id.button_4,R.id.button_5,R.id.button_6,R.id.button_7,R.id.button_8,
            R.id.button_9,R.id.button_division,R.id.button_multiplication,
            R.id.button_soustraction,R.id.button_addition,R.id.button_point,
            R.id.button_egal};

    private Calculateur model = new Calculateur();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0;i<buttons.length;i++){
            findViewById(buttons[i]).setOnClickListener(new listener());
        }

    }

    private class listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            TextView formule = findViewById(R.id.textView_formule);

            if(formule.getText().toString().equals("0")){
                formule.setText("");
            }

            switch (((Button)v).getText().toString()){
                case "=" :
                    model.setFormule(formule.getText().toString());
                    formule.setText(Double.toString(model.calculer()));
                    break;
                default:
                    formule.setText(formule.getText().toString() + ((Button)v).getText().toString());
            }
        }
    }
}
