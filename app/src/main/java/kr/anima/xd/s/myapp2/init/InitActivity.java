package kr.anima.xd.s.myapp2.init;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;

import kr.anima.xd.s.myapp2.R;
import kr.anima.xd.s.myapp2.main.MainActivity;

public class InitActivity extends AppCompatActivity {

    final int SET_UP_APP=0;
    final long delayMillis=2500;
    private Timer timer=new Timer();
    private InitAsyncTask initAsyncTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_init);

        initAsyncTask=new InitAsyncTask();
        initAsyncTask.execute();
        try {

            if (initAsyncTask.get()) timer.schedule(main, delayMillis); // run Main activity after 2.5 sec
            else timer.schedule(password, delayMillis);// run Password activity after 2.5 sec

        } catch (InterruptedException e) { e.printStackTrace(); } catch (ExecutionException e) { e.printStackTrace();}

    }

    private TimerTask main=new TimerTask() {
        @Override
        public void run() {
            Intent intentGoToMain=new Intent(InitActivity.this, MainActivity.class);
            startActivity(intentGoToMain);
            finish();
        }
    };

    private TimerTask password=new TimerTask() {
        @Override
        public void run() {
            Intent intentGoToPassword=new Intent(InitActivity.this, MainActivity.class);
            startActivity(intentGoToPassword);
            finish();
        }
    };

}
