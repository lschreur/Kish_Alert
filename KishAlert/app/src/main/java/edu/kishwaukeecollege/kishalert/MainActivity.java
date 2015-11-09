package edu.kishwaukeecollege.kishalert;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;




public class MainActivity extends AppCompatActivity {
    public int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView instructText = (TextView) findViewById(R.id.textView2);
        String Instructions[] = {"Step 2", "Step 3", "Step 4"};
        instructText.setText(Instructions[i]);
        if(i < Instructions.length -1) {
            i++;
        }else{
            Button mainButton = (Button) findViewById(R.id.button_text);
            Log.v("Testing ","Testing you got to the login button and screen");
            mainButton.setText("Login");
            mainButton.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    setContentView(R.layout.login);
                }
            });
        }


    }
}


