package io.github.kunalkene1797.passwordmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button register, login;
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.button);
        register = (Button)findViewById(R.id.button2);
        username = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText3);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent register = new Intent(LoginPage.this, RegisterPage.class);
                LoginPage.this.startActivity(register);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.length()==0 && password.length()==0) {
                    Toast.makeText(getBaseContext(), "ID/Password Can't Be Blank", Toast.LENGTH_SHORT).show();
                }
                else if(username.length()==0){
                    Toast.makeText(getBaseContext(), "Username Can't Be Blank", Toast.LENGTH_SHORT).show();
                }
                else if(password.length()==0){
                    Toast.makeText(getBaseContext(), "Password Can't Be Blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getBaseContext(), "Invalid ID/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
