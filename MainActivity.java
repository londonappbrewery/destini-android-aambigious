package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
      private  TextView storyText;
      private  Button bTop,bBottom;
      private   int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

          storyText= findViewById(R.id.storyTextView);
          bTop= findViewById(R.id.buttonTop);
          bBottom= findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
         bTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mStoryIndex= update1(mStoryIndex);

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bBottom.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mStoryIndex= update2(mStoryIndex);

            }
        });

    }
    public int update1(int mStoryIndex){
        if (mStoryIndex==1||mStoryIndex==2){
            storyText.setText(R.string.T3_Story);
            bTop.setText(R.string.T3_Ans1);
            bBottom.setText(R.string.T3_Ans2);
           return(3);
        }
        else
        {
            storyText.setText(R.string.T6_End);
            bTop.setVisibility(View.GONE);
            bBottom.setVisibility(View.GONE);
            return 0;

        }

    }
    public int update2(int mStoryIndex){

        if (mStoryIndex==1){
            storyText.setText(R.string.T2_Story);
            bTop.setText(R.string.T2_Ans1);
            bBottom.setText(R.string.T2_Ans2);
           return( mStoryIndex=2);
        }
        else if(mStoryIndex==2)
        {
            storyText.setText(R.string.T4_End);
            bTop.setVisibility(View.GONE);
            bBottom.setVisibility(View.GONE);
            return 0;

        }
        else{
            storyText.setText(R.string.T5_End);
            bTop.setVisibility(View.GONE);
            bBottom.setVisibility(View.GONE);
            return 0;
        }
    }
}
