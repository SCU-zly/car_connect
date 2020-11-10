package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btndata = (Button) findViewById(R.id.activity_map);
        btndata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_mapview);
            }
        });

    }
    public void showDialogMapView(View view){
        AlertDialog.Builder builderImport=new AlertDialog.Builder(this);
        final AlertDialog.Builder builderIknow=new AlertDialog.Builder(this);
        builderImport.setTitle("导入地图");
        builderIknow.setMessage("地图导入失败");
        builderImport.setPositiveButton("开始导入", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                AlertDialog dialogIknow=builderIknow.create();
                dialogIknow.show();

            }
        });
        AlertDialog dialogImport=builderImport.create();
        dialogImport.show();
    }
    public void showDataFalse(View view){
        AlertDialog.Builder builderData=new AlertDialog.Builder(this);
        builderData.setTitle("Error");
        builderData.setMessage("数据传输失败!");
        AlertDialog dialog=builderData.create();
        dialog.show();
    }
    public void showConnectedFalse(View view){
        AlertDialog.Builder builderCon=new AlertDialog.Builder(this);
        builderCon.setTitle("Error");
        builderCon.setMessage("小车连接已断开！");
        AlertDialog dialog=builderCon.create();
        dialog.show();
    }

}
