package com.example.tom.guessthenumber;

import android.app.Activity;
import android.content.Intent;
public class themeUtils {
    private static int cTheme;
    public final static int BLACK = 0;
    public final static int BLUE = 1;
    public static void changeToTheme(Activity activity, int theme) {
        cTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    public static void onActivityCreateSetTheme(Activity activity) {
        switch (cTheme) {
            default:
            case BLACK:
                activity.setTheme(R.style.blackTheme);
                break;
            case BLUE:
                activity.setTheme(R.style.blueTheme);
                break;

        }
    }

}
