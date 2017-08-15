package com.asd_soft.assaduzzaman_noor.groboties;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final ImageView imageView = (ImageView)findViewById(R.id.imageView);

        final Animation zoomin = AnimationUtils.loadAnimation(this, R.anim.zoomin);

        imageView.startAnimation(zoomin);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PlayActivity.this,TurtleActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
