package com.android.mue.batterystatus;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
    //broadcast class is used as a nested class
    private BroadcastReceiver mbcr=new BroadcastReceiver()
    {
        //onReceive method will receive updates
        public void onReceive(Context c, Intent i)
        {
            //initially level has 0 value
            //after getting update from broadcast receiver
            //it will change and give battery status
            int level=i.getIntExtra("level", 0);
            //initialize all objects
            ProgressBar pb=(ProgressBar)findViewById(R.id.progressBar1);
            TextView tv=(TextView)findViewById(R.id.textView1);
            //set level of progress bar
            pb.setProgress(level);
            //display level on text view
            tv.setText("Batterylevel:"+Integer.toString(level)+"%");
            //start a song when the battery level touches 100%
            if(level==100)
            {
                try
                {
                    //Save small.mp4 in assets folder
                    //we can not start a media file from the drawable folder directly in broadcast method
                    //hence we used the assets folder    }
}
