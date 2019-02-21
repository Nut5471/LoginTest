package sdu.cs.wikrom.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    //Explicit
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ผูกตัวแปรบน Java กับ xml
        TextView nameTextView = findViewById(R.id.tvNameLogin);

        //รับค่าตัวแปร Name จากการ Intent
        getNameString = getIntent().getStringExtra("Name");
        nameTextView.setText("Welcome,"+getNameString + "เข้าสู่ระบบ");
    }//end onCreate

}//end class
