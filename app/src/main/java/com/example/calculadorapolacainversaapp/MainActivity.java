package com.example.calculadorapolacainversaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText num1,num2,signo;
TextView res;
double ope;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.txtNum1);
        num2=findViewById(R.id.txtNum2);
        signo=findViewById(R.id.txtSigno);
        res=findViewById(R.id.lblTotal);
    }
    public void Procesar(View view){
        try{
            switch (signo.getText().toString().toUpperCase()){
                case "+":
                    ope=Double.parseDouble(num1.getText().toString())+Double.parseDouble(num2.getText().toString());
                    res.setText("El resultado de la suma: "+ope);
                    break;
                case "-":
                    ope=Double.parseDouble(num1.getText().toString())-Double.parseDouble(num2.getText().toString());
                    res.setText("El resultado de la resta: "+ope);
                    break;
                case "X":
                    ope=Double.parseDouble(num1.getText().toString())*Double.parseDouble(num2.getText().toString());
                    res.setText("El resultado de la multiplicación: "+ope);
                    break;
                case "/":
                    ope=Double.parseDouble(num1.getText().toString())/Double.parseDouble(num2.getText().toString());
                    res.setText("El resultado de la división: "+ope);
                    break;
                default:
                    res.setText("Signo inválido");
                    break;
            }
        }
        catch (Exception ex){
            Toast toast = Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}