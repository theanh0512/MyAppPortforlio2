package pham.ultimatefit.myappportfolio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        Toast.makeText(this,"This button will launch my "+((Button)view).getText().toString()+" app!",Toast.LENGTH_SHORT).show();
    }
    public void openAppOnClick(View view){
        showToast(view);
    }
}
