package edu.kishwaukeecollege.kishalert;
        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.view.View.OnClickListener;
        import android.widget.Toast;


        import java.util.Date;
//toast would be good to check and show and errors to users toast.maketect(getbasecontext,,,,)
public class TableData extends AppCompatActivity  {
    EditText nameofperson1,submit;
    String name ;
    Button reg;
    Context ctx = this;
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("creating", "something with bundle");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        nameofperson1 = (EditText) findViewById(R.id.nameforperson);
        reg = (Button) findViewById(R.id.subbutton);
        reg.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                name = nameofperson1.getText().toString();
                DatabaseOp db = new DatabaseOp(ctx);
                db.addInfo(db,name);
                Toast.makeText(getBaseContext(),"Registration Success",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
