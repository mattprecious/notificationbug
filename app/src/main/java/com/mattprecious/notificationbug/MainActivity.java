package com.mattprecious.notificationbug;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Notification notification1 = new Notification.Builder(this) //
        .setContentTitle("Title 1") //
        .setContentText("Body 1") //
        .setSmallIcon(R.drawable.one) //
        .setGroup("group") //
        .build();

    Notification notification2 = new Notification.Builder(this) //
        .setContentTitle("Title 2") //
        .setContentText("Body 2") //
        .setSmallIcon(R.drawable.two) //
        .setGroup("group") //
        .build();

    Notification notification3 = new Notification.Builder(this) //
        .setContentTitle("Summary title") //
        .setContentText("Summary text") //
        .setSmallIcon(R.drawable.three) //
        .setGroup("group") //
        .setGroupSummary(true) //
        .build();

    NotificationManager notificationManager = getSystemService(NotificationManager.class);
    notificationManager.notify(1, notification1);
    notificationManager.notify(2, notification2);
    notificationManager.notify(3, notification3);
  }
}
