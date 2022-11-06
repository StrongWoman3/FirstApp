package FirstApp.Training;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import FirstApp.Training.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  TextView textView = (TextView) findViewById(R.id.header);
      //  textView.setText("Hello Java");
      //  ConstraintLayout constraintlayout = new ConstraintLayout(this);

     //   TextView textView = new TextView(this);
     //   textView.setText("Hello android");
     //   textView.setTextSize(26);
//
     //   ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
     //           ConstraintLayout.LayoutParams.WRAP_CONTENT,
      //          ConstraintLayout.LayoutParams.WRAP_CONTENT);
      //  layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
       // layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
      //  layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
//textView.setLayoutParams(layoutParams);
//constraintlayout.addView(textView);
    //    setContentView(constraintlayout);

    }
}