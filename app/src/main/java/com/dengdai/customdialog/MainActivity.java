package com.dengdai.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomDialog.Builder builder = new CustomDialog.Builder(MainActivity.this);
        builder.setMessage("自定义提示框");
        builder.setTitle("提示");
        builder.setPositiveButton("确定", (dialog, which) -> {
            dialog.dismiss();
            Toast.makeText(MainActivity.this,"queding",Toast.LENGTH_LONG).show();
        });
        builder.setNegativeButton("取消",
                (dialog, which) -> {
                    Toast.makeText(MainActivity.this,"quexiao",Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                });
        builder.create().show();

    }
}