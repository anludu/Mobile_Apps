package com.example.a01702080.example2;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        /*Toast toast = new Toast(context);
        toast .makeText(context, "closed", Toast.LENGTH_LONG).show();*/

        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Tittle");
        DialogConf.setMessage("Dialog's text");
        DialogConf.setIcon(R.mipmap.ic_launcher);


        DialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog myDialog = DialogConf.create();
        myDialog.show();

        AlertDialog.Builder SecondDialogConf = new AlertDialog.Builder(this);
        SecondDialogConf.setTitle("Confirmation Dialog");
        SecondDialogConf.setMessage("Dialog's text2 ");
        SecondDialogConf.setIcon(R.mipmap.ic_launcher);//prepare ICon

        SecondDialogConf.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer YEs.", Toast.LENGTH_LONG).show();
                    }
                });
        SecondDialogConf.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer Nope.", Toast.LENGTH_LONG).show();
                    }
                });
        SecondDialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "Close", Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog MySecondDialog = SecondDialogConf.create();
        MySecondDialog.show();

        AlertDialog.Builder ThirdDialogConf = new AlertDialog.Builder(this);
        ThirdDialogConf.setTitle("Confirmation Dialog");
        ThirdDialogConf.setMessage("Dialog's text3");
        ThirdDialogConf.setIcon(R.mipmap.ic_launcher);//prepare ICon

        final EditText TextInput = new EditText(context);
        TextInput.setTextColor(Color.BLUE);
        ThirdDialogConf.setView(TextInput);

        ThirdDialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        String str = TextInput.getEditableText().toString();
                        Toast.makeText(context, "You wrote this in the dialog: " + str, Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog MyThirdDialog = ThirdDialogConf.create();
        MyThirdDialog.show();

        int NOTIF_ID = 1234;

        Notification.Builder NotifBuilder = new Notification.Builder(this);
        NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotifBuilder.setContentTitle("Important Notification");
        NotifBuilder.setContentText("Details");

        /*Intent notificationIntent = new Intent(context, SecondActivity.class);
        notificationIntent.putExtra("mydData", "This string comes from the previous activity");
        PendingIntent contentIntent = PendingIntent.getActivities(context, 0, notificationIntent, 0);
        NotifBuilder.setContentIntent(contentIntent);*/

        NotificationManager MyNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        MyNotification.notify(NOTIF_ID, NotifBuilder.build());







    }


}
