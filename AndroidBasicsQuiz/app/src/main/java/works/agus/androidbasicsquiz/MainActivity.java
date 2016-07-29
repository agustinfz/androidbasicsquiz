package works.agus.androidbasicsquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit (View view){
        int numCorrectAnswers = 0;

        if (isQ1Correct()){
            numCorrectAnswers++;
        }

        if (isQ2Correct()){
            numCorrectAnswers++;
        }

        Toast toast = Toast.makeText(getApplicationContext(), "You got "+numCorrectAnswers+" out of 2 correct", Toast.LENGTH_SHORT);
        toast.show();

    }

    private boolean isQ1Correct (){
        RadioButton q1 = (RadioButton) findViewById(R.id.relativeLayout);
        return q1.isChecked();
    }

    private boolean isQ2Correct(){
        boolean q2Answer;

        CheckBox q2A = (CheckBox) findViewById(R.id.q2ALayout);
        CheckBox q2B = (CheckBox) findViewById(R.id.q2BStyles);
        CheckBox q2C = (CheckBox) findViewById(R.id.q2CStrings);
        CheckBox q2D = (CheckBox) findViewById(R.id.q2Dimens);

        if (q2A.isChecked() && q2B.isChecked() && !q2C.isChecked() && !q2D.isChecked()){
            q2Answer = true;
            return q2Answer;
        }
        else {
            q2Answer = false;
            return q2Answer;
        }
    }

}
