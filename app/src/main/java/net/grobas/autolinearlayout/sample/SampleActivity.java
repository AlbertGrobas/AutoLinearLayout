package net.grobas.autolinearlayout.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import net.grobas.widget.AutoLinearLayout;


public class SampleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        AutoLinearLayout l = (AutoLinearLayout) findViewById(R.id.layout);
        AutoLinearLayout l2 = new AutoLinearLayout(this);
        l2.setOrientation(AutoLinearLayout.VERTICAL);
        l2.setGravity(Gravity.CENTER);

        for(int i = 0; i < 24; i++) {
            Button b = new Button(this);
            b.setText("child"+i);
            l2.addView(b, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) b.getLayoutParams();
            lp.gravity = Gravity.CENTER;
        }
        l.addView(l2);
    }
}
