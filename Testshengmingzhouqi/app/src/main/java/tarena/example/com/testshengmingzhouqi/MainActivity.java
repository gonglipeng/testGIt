package tarena.example.com.testshengmingzhouqi;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("sssssssssssssssss", "onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("sssssssssssssssss", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sssssssssssssssss", "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("sssssssssssssssss", "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("sssssssssssssssss", "onSaveInstanceState1");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e("sssssssssssssssss", "onSaveInstanceState2");
        Log.e("hhhhhhhhhhhhhhhhh", Thread.currentThread().getName());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("sssssssssssssssss", "onConfigurationChanged");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sssssssssssssssss", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("sssssssssssssssss", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("sssssssssssssssss", "onStop");
    }

    public void doClick(View view){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("sssssssssssssssss", "onDestroy");
    }
}
