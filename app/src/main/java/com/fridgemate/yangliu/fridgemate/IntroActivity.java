package com.fridgemate.yangliu.fridgemate;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.fridgemate.yangliu.fridgemate.authentication.LoginActivity;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
//import static android.graphics.Color.*;

public class IntroActivity extends AppIntro2 {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
//            setDoneText("Log In");
//            setSkipText("Skip");

            addSlide(AppIntroFragment.newInstance("Welcome"
                    ,"Here's a quick intro.", R.drawable.icon1, Color.BLACK));

            addSlide(AppIntroFragment.newInstance("Content List"
                    ,"Everything in your fridge is online, synchronized with everyone who uses your fridge.", R.drawable.intro1, Color.BLACK));

            addSlide(AppIntroFragment.newInstance("Put stuff in your fridge"
                    ,"Click the + Button to put stuff in your fridge. \n", R.drawable.intro2, Color.BLACK));

            addSlide(AppIntroFragment.newInstance("Remove stuff from your fridge"
                    ,"Swipe left to remove things in your fridge. \n", R.drawable.intro2_5, Color.BLACK));

            addSlide(AppIntroFragment.newInstance("Need cooking advice? \nSure!"
                    ,"FridgeMate recommends you recipes based on what you have in your fridge", R.drawable.intro3, Color.BLACK));


            addSlide(AppIntroFragment.newInstance("Fridge? Friends?"
                    ,"Invite friends to your \"fridge family\". \n Get realtime updates from your fridge mates.", R.drawable.intro4, Color.BLACK));

            addSlide(AppIntroFragment.newInstance("Need a reminder about what to buy?"
                    , "Of course, your shopping list.", R.drawable.intro5, Color.BLACK));

            // Instead of fragments, you can also use our default slide
            // Just set a title, description, background and image. AppIntro will do the rest.
            addSlide(AppIntroFragment.newInstance("Welcome to FridgeMate.", "Enjoy! - C.O.O.L", R.drawable.icon1, Color.BLACK));
            // OPTIONAL METHODS
            // Override bar/separator color.
//        setBarColor(parseColor("#8c9497"));
//        setSeparatorColor(parseColor("#f3f4f2"));

            // Hide Skip/Done button.-
            showSkipButton(true);
            setProgressButtonEnabled(true);
        }
        catch(OutOfMemoryError e){
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
            setResult(CLOSE_ALL);
            finish();
        }

//        // Turn vibration on and set intensity.
//        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
//        setVibrate(true);
//        setVibrateIntensity(30);
    }

    final int CLOSE_ALL = 23333;

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
        setResult(CLOSE_ALL);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
        setResult(CLOSE_ALL);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
}

//https://github.com/apl-devs/AppIntro