package screencapt.com.fursa.myscreencapture;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Fursa Ilya on 24.02.2018.
 */

public class MyRecordApplication extends Application {

    private static MyRecordApplication application;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        application = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        startService(new Intent(this, ScreenCaptureService.class));
    }

    public static MyRecordApplication getInstance() {
        return application;
    }
}
